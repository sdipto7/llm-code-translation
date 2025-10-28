
n = int(input())
v = [int(input()) for _ in range(n)]
c = [int(input()) for _ in range(n)]
dp = [0] * n
dp[0] = 0
for i in range(1, n):
    tmp = dp[i-1] + (v[i-1] - c[i-1])
    dp[i] = max(tmp, dp[i-1])
tmp = dp[-1] + (v[-1] - c[-1])
dp[-1] = max(tmp, dp[-1])
print(dp[-1])

