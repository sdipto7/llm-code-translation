n = int(input())
arr = list(map(int, input().split()))
dp = [0] * (n + 1)
for i in range(n):
    x = arr[i]
    dp[x] = i
ans = 0
for i in range(2, n + 1):
    ans += abs(dp[i] - dp[i - 1])
print(ans)
