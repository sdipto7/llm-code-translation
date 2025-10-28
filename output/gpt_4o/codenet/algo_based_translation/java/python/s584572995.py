
import sys
from collections import defaultdict
from functools import lru_cache

mod = int(1e9) + 7

class FastScanner:
    def __init__(self, file):
        self.reader = file
        self.tokenizer = None

    def next(self):
        if self.tokenizer is None or not self.tokenizer:
            self.tokenizer = self.reader.readline().split()
        return self.tokenizer.pop(0)

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return int(self.next())

def main():
    fs = FastScanner(sys.stdin)
    N = fs.nextInt()
    to = defaultdict(list)
    edges = []

    for _ in range(N - 1):
        A = fs.nextInt() - 1
        B = fs.nextInt() - 1
        to[A].append(B)
        to[B].append(A)
        edges.append((B, A))

    dp = [0] * N
    rec(0, -1, to, dp)

    mulsum = 0

    for e in edges:
        candidate1, candidate2 = e
        child = candidate1
        if dp[candidate1] > dp[candidate2]:
            child = candidate2

        a = dp[child]
        b = N - a

        mul = (modpow(2, a) - 1) * (modpow(2, b) - 1) % mod
        mulsum += mul
        mulsum %= mod

    cases = modpow(2, N)
    PN = (mulsum + (cases - 1 + mod) % mod) % mod
    BN = N * modpow(2, N - 1) % mod
    WN = (PN - BN + mod) % mod
    ans = WN * modpow(cases, mod - 2) % mod

    print(ans)

def rec(v, parent, to, dp):
    res = 1
    for next in to[v]:
        if next == parent:
            continue
        res += rec(next, v, to, dp)
    dp[v] = res
    return res

@lru_cache(None)
def modpow(x, y):
    if y == 0:
        return 1
    if y % 2 != 0:
        return x * modpow(x, y - 1) % mod
    tmp = modpow(x, y // 2)
    return tmp * tmp % mod

if __name__ == "__main__":
    main()

