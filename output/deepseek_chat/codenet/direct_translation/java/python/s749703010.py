
import sys
import math
from functools import lru_cache

class Pair:
    def __init__(self, a, b):
        self.l = a
        self.r = b

    def __str__(self):
        return f"{self.l} {self.r}"

memo = None
a = None
n = None

def dp(fliped, idx, msk):
    if msk == (1 << n) - 1:
        return 0
    if memo[fliped][idx][msk] != -1:
        return memo[fliped][idx][msk]
    x = bin(msk).count('1')
    ff = 0
    ans = math.inf
    for i in range(n):
        if (msk & (1 << i)) == 0:
            nf = x % 2
            if idx == n or a[fliped][idx] <= a[(nf + (ff % 2)) % 2][i]:
                ans = min(ans, ff + dp((nf + (ff % 2)) % 2, i, msk | 1 << i))
            ff += 1
        else:
            x -= 1
    memo[fliped][idx][msk] = ans
    return memo[fliped][idx][msk]

def main():
    global memo, a, n
    sc = Scanner(sys.stdin)
    pw = sys.stdout
    n = sc.nextInt()
    a = [[0] * n for _ in range(2)]
    for i in range(n):
        a[0][i] = sc.nextInt()
    for i in range(n):
        a[1][i] = sc.nextInt()
    memo = [[[-1 for _ in range(1 << n)] for _ in range(n + 1)] for _ in range(2)]
    ans = dp(0, n, 0)
    pw.write(str(-1 if ans >= 1e8 else ans) + '\n')
    pw.flush()

class Scanner:
    def __init__(self, f):
        self.br = f

    def next(self):
        while True:
            line = self.br.readline()
            if not line:
                break
            tokens = line.split()
            for token in tokens:
                yield token

    def nextInt(self):
        return int(next(self))

    def nextLong(self):
        return int(next(self))

    def nextLine(self):
        return self.br.readline()

    def nextDouble(self):
        return float(next(self))

if __name__ == "__main__":
    main()

