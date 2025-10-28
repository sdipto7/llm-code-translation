
import sys

def main():
    data = sys.stdin.read().split()
    v1 = int(data[0])
    v2 = int(data[1])
    t = int(data[2])
    d = int(data[3])
    
    if t == 1:
        print(v1)
        return
        
    dp = [[-10**17] * 1150 for _ in range(t - 1)]
    dp[0][v1] = v1
    
    for i in range(1, t - 1):
        for j in range(1150):
            for x in range(d + 1):
                if j + x < 1150:
                    if dp[i - 1][j + x] != -10**17:
                        dp[i][j] = max(dp[i][j], dp[i - 1][j + x] + j)
            for x in range(d, -1, -1):
                if j - x >= 0:
                    if dp[i - 1][j - x] != -10**17:
                        dp[i][j] = max(dp[i][j], dp[i - 1][j - x] + j)
    
    ans = -10**17
    for j in range(1150):
        if abs(j - v2) <= d:
            if dp[t - 2][j] != -10**17:
                ans = max(ans, dp[t - 2][j] + v2)
    
    print(ans)

if __name__ == "__main__":
    main()

