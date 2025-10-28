
import sys

def main():
    input = sys.stdin.read
    data = input().split()
    
    n = int(data[0])
    v = [int(data[i + 1]) for i in range(n)]
    c = [int(data[i + 1 + n]) for i in range(n)]
    
    dp = [0] * n
    dp[0] = 0
    
    for i in range(1, n):
        tmp = dp[i - 1] + (v[i - 1] - c[i - 1])
        dp[i] = max(tmp, dp[i - 1])
    
    tmp = dp[n - 1] + (v[n - 1] - c[n - 1])
    dp[n - 1] = max(tmp, dp[n - 1])
    
    print(dp[n - 1])

if __name__ == "__main__":
    main()

