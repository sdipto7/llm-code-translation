
import sys
import math

def main():
    input = sys.stdin.read().split()
    index = 0
    def next():
        nonlocal index
        result = input[index]
        index += 1
        return result

    def nextInt():
        return int(next())

    def nextLong():
        return int(next())

    def nextDouble():
        return float(next())

    def solve():
        t = 1
        while t > 0:
            n = nextLong()
            m = nextLong()
            if n == 0:
                print(0)
                t -= 1
                continue
            if n == m:
                print(0)
                t -= 1
                continue
            if n > m:
                n = m + n % m
                n -= m
                print(min(m - n, n))
                t -= 1
                continue
            print(min(m - n, n))
            t -= 1

    solve()

if __name__ == "__main__":
    main()

