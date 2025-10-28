
n, w_limit = map(int, input().split())

v = [0] * (n + 1)
w = [0] * (n + 1)

for i in range(1, n + 1):
    vi, wi = map(int, input().split())
    v[i] = vi
    w[i] = wi

dp = [[0] * (w_limit + 1) for _ in range(n + 1)]

for i in range(1, n + 1):
    dp[i] = dp[i-1].copy()
    current_w = w[i]
    current_v = v[i]
    for j in range(current_w, w_limit + 1):
        dp[i][j] = max(dp[i][j], dp[i-1][j - current_w] + current_v)

print(dp[n][w_limit])

