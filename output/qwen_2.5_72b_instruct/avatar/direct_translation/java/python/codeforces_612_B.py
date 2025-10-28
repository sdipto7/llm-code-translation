
import sys

input = sys.stdin.read
data = input().split()

n = int(data[0])
dp = [0] * 200001

index = 1
for i in range(n):
    dp[int(data[index])] = i
    index += 1

ans = 0
for i in range(2, n + 1):
    ans += abs(dp[i] - dp[i - 1])

print(ans)

