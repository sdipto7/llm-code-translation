MOD = 998244353
dp = [[0] * 3001 for _ in range(3001)]

def solve(sc, pw):
    A = int(sc.readline())
    B = int(sc.readline())
    C = int(sc.readline())
    D = int(sc.readline())
    dp[A][B] = 1
    for c in range(A, C + 1):
        for d in range(B, D + 1):
            if c == A and d == B:
                continue
            ans = 0
            if c > A:
                part = dp[c - 1][d]
                ans = (part * d)
            if d > B:
                part = dp[c][d - 1]
                ans = (ans + (part * c))
            if c > A and d > B:
                ans = (ans - (dp[c - 1][d - 1] * (c - 1) * (d - 1)))
            dp[c][d] = ((ans % MOD) + MOD) % MOD
    pw.write(str(dp[C][D]) + '\n')

if __name__ == "__main__":
    import sys
    sc = sys.stdin
    pw = sys.stdout
    solve(sc, pw)
