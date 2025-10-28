
import sys

def main():
    input = sys.stdin.readline
    t = int(input())
    for _ in range(t):
        n, a, b = map(int, input().split())
        if n < a:
            print("No")
            continue
        if a == b:
            if n % a == 0:
                print("Yes")
            else:
                print("No")
            continue
        x = b // (b - a)
        if n > x * a:
            print("Yes")
            continue
        low, high, ans = 1, x + 1, 1
        while low <= high:
            mid = (low + high) // 2
            if mid * a < n:
                low = mid + 1
            else:
                ans = mid
                high = mid - 1
        if (ans - 1) * b < n < ans * a:
            print("No")
        else:
            print("Yes")

if __name__ == "__main__":
    main()

