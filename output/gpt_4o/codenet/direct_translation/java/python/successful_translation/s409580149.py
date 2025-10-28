
import sys
import math
from functools import lru_cache

sys.setrecursionlimit(10**6)
mod = int(1e9 + 7)
eps = 1e-10
pi = math.pi
dinf = float('inf')
inf = int(1e9)
input = sys.stdin.read
data = input().split()

def ni():
    global data
    result = int(data.pop(0))
    return result

def na(n):
    global data
    result = [int(data.pop(0)) for _ in range(n)]
    return result

def solve():
    n = ni()
    a = na(n)
    dp = [[[-1.0 for _ in range(n+1)] for _ in range(n+1)] for _ in range(n+1)]
    dp[0][0][0] = 0.0
    cnt = [0, 0, 0]
    for i in range(n):
        cnt[a[i]-1] += 1
    ans = rec(cnt[0], cnt[1], cnt[2], dp, n)
    print(ans)

def rec(i, j, k, dp, n):
    if dp[i][j][k] != -1:
        return dp[i][j][k]
    ret = 0.0
    p = (i + j + k) / n
    pi = i / n
    pj = j / n
    pk = k / n
    ret += 1 / p
    if i > 0:
        ret += pi / p * rec(i - 1, j, k, dp, n)
    if j > 0:
        ret += pj / p * rec(i + 1, j - 1, k, dp, n)
    if k > 0:
        ret += pk / p * rec(i, j + 1, k - 1, dp, n)
    dp[i][j][k] = ret
    return ret

def main():
    solve()

if __name__ == "__main__":
    main()

