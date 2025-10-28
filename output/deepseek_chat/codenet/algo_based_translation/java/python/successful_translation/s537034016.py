
mod = 1000000007
dp = []

def main():
    global dp
    s = int(input().strip())
    dp = [-1] * (s + 1)
    dp[0] = 1
    print(dfs(s))

def dfs(s):
    global dp
    if dp[s] != -1:
        return dp[s]
    
    ret = 0
    for i in range(s - 3, -1, -1):
        ret += dfs(i)
        ret %= mod
    dp[s] = ret
    return ret

if __name__ == '__main__':
    main()

