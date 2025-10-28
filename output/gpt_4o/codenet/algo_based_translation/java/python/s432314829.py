
def main():
    import sys
    input = sys.stdin.read
    data = input().split()
    
    n = int(data[0])
    m = int(data[1])
    
    dp = [0] * (n + 2)
    dp[n + 1] = 0
    dp[n] = 1
    
    for i in range(m):
        dp[int(data[2 + i])] = -1
    
    for i in range(n - 1, -1, -1):
        if dp[i] == -1:
            dp[i] = 0
        else:
            dp[i] = (dp[i + 1] + dp[i + 2]) % 1000000007
            
    print(dp[0])

if __name__ == "__main__":
    main()

