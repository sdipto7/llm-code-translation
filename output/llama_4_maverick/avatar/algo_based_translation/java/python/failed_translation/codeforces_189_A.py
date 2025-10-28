
def main():
    n = int(input().split()[0])
    a, b, c = map(int, input().split())
    maxn = 4010
    arr = [a, b, c]
    dp = [float('-inf')] * maxn
    dp[0] = 0
    for i in range(len(arr)):
        for j in range(arr[i], maxn):
            dp[j] = max(dp[j], dp[j - arr[i]] + 1)
    print(dp[n])

if __name__ == "__main__":
    main()

