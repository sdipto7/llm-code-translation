
import sys

def main():
    v1, v2, t, d = map(int, sys.stdin.readline().split())
    dp = [[-(10**17)] * 1150 for _ in range(t-1)]
    for i in range(t-1):
        dp[i] = [- (10**17)] * 1150
    dp[0][v1] = v1
    for i in range(1, t-1):
        for j in range(1150):
            for x in range(d+1):
                if j + x < 1150:
                    dp[i][j] = max(dp[i][j], dp[i-1][j+x] + j)
            for x in range(d, -1, -1):
                if j - x >= 0:
                    dp[i][j] = max(dp[i][j], dp[i-1][j-x] + j)
    ans = float('-inf')
    for i in range(t-2, t-1):
        for j in range(1150):
            if abs(j - v2) <= d:
                ans = max(ans, dp[i][j] + v2)
    print(ans)

if __name__ == "__main__":
    main()

