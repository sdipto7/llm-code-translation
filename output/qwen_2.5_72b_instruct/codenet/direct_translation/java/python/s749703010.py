
import sys

class Pair:
    def __init__(self, a, b):
        self.l = a
        self.r = b

    def __str__(self):
        return f"{self.l} {self.r}"

def dp(fliped, idx, msk):
    if msk == (1 << n) - 1:
        return 0
    if memo[fliped][idx][msk] != -1:
        return memo[fliped][idx][msk]
    x = bin(msk).count('1')
    ff = 0
    ans = 1e9
    for i in range(n):
        if (msk & (1 << i)) == 0:
            nf = x % 2
            if idx == n or a[fliped][idx] <= a[(nf + (ff % 2)) % 2][i]:
                ans = min(ans, ff + dp((nf + (ff % 2)) % 2, i, msk | 1 << i))
            ff += 1
        else:
            x -= 1
    memo[fliped][idx][msk] = ans
    return ans

n = int(input().strip())
a = [[0] * n for _ in range(2)]
for i in range(n):
    a[0][i] = int(input().strip())
for i in range(n):
    a[1][i] = int(input().strip())
memo = [[[-1] * (1 << n) for _ in range(n + 1)] for _ in range(2)]
ans = dp(0, n, 0)
print(-1 if ans >= 1e8 else ans)

