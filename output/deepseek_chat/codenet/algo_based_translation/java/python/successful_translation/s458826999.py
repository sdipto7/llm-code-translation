
MOD = 1000000007

def main():
    S = input().strip()
    n = len(S)
    dp = [[0] * 13 for _ in range(n + 1)]
    dp[0][0] = 1
    
    for i in range(n):
        if S[i] == '?':
            for j in range(10):
                for k in range(13):
                    new_remainder = (k * 10 + j) % 13
                    dp[i + 1][new_remainder] = (dp[i + 1][new_remainder] + dp[i][k]) % MOD
        else:
            x = int(S[i])
            for k in range(13):
                new_remainder = (k * 10 + x) % 13
                dp[i + 1][new_remainder] = (dp[i + 1][new_remainder] + dp[i][k]) % MOD
    
    print(dp[n][5])

if __name__ == "__main__":
    main()

