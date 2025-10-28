
import sys

in_ = sys.stdin
out = sys.stdout
err = sys.stderr

Si = in_.readline().strip()
S = [char for char in reversed(Si)]

dp = [0] * 13
dp[0] = 1

d = 1
for i, c in enumerate(S):
    nd = [0] * 13
    d = d * 10 % 13

    if c.isdigit():
        x = (int(c) - 0) * d
        for j in range(13):
            nd[(j + x) % 13] = dp[j]
    else:
        for xi in range(10):
            x = xi * d
            for j in range(13):
                ni = (j + x) % 13
                nd[ni] = (nd[ni] + dp[j]) % 1000000007

    dp = nd

out.write(str(dp[5]) + '\n')

