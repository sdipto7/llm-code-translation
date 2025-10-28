
import sys

data = list(map(int, sys.stdin.read().split()))
ptr = 0
n = data[ptr]
ptr += 1
v = data[ptr:ptr + n]
ptr += n
c = data[ptr:ptr + n]

dp = [0] * n
dp[0] = 0

for i in range(1, n):
    tmp = dp[i-1] + (v[i-1] - c[i-1])
    dp[i] = max(tmp, dp[i-1])

tmp = dp[-1] + (v[-1] - c[-1])
dp[-1] = max(tmp, dp[-1])

print(dp[-1])

