
n = int(input())
maxn = 4010
a = int(input())
b = int(input())
c = int(input())
arr = [a, b, c]
dp = [-float('inf')] * maxn
dp[0] = 0
for i in range(3):
    for j in range(arr[i], len(dp)):
        dp[j] = max(dp[j], dp[j - arr[i]] + 1)
print(dp[n])

