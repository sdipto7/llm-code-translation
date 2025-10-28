
n, m = map(int, input().split())
dp = [0] * (n + 2)
dp[n + 1] = 0
dp[n] = 1
blocked = set(int(input()) for _ in range(m))
for i in range(n - 1, -1, -1):
    if i in blocked:
        dp[i] = 0
    else:
        dp[i] = (dp[i + 1] + dp[i + 2]) % 1000000007
print(dp[0])

