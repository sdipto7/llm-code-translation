
import sys

def main():
    n, s = map(int, sys.stdin.readline().split())
    max_val = 0
    for _ in range(n):
        f, t = map(int, sys.stdin.readline().split())
        if max_val < f + t:
            max_val = f + t
    print(max(max_val, s))

if __name__ == "__main__":
    main()

