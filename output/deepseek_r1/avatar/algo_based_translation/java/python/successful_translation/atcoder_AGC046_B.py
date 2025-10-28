
MOD = 998244353

def main():
    A, B, C, D = map(int, input().split())
    dp = [[0] * 3002 for _ in range(3002)]
    dp[A][B] = 1
    for c in range(A, C + 1):
        for d in range(B, D + 1):
            if c == A and d == B:
                continue
            ans = 0
            if c > A:
                ans += dp[c-1][d] * d
            if d > B:
                ans += dp[c][d-1] * c
            if c > A and d > B:
                ans -= dp[c-1][d-1] * (c-1) * (d-1)
            dp[c][d] = (ans % MOD + MOD) % MOD
    print(dp[C][D])

if __name__ == "__main__":
    main()

