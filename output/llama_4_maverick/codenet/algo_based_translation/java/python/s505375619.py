
import sys

def main():
    n = int(sys.stdin.readline().strip())
    v = [0] * n
    c = [0] * n
    dp = [0] * n

    for i in range(n):
        v[i] = int(sys.stdin.readline().strip())

    for i in range(n):
        c[i] = int(sys.stdin.readline().strip())

    dp[0] = 0

    for i in range(1, n):
        tmp = dp[i - 1] + (v[i - 1] - c[i - 1])
        dp[i] = max(tmp, dp[i - 1])

    tmp = dp[n - 1] + (v[n - 1] - c[n - 1])
    dp[n - 1] = max(tmp, dp[n - 1])

    print(dp[n - 1])

if __name__ == "__main__":
    main()

