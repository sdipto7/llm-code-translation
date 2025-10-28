
import sys

def read_int():
    return int(sys.stdin.readline().strip())

def main():
    H = read_int()
    W = read_int()
    c = [[0 for _ in range(10)] for _ in range(10)]
    for i in range(10):
        values = list(map(int, sys.stdin.readline().strip().split()))
        for j in range(10):
            c[i][j] = values[j]
    min_values = [c[i][1] for i in range(10)]
    for _ in range(10):
        for i in range(10):
            for j in range(10):
                min_values[i] = min(min_values[i], c[i][j] + min_values[j])
    ans = 0
    for _ in range(H):
        values = list(map(int, sys.stdin.readline().strip().split()))
        for A in values:
            if A >= 0:
                ans += min_values[A]
    print(ans)

if __name__ == "__main__":
    main()

