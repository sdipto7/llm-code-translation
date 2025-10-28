
import sys
import math

def main():
    n, d = map(int, sys.stdin.readline().split())
    cnt = 0
    for _ in range(n):
        x, y = map(int, sys.stdin.readline().split())
        if math.sqrt(x**2 + y**2) <= d:
            cnt += 1
    print(cnt)

if __name__ == "__main__":
    main()

