
import sys
import math

mod = int(1e9) + 7

class FastScanner:
    def __init__(self, f):
        self.reader = f
        self.buffer = []
        self.token = 0

    def next(self):
        if self.token >= len(self.buffer):
            self.buffer = self.reader.readline().split()
            self.token = 0
        result = self.buffer[self.token]
        self.token += 1
        return result

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return int(self.next())

    def nextDouble(self):
        return float(self.next())

def rec(v, parent, to, dp):
    res = 1
    for next in to[v]:
        if next != parent:
            res += rec(next, v, to, dp)
    dp[v] = res
    return res

def modpow(x, y):
    if y == 0:
        return 1
    if y % 2 != 0:
        return x * modpow(x, y - 1) % mod
    tmp = modpow(x, y // 2)
    return tmp * tmp % mod

def main():
    fs = FastScanner(sys.stdin)
    N = fs.nextInt()
    to = [[] for _ in range(N)]
    edges = [[0, 0] for _ in range(N - 1)]
    for i in range(N - 1):
        A = fs.nextInt() - 1
        B = fs.nextInt() - 1
        to[A].append(B)
        to[B].append(A)
        edges[i][0] = B
        edges[i][1] = A
    dp = [0] * N
    rec(0, -1, to, dp)
    mulsum = 0
    for e in edges:
        candidate1 = e[0]
        candidate2 = e[1]
        child = candidate1 if dp[candidate1] > dp[candidate2] else candidate2
        a = dp[child]
        b = N - a
        mul = (modpow(2, a) - 1) * (modpow(2, b) - 1) % mod
        mulsum = (mulsum + mul) % mod
    cases = modpow(2, N)
    PN = (mulsum + (cases - 1 + mod) % mod) % mod
    BN = N * modpow(2, N - 1) % mod
    WN = (PN - BN + mod) % mod
    ans = WN * modpow(cases, mod - 2) % mod
    print(ans)

if __name__ == "__main__":
    main()

