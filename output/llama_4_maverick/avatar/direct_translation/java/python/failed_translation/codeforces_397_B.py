
import sys

def main():
    input = sys.stdin.readline
    output = sys.stdout.write

    t = int(input())
    MOD = int(1e9 + 7)

    for _ in range(t):
        n = int(input())
        a = int(input())
        b = int(input())

        if n < a:
            output("No\n")
            continue

        if a == b:
            if n % a == 0:
                output("Yes\n")
            else:
                output("No\n")
            continue

        x = b // (b - a)

        if n > x * a:
            output("Yes\n")
            continue

        low = 1
        high = x + 1
        ans = 1

        while low <= high:
            mid = (low + high) // 2
            if mid * a < n:
                low = mid + 1
            else:
                ans = mid
                high = mid - 1

        if n > (ans - 1) * b and n < ans * a:
            output("No\n")
        else:
            output("Yes\n")

if __name__ == "__main__":
    main()

