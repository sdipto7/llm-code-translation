
import sys

MOD = 10**9 + 7

Si = sys.stdin.readline().strip()
S = Si[::-1]
dp = [0] * 13
dp[0] = 1
d = 1

for i in range(len(S)):
    c = S[i]
    nd = [0] * 13
    sys.stderr.write(f"d: {d}, i: {i}, S[i]: {c}\n")
    if c.isdigit():
        x = int(c) * d
        for j in range(13):
            ni = (j + x) % 13
            nd[ni] = dp[j]
    else:
        for xi in range(10):
            x_val = xi * d
            for j in range(13):
                ni = (j + x_val) % 13
                nd[ni] = (nd[ni] + dp[j]) % MOD
    sys.stderr.write(f"{nd}\n")
    dp = nd
    d = (d * 10) % 13

print(dp[5] % MOD)

