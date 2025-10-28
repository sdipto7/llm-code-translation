
import sys
n = int(sys.stdin.readline())
dp = [0] * 200001
for i, x in enumerate(map(int, sys.stdin.readline().split())):
    dp[x] = i
ans = 0
for i in range(2, n + 1):
    ans += abs(dp[i] - dp[i - 1])
print(ans)

