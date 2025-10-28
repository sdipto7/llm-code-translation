
import sys

def main():
    import sys
    from collections import defaultdict

    input = sys.stdin.read().split()
    n = int(input[0])
    dp = [0] * 200001
    index = 1

    for i in range(n):
        value = int(input[index])
        dp[value] = i
        index += 1

    ans = 0
    for i in range(2, n + 1):
        ans += abs(dp[i] - dp[i - 1])

    print(ans)

if __name__ == "__main__":
    main()

