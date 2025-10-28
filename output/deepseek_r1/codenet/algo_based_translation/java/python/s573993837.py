
import sys

def main():
    t = 1
    for _ in range(t):
        n, m = map(int, sys.stdin.readline().split())
        if n == 0 or n == m:
            print(0)
        elif n > m:
            rem = n % m
            print(min(rem, m - rem))
        else:
            print(min(n, m - n))

if __name__ == "__main__":
    main()

