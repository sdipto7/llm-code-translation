
class Main:
    mod = 1000000007

    def __init__(self):
        self.dp = None

    def dfs(self, s):
        if self.dp[s] != -1:
            return self.dp[s]
        ret = 0
        for i in range(s - 3, -1, -1):
            ret += self.dfs(i)
            ret %= self.mod
        self.dp[s] = ret
        return ret

    def main(self):
        s = int(input())
        self.dp = [-1] * (s + 1)
        self.dp[0] = 1
        print(self.dfs(s))

if __name__ == "__main__":
    main = Main()
    main.main()

