
s = int(input())
mod = 10**9 + 7
dp = [-1] * (s + 1)
dp[0] = 1

def dfs(n):
    if dp[n] != -1:
        return dp[n]
    res = 0
    for i in range(n - 3, -1, -1):
        res += dfs(i)
        res %= mod
    dp[n] = res
    return res

print(dfs(s))

