
import sys

sys.setrecursionlimit(10000)

def main():
    import sys
    input = sys.stdin.read
    s = int(input().strip())
    
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
        ret %= 1000000007
    dp[s] = ret
    return ret

if __name__ == "__main__":
    main()

