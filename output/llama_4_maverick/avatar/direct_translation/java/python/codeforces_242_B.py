
import sys
INF = int(1e9 + 5)

def main():
    n = int(sys.stdin.readline().strip())
    a = []
    b = []
    left = INF
    right = 0
    for _ in range(n):
        x, y = map(int, sys.stdin.readline().strip().split())
        a.append(x)
        b.append(y)
        left = min(left, x)
        right = max(right, y)

    for i in range(n):
        if left == a[i] and right == b[i]:
            print(i + 1)
            return
    print(-1)

if __name__ == "__main__":
    main()

