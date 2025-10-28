
import sys
import math
from functools import lru_cache

n = 0
a = []
dp = []

def solve():
    global n, a, dp
    n = int(input())
    a = list(map(int, input().split()))
    dp = [[[-1 for _ in range(n+1)] for _ in range(n+1)] for _ in range(n+1)]
    dp[0][0][0] = 0
    cnt = [0, 0, 0]
    for num in a:
        cnt[num-1] += 1
    ans = rec(cnt[0], cnt[1], cnt[2])
    print(ans)

@lru_cache(maxsize=None)
def rec(i, j, k):
    if dp[i][j][k] != -1:
        return dp[i][j][k]
    ret = 0
    p = (i + j + k) / n
    pi = i / n
    pj = j / n
    pk = k / n
    ret += 1 / p
    if i > 0:
        ret += (pi / p) * rec(i-1, j, k)
    if j > 0:
        ret += (pj / p) * rec(i+1, j-1, k)
    if k > 0:
        ret += (pk / p) * rec(i, j+1, k-1)
    dp[i][j][k] = ret
    return ret

def main():
    solve()

if __name__ == "__main__":
    main()

