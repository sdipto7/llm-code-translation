
MOD = int(1e9) + 7

def main():
    s = input().strip()
    cs = list(s)
    n = len(cs)
    dp = [[0] * 13 for _ in range(n + 1)]
    base = 1
    dp[0][0] = 1

    for i in range(n):
        if cs[n - 1 - i] == '?':
            for pre in range(13):
                for next in range(10):
                    dp[i + 1][(base * next + pre) % 13] += dp[i][pre]
                    dp[i + 1][(base * next + pre) % 13] %= MOD
        else:
            next = int(cs[n - 1 - i])
            for pre in range(13):
                dp[i + 1][(base * next + pre) % 13] += dp[i][pre]
                dp[i + 1][(base * next + pre) % 13] %= MOD
        base = (base * 10) % 13

    print(dp[n][5])

if __name__ == "__main__":
    main()

