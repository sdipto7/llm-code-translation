
MOD = 10**9 + 7
S = input().strip()
n = len(S)
dp = [[0] * 13 for _ in range(n + 1)]
dp[0][0] = 1

for i in range(n):
    c = S[i]
    next_dp = [0] * 13
    if c == '?':
        for digit in range(10):
            for k in range(13):
                rem = (k * 10 + digit) % 13
                next_dp[rem] = (next_dp[rem] + dp[i][k]) % MOD
    else:
        digit = int(c)
        for k in range(13):
            rem = (k * 10 + digit) % 13
            next_dp[rem] = (next_dp[rem] + dp[i][k]) % MOD
    dp[i+1] = next_dp

print(dp[n][5] % MOD)

