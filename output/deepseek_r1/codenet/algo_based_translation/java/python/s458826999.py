
MOD = 10**9 + 7
S = input().strip()

current_dp = [0] * 13
current_dp[0] = 1

for c in S:
    next_dp = [0] * 13
    if c == '?':
        for j in range(10):
            for k in range(13):
                rem = (k * 10 + j) % 13
                next_dp[rem] = (next_dp[rem] + current_dp[k]) % MOD
    else:
        j = int(c)
        for k in range(13):
            rem = (k * 10 + j) % 13
            next_dp[rem] = (next_dp[rem] + current_dp[k]) % MOD
    current_dp = next_dp

print(current_dp[5] % MOD)

