
import sys

def main():
    data = list(map(int, sys.stdin.read().split()))
    ptr = 0
    n = data[ptr]
    ptr += 1
    dp = [0] * 200001
    for i in range(n):
        x = data[ptr]
        ptr += 1
        dp[x] = i
    ans = 0
    for i in range(2, n + 1):
        ans += abs(dp[i] - dp[i - 1])
    print(ans)

if __name__ == "__main__":
    main()

