
import sys

MOD = 998244353

class AtcoderAGC046B:
    def __init__(self):
        self.dp = [[0] * 3001 for _ in range(3001)]

    def solve(self, sc, pw):
        A = int(sc.readline().strip())
        B = int(sc.readline().strip())
        C = int(sc.readline().strip())
        D = int(sc.readline().strip())

        self.dp[A][B] = 1

        for c in range(A, C + 1):
            for d in range(B, D + 1):
                if c == A and d == B:
                    continue
                ans = 0
                if c > A:
                    part = self.dp[c - 1][d]
                    ans += (part * d)
                if d > B:
                    part = self.dp[c][d - 1]
                    ans += (part * c)
                if c > A and d > B:
                    ans -= (self.dp[c - 1][d - 1] * (c - 1) * (d - 1))
                self.dp[c][d] = ((ans % MOD) + MOD) % MOD

        pw.write(f"{self.dp[C][D]}\n")

if __name__ == "__main__":
    sc = sys.stdin
    pw = sys.stdout
    solver = AtcoderAGC046B()
    solver.solve(sc, pw)

