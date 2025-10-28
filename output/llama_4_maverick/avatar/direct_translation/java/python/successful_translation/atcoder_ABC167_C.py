
import sys

def main():
    input = sys.stdin.readline
    n, m, x = map(int, input().split())
    min_val = float('inf')
    a = [list(map(int, input().split())) for _ in range(n)]

    for i in range(1 << n):
        status = [0] * n
        for j in range(n):
            if (i >> j) & 1:
                status[j] = 1
        res = [0] * (m + 1)
        for j in range(n):
            if status[j] == 1:
                for k in range(m + 1):
                    res[k] += a[j][k]
        flag = True
        for j in range(1, m + 1):
            if res[j] < x:
                flag = False
                break
        if flag:
            min_val = min(min_val, res[0])

    if min_val == float('inf'):
        print(-1)
    else:
        print(min_val)

if __name__ == "__main__":
    main()

