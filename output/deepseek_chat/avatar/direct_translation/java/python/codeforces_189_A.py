
import sys

def main():
    n = int(sys.stdin.readline())
    maxn = 4010
    a = int(sys.stdin.readline())
    b = int(sys.stdin.readline())
    c = int(sys.stdin.readline())
    arr = [a, b, c]
    dp = [float('-inf')] * maxn
    dp[0] = 0
    for i in range(3):
        for j in range(arr[i], maxn):
            dp[j] = max(dp[j], dp[j - arr[i]] + 1)
    print(dp[n])

if __name__ == "__main__":
    main()

