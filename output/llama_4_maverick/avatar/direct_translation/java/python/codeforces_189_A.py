
def main():
    n = int(input().split()[0])
    maxn = 4010
    a, b, c = map(int, input().split())
    arr = [a, b, c]
    dp = [-float('inf')] * maxn
    dp[0] = 0
    for i in range(3):
        for j in range(arr[i], maxn):
            dp[j] = max(dp[j], dp[j - arr[i]] + 1)
    print(dp[n])
