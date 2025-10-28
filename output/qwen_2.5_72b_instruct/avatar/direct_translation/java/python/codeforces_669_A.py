
import sys

def main():
    n = int(sys.stdin.readline())
    solve(n)

def solve(n):
    print((n // 3) * 2 + (0 if n % 3 == 0 else 1))

if __name__ == "__main__":
    main()

