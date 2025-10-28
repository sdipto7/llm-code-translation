
import sys

def main():
    m, n = map(int, sys.stdin.readline().split())
    manju = list(map(int, sys.stdin.readline().split()))
    manju.sort()
    boxlen = []
    boxcost = []
    for _ in range(n):
        a, b = map(int, sys.stdin.readline().split())
        boxlen.append(a)
        boxcost.append(b)
    
    dp = [[0] * (n + 1) for _ in range(m + 1)]
    
    for i in reversed(range(m)):
        for j in reversed(range(n)):
            len_val = min(i + boxlen[j], m)
            cnt = sum(manju[m-1 - k] for k in range(i, len_val))
            option1 = dp[len_val][j + 1] + cnt - boxcost[j]
            option2 = dp[i][j + 1]
            dp[i][j] = max(option1, option2)
    
    print(dp[0][0])

if __name__ == "__main__":
    main()

