
import sys

data = list(map(int, sys.stdin.read().split()))
ptr = 0
n = data[ptr]
ptr += 1

arr = []
for _ in range(n):
    row = data[ptr:ptr+3]
    ptr += 3
    arr.append(row)

dp = [[0] * 3 for _ in range(n)]
dp[0] = arr[0][:]

for i in range(1, n):
    for j in range(3):
        prev_max = max(dp[i-1][(j+1) % 3], dp[i-1][(j+2) % 3])
        dp[i][j] = arr[i][j] + prev_max

print(max(dp[-1]))

