
import sys

def main():
    n = int(sys.stdin.readline())
    d = 0
    for i in range(n):
        num = int(sys.stdin.readline())
        d += num % 2
    print("YES" if d % 2 == 0 else "NO")

if __name__ == "__main__":
    main()

