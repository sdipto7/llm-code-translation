
import sys

def main():
    import sys
    from io import StringIO
    
    input_data = sys.stdin.read().strip().split()
    n = int(input_data[0])
    v = list(map(int, input_data[1:n+1]))
    c = list(map(int, input_data[n+1:2*n+1]))
    dp = [0] * n

    for i in range(n):
        dp[i] = 0

    for i in range(1, n):
        tmp = dp[i - 1] + (v[i - 1] - c[i - 1])
        dp[i] = tmp if tmp > dp[i - 1] else dp[i - 1]

    tmp = dp[n - 1] + (v[n - 1] - c[n - 1])
    dp[n - 1] = tmp if tmp > dp[n - 1] else dp[n - 1]

    print(dp[n - 1])

if __name__ == "__main__":
    main()

