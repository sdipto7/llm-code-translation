
import sys

def main():
    n = int(sys.stdin.readline().strip())
    d = 0
    for _ in range(n):
        d += int(sys.stdin.readline().strip()) % 2
    print("YES" if d % 2 == 0 else "NO")

if __name__ == "__main__":
    main()

