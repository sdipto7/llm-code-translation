
import sys

def main():
    n = int(sys.stdin.readline())
    a = list(map(int, sys.stdin.readline().split()))
    dp = [-1] * (n + 1)
    if n > 0:
        dp[n-1] = a[n-1]
    for i in range(n-1, -1, -1):
        dp[i] = max(dp[i+1], a[i])
    result = []
    for i in range(n):
        if a[i] > dp[i+1]:
            result.append('0')
        else:
            result.append(str(dp[i+1] - a[i] + 1))
    print(' '.join(result))

if __name__ == "__main__":
    main()

