
import sys

def main():
    n = int(sys.stdin.readline())
    dp = [0] * 200001
    for i in range(n):
        num = int(sys.stdin.readline())
        dp[num] = i
    ans = 0
    for i in range(2, n + 1):
        ans += abs(dp[i] - dp[i - 1])
    print(ans)

if __name__ == "__main__":
    main()

