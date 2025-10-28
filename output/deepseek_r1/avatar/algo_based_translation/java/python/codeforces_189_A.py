
n, a, b, c = map(int, input().split())
arr = [a, b, c]
maxn = 4010
dp = [0] * maxn

for i in range(n):
    dp[i] = float('-inf')
dp[0] = 0

for ribbon in arr:
    for j in range(ribbon, maxn):
        dp[j] = max(dp[j], dp[j - ribbon] + 1)

print(dp[n])

