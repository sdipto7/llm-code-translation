
n = int(input())
arr = [list(map(int, input().split())) for _ in range(n)]
dp = [row[:] for row in arr]
for i in range(1, n):
    for idx in range(3):
        if idx == 0:
            a, b = 1, 2
        elif idx == 1:
            a, b = 0, 2
        else:
            a, b = 0, 1
        dp[i][idx] = max(dp[i-1][a], dp[i-1][b]) + arr[i][idx]
print(max(dp[-1]))

