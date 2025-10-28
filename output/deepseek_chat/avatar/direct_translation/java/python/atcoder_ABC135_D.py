
MOD = 10**9 + 7
def main():
    cs = list(input())
    dp = [[0] * 13 for _ in range(len(cs))]
    base = 1
    for i in range(len(cs)):
        if cs[len(cs) - 1 - i] == '?':
            for pre in range(13):
                for next_digit in range(10):
                    dp[i][(base * next_digit + pre) % 13] += dp[i-1][pre] if i > 0 else (1 if pre == 0 else 0)
                    dp[i][(base * next_digit + pre) % 13] %= MOD
        else:
            next_digit = int(cs[len(cs) - 1 - i])
            for pre in range(13):
                dp[i][(base * next_digit + pre) % 13] += dp[i-1][pre] if i > 0 else (1 if pre == 0 else 0)
                dp[i][(base * next_digit + pre) % 13] %= MOD
        base = base * 10 % 13
    print(dp[-1][5])

if __name__ == "__main__":
    main()

