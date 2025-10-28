
import sys
import random

def main():
    m, n = map(int, sys.stdin.readline().split())
    manju = list(map(int, sys.stdin.readline().split()))
    boxlen = []
    boxcost = []
    for _ in range(n):
        l, c = map(int, sys.stdin.readline().split())
        boxlen.append(l)
        boxcost.append(c)
    
    manju.sort(reverse=True)
    dp = [[0] * (n + 1) for _ in range(m + 1)]
    
    for i in range(m - 1, -1, -1):
        for j in range(n - 1, -1, -1):
            len_ = min(i + boxlen[j], m)
            cnt = sum(manju[m - 1 - k] for k in range(i, len_))
            dp[i][j] = max(dp[i][j], dp[len_][j + 1] + cnt - boxcost[j])
            dp[i][j] = max(dp[i][j], dp[i][j + 1])
    
    print(dp[0][0])

if __name__ == "__main__":
    main()

