
import sys
import math

def main():
    input = sys.stdin.read
    data = input().splitlines()
    n, d = map(int, data[0].split())
    cnt = 0

    for i in range(1, n + 1):
        x, y = map(int, data[i].split())
        if math.sqrt(x * x + y * y) <= d:
            cnt += 1

    print(cnt)

if __name__ == "__main__":
    main()

