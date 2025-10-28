
class Main:
    def calculateDP(self, S):
        MOD = 1000000007
        dp = [[0] * 13 for _ in range(len(S) + 1)]
        dp[0][0] = 1
        for i in range(len(S)):
            if S[i] == '?':
                for j in range(10):
                    for k in range(13):
                        dp[i + 1][(k * 10 + j) % 13] = (dp[i + 1][(k * 10 + j) % 13] + dp[i][k]) % MOD
            else:
                x = int(S[i])
                for k in range(13):
                    dp[i + 1][(k * 10 + x) % 13] = (dp[i + 1][(k * 10 + x) % 13] + dp[i][k]) % MOD
        return dp[len(S)][5]

    def main(self):
        S = input().strip()
        print(self.calculateDP(S))

if __name__ == "__main__":
    Main().main()

