
import sys

def main():
    n = int(sys.stdin.readline())
    a = sum(int(sys.stdin.readline()) for _ in range(n))
    b = sum(int(sys.stdin.readline()) for _ in range(n - 1))
    c = sum(int(sys.stdin.readline()) for _ in range(n - 2))
    x = a - b
    y = b - c
    print(x)
    print(y)

if __name__ == "__main__":
    main()

