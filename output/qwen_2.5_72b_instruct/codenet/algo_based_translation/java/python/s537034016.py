
import sys

class Main:
    dp = []
    mod = 1000000007

    @staticmethod
    def main():
        import sys
        s = int(sys.stdin.readline().strip())
        
        Main.dp = [-1] * (s + 1)
        Main.dp[0] = 1
        print(Main.dfs(s))

    @staticmethod
    def dfs(s):
        if Main.dp[s] != -1:
            return Main.dp[s]
        
        ret = 0
        for i in range(s - 3, -1, -1):
            ret += Main.dfs(i)
            ret %= Main.mod
        
        Main.dp[s] = ret
        return Main.dp[s]

if __name__ == "__main__":
    Main.main()

