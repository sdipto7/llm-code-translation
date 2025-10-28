
mod = 10**9 + 7
s = int(input())
dp = [-1] * (s + 1)
dp[0] = 1

def dfs(s_val):
    if dp[s_val] != -1:
        return dp[s_val]
    ret = 0
    for i in range(s_val - 3, -1, -1):
        ret += dfs(i)
        ret %= mod
    dp[s_val] = ret
    return ret

print(dfs(s))

