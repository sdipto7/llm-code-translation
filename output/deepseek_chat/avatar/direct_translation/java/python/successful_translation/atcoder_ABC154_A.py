
import sys

def main():
    str = sys.stdin.readline().split()
    a, b = map(int, sys.stdin.readline().split())
    u = sys.stdin.readline().strip()
    print(f"{a-1} {b}" if u == str[0] else f"{a} {b-1}")

if __name__ == "__main__":
    main()

