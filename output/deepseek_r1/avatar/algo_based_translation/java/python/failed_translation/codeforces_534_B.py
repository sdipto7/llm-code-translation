
import sys

v1, v2, t, d = map(int, sys.stdin.readline().split())

if t == 1:
    print(v1 + v2)
    sys.exit()

dp = [[-float('inf')] * 1150 for _ in range(t-1)]
dp[0][v1] = v1

for i in range(1, t-1):
    for j in range(1150):
        for x in range(d + 1):
            prev = j + x
            if prev < 1150:
                dp[i][j] = max(dp[i][j], dp[i-1][prev] + j)
        for x in range(d, -1, -1):
            prev = j - x
            if prev >= 0:
                dp[i][j] = max(dp[i][j], dp[i-1][prev] + j)

ans = -float('inf')
last_step = t-2
for j in range(1150):
    if abs(j - v2) <= d and dp[last_step][j] != -float('inf'):
        ans = max(ans, dp[last_step][j] + v2)

print(ans)

