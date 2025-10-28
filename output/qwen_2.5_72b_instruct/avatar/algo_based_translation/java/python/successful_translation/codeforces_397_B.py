import sys

def main():
    import sys
    import math
    from sys import stdin, stdout

    input = stdin.read().split()
    index = 0

    t = int(input[index])
    index += 1

    for _ in range(t):
        n = int(input[index])
        a = int(input[index + 1])
        b = int(input[index + 2])
        index += 3

        if n < a:
            stdout.write("No\n")
            continue

        if a == b:
            if n % a == 0:
                stdout.write("Yes\n")
            else:
                stdout.write("No\n")
            continue

        x = b // (b - a)

        if n > x * a:
            stdout.write("Yes\n")
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
            stdout.write("No\n")
        else:
            stdout.write("Yes\n")

if __name__ == "__main__":
    main()
