
import sys

def main():
    data = sys.stdin.read().split()
    if not data:
        return
    
    n = int(data[0])
    a = list(map(int, data[1:1+n]))
    
    dp = [-1] * (n + 1)
    dp[n - 1] = a[n - 1]
    
    for i in range(n - 2, -1, -1):
        dp[i] = max(dp[i + 1], a[i])
    
    result = []
    for i in range(n):
        if a[i] > dp[i + 1]:
            result.append("0")
        else:
            result.append(str(dp[i + 1] - a[i] + 1))
    
    print(" ".join(result))

if __name__ == "__main__":
    main()

