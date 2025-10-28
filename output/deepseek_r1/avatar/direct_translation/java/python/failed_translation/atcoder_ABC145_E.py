Here is the Python code translation:


n, T = map(int, input().split())
ab = [tuple(map(int, input().split())) for _ in range(n)]
ab.sort()
dp = [[0]*6001 for _ in range(n+1)]
for i in range(1, n+1):
    a, b = ab[i-1]
    for time_after in range(6001):
        dp[i][time_after] = dp[i-1][time_after]
        if 0 <= time_after - a < T:
            dp[i][time_after] = max(dp[i][time_after], dp[i-1][time_after - a] + b)
print(max(dp[n]))

