import sys

s = sys.stdin.read().split()
n = int(s[0])
v = [0] * n
c = [0] * n
dp = [0] * n

for i in range(n):
    dp[i] = 0
for i in range(n):
    v[i] = int(s[i + 1])
for i in range(n):
    c[i] = int(s[i + n + 1])

dp[0] = 0

for i in range(1, n):
    tmp = dp[i - 1] + (v[i - 1] - c[i - 1])
    dp[i] = tmp if tmp > dp[i - 1] else dp[i - 1]

tmp = dp[n - 1] + (v[n - 1] - c[n - 1])
dp[n - 1] = tmp if tmp > dp[n - 1] else dp[n - 1]

print(dp[n - 1])
