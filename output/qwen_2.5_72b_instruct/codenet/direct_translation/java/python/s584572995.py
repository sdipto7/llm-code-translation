
MOD = 10**9 + 7

def modpow(x, y):
    if y == 0:
        return 1
    if y % 2 != 0:
        return x * modpow(x, y - 1) % MOD
    tmp = modpow(x, y // 2)
    return tmp * tmp % MOD

class FastScanner:
    def __init__(self, stream):
        import sys
        self.stream = stream
        self.buffer = sys.stdin.read()
        self.splitter = self.buffer.split()
        self.index = 0

    def next(self):
        if self.index >= len(self.splitter):
            raise Exception("EOF")
        result = self.splitter[self.index]
        self.index += 1
        return result

    def nextLine(self):
        import sys
        self.index = len(self.splitter)
        return sys.stdin.readline().rstrip('\n')

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return int(self.next())

    def nextDouble(self):
        return float(self.next())

    def nextIntArray(self, n):
        return [self.nextInt() for _ in range(n)]

    def nextLongArray(self, n):
        return [self.nextLong() for _ in range(n)]

def rec(v, parent, to, dp):
    res = 1
    for next in to[v]:
        if next == parent:
            continue
        res += rec(next, v, to, dp)
    dp[v] = res
    return res

def main():
    import sys
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
        mul = (modpow(2, a) - 1) * (modpow(2, b) - 1) % MOD
        mulsum += mul
        mulsum %= MOD
    cases = modpow(2, N)
    PN = (mulsum + (cases - 1 + MOD) % MOD) % MOD
    BN = N * modpow(2, N - 1) % MOD
    WN = (PN - BN + MOD) % MOD
    ans = WN * modpow(cases, MOD - 2)
    ans %= MOD
    print(ans)

if __name__ == "__main__":
    main()

