
MOD = 10**9 + 7
s = input().strip()
cs = list(s[::-1])
n = len(cs)
dp = [[0]*13 for _ in range(n)]
base = 1
for i in range(n):
    current_char = cs[i]
    current_dp = [0]*13
    if current_char == '?':
        for pre in range(13):
            contribution = dp[i-1][pre] if i > 0 else (1 if pre == 0 else 0)
            if contribution == 0:
                continue
            for d in range(10):
                new_rem = (base * d + pre) % 13
                current_dp[new_rem] = (current_dp[new_rem] + contribution) % MOD
    else:
        d = int(current_char)
        for pre in range(13):
            contribution = dp[i-1][pre] if i > 0 else (1 if pre == 0 else 0)
            new_rem = (base * d + pre) % 13
            current_dp[new_rem] = (current_dp[new_rem] + contribution) % MOD
    dp[i] = current_dp
    base = (base * 10) % 13
print(dp[-1][5] % MOD)

