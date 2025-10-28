
import sys
from collections import defaultdict, deque
from heapq import heappop, heappush
from bisect import bisect_left, bisect_right

def main():
    input = sys.stdin.buffer.readline
    global MOD, MODF, INF
    MOD = 10 ** 9 + 7
    MODF = 10 ** 9 + 6.0
    INF = float('inf')
    eps = 1e-10

    n = ni()
    a = na(n)
    cnt = [0] * 3
    for i in a:
        cnt[i - 1] += 1
    dp = [[[0.0] * (n + 1) for _ in range(n + 1)] for _ in range(n + 1)]
    for i in range(n + 1):
        for j in range(n + 1):
            for k in range(n + 1):
                if i + j + k == 0:
                    continue
                p = i + j + k
                ret = 1.0 * n / p
                if i > 0:
                    ret += i / p * dp[i - 1][j][k]
                if j > 0:
                    ret += j / p * dp[i + 1][j - 1][k]
                if k > 0:
                    ret += k / p * dp[i][j + 1][k - 1]
                dp[i][j][k] = ret
    print(dp[cnt[0]][cnt[1]][cnt[2]])

def ni():
    return int(sys.stdin.buffer.readline())

def na(n):
    return list(map(int, sys.stdin.buffer.readline().split()))

def ns():
    return sys.stdin.buffer.readline().rstrip().decode('utf-8')

def nsl():
    return list(ns())

def nif():
    return float(sys.stdin.buffer.readline())

def naf(n):
    return list(map(float, sys.stdin.buffer.readline().split()))

def main2():
    try:
        main()
    except Exception as e:
        print(e)

if __name__ == '__main__':
    main2()

