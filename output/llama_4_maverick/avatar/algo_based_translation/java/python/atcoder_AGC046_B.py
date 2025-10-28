
MOD = 998244353
dp = [[0 for _ in range(3001)] for _ in range(3001)]

def solve(A, B, C, D):
    global dp
    dp[A][B] = 1
    for c in range(A, C + 1):
        for d in range(B, D + 1):
            if c == A and d == B:
                continue
            ans = 0
            if c > A:
                ans = (ans + dp[c-1][d] * d) % MOD
            if d > B:
                ans = (ans + dp[c][d-1] * c) % MOD
            if c > A and d > B:
                ans = (ans - dp[c-1][d-1] * (c-1) * (d-1)) % MOD
            dp[c][d] = (ans + MOD) % MOD
    return dp[C][D]

def main():
    A, B, C, D = map(int, input().split())
    print(solve(A, B, C, D))

if __name__ == "__main__":
    main()

