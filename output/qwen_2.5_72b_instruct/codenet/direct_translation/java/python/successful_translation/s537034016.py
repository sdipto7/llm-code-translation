
import sys

mod = 1000000007

def dfs(s):
    if dp[s] != -1:
        return dp[s]

    ret = 0
    for i in range(s - 3, -1, -1):
        ret += dfs(i)
        ret %= mod
    dp[s] = ret
    return ret

s = int(sys.stdin.readline().strip())
dp = [-1] * (s + 1)
dp[0] = 1
print(dfs(s))

