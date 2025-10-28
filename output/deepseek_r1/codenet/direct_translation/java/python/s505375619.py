
n = int(input())
v = list(map(int, input().split()))
c = list(map(int, input().split()))
dp = [0] * n
for i in range(1, n):
    tmp = dp[i-1] + (v[i-1] - c[i-1])
    dp[i] = max(tmp, dp[i-1])
tmp = dp[-1] + (v[-1] - c[-1])
dp[-1] = max(tmp, dp[-1])
print(dp[-1])

