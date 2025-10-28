
class Pair:
    def __init__(self, a, b):
        self.l = a
        self.r = b

    def __str__(self):
        return f'{self.l} {self.r}'

def count_set_bits(n):
    count = 0
    while n:
        count += n & 1
        n >>= 1
    return count

def dp(fliped, idx, msk):
    if msk == (1 << n) - 1:
        return 0
    if memo[fliped][idx][msk] != -1:
        return memo[fliped][idx][msk]
    x = count_set_bits(msk)
    ff = 0
    ans = float('inf')
    for i in range(n):
        if not (msk & (1 << i)):
            nf = x % 2
            if idx == n or a[fliped][idx] <= a[(nf + (ff % 2)) % 2][i]:
                ans = min(ans, ff + dp((nf + (ff % 2)) % 2, i, msk | (1 << i)))
            ff += 1
        else:
            x -= 1
    memo[fliped][idx][msk] = ans
    return ans

import sys
input = sys.stdin.readline
n = int(input())
a = [[0] * n for _ in range(2)]
a[0] = list(map(int, input().split()))
a[1] = list(map(int, input().split()))
memo = [[[-1 for _ in range(1 << n)] for _ in range(n + 1)] for _ in range(2)]
ans = dp(0, n, 0)
print(-1 if ans >= 1e8 else ans)

