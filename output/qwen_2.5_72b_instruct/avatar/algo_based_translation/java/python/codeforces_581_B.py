from sys import stdin, stdout
import array

def main():
    import sys
    input = sys.stdin.read().split()
    n = int(input[0])
    a = list(map(int, input[1:n+1]))
    dp = [-1] * (n + 1)
    dp[n - 1] = a[n - 1]
    for i in range(n - 1, 0, -1):
        dp[i] = max(dp[i + 1], a[i])
    result = []
    for i in range(n):
        if a[i] > dp[i + 1]:
            result.append(0)
        else:
            result.append(dp[i + 1] - a[i] + 1)
    stdout.write(' '.join(map(str, result)) + '\n')

if __name__ == "__main__":
    main()
