
import sys

class AtcoderAGC046B:
    def __init__(self):
        self.MOD = 998244353
        self.dp = [[0] * 3001 for _ in range(3001)]

    def solve(self):
        import sys
        input = sys.stdin.read().split()
        A = int(input[0])
        B = int(input[1])
        C = int(input[2])
        D = int(input[3])
        self.dp[A][B] = 1
        for c in range(A, C + 1):
            for d in range(B, D + 1):
                if c == A and d == B:
                    continue
                ans = 0
                if c > A:
                    part = self.dp[c - 1][d]
                    ans = (part * d)
                if d > B:
                    part = self.dp[c][d - 1]
                    ans = (ans + (part * c))
                if c > A and d > B:
                    ans = (ans - (self.dp[c - 1][d - 1] * (c - 1) * (d - 1)))
                self.dp[c][d] = ((ans % self.MOD) + self.MOD) % self.MOD
        print(self.dp[C][D])

def main():
    problem = AtcoderAGC046B()
    problem.solve()

if __name__ == "__main__":
    main()

