
def atcoder_ABC129_E():
    import sys

    M = 1000000007
    s = sys.stdin.readline().strip()
    n = len(s)
    dp = [[0] * 2 for _ in range(n + 1)]
    dp[0][0] = 1

    for i in range(n):
        if s[i] == '0':
            dp[i + 1][0] = dp[i][0]
            dp[i + 1][1] = dp[i][1]
        else:
            dp[i + 1][1] = (dp[i][0] + dp[i][1]) % M

        if s[i] == '0':
            dp[i + 1][1] = (dp[i + 1][1] + (dp[i][1] * 2) % M) % M
        else:
            dp[i + 1][0] = (dp[i + 1][0] + (dp[i][0] * 2) % M) % M
            dp[i + 1][1] = (dp[i + 1][1] + (dp[i][1] * 2) % M) % M

    print((dp[n][0] + dp[n][1]) % M)

if __name__ == "__main__":
    atcoder_ABC129_E()

