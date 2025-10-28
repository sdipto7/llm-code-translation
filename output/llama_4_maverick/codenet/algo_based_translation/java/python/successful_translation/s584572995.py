
class FastScanner:
    def __init__(self, file):
        self.file = file
        self.buffer = []
        self.index = 0

    def next(self):
        if self.index >= len(self.buffer):
            self.buffer = self.file.readline().split()
            self.index = 0
        self.index += 1
        return self.buffer[self.index - 1]

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return int(self.next())

    def next_double(self):
        return float(self.next())

class Main:
    def __init__(self):
        self.mod = 10**9 + 7

    def modpow(self, x, y):
        if y == 0:
            return 1
        if y % 2 != 0:
            return x * self.modpow(x, y - 1) % self.mod
        tmp = self.modpow(x, y // 2)
        return tmp * tmp % self.mod

    def rec(self, v, parent, to, dp):
        res = 1
        for next_v in to[v]:
            if next_v == parent:
                continue
            res += self.rec(next_v, v, to, dp)
        dp[v] = res
        return res

    def solve(self, fs):
        N = fs.next_int()
        to = [[] for _ in range(N)]
        edges = []
        for _ in range(N - 1):
            A = fs.next_int() - 1
            B = fs.next_int() - 1
            to[A].append(B)
            to[B].append(A)
            edges.append((B, A))
        dp = [0] * N
        self.rec(0, -1, to, dp)
        mulsum = 0
        for e in edges:
            candidate1 = e[0]
            candidate2 = e[1]
            child = candidate1 if dp[candidate1] < dp[candidate2] else candidate2
            a = dp[child]
            b = N - a
            mul = (self.modpow(2, a) - 1) * (self.modpow(2, b) - 1) % self.mod
            mulsum = (mulsum + mul) % self.mod
        cases = self.modpow(2, N)
        PN = (mulsum + (cases - 1) % self.mod) % self.mod
        BN = N * self.modpow(2, N - 1) % self.mod
        WN = (PN - BN) % self.mod
        ans = WN * self.modpow(cases, self.mod - 2) % self.mod
        print(ans)

def main():
    import sys
    fs = FastScanner(sys.stdin)
    main_obj = Main()
    main_obj.solve(fs)

if __name__ == "__main__":
    main()

