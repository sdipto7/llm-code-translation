import sys
sys.setrecursionlimit(1000000)

dp = []
mod = 1000000007

def main():
    s = int(sys.stdin.readline())
    global dp
    dp = [-1] * (s + 1)
    dp[0] = 1
    print(dfs(s))

def dfs(s):
    if dp[s] != -1:
        return dp[s]
    ret = 0
    for i in range(s - 3, -1, -1):
        ret += dfs(i)
        ret %= mod
    dp[s] = ret
    return dp[s]

if __name__ == "__main__":
    main()
