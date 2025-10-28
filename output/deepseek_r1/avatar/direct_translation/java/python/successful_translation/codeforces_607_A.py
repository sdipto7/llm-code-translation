
n = int(input())
beacon = [0] * (10**6 + 1)
for _ in range(n):
    a, b = map(int, input().split())
    beacon[a] = b
dp = [0] * (10**6 + 1)
if beacon[0] != 0:
    dp[0] = 1
max_val = 0
for i in range(1, 10**6 + 1):
    if beacon[i] != 0:
        if beacon[i] < i:
            dp[i] = dp[i - beacon[i] - 1] + 1
        else:
            dp[i] = 1
    else:
        dp[i] = dp[i-1]
    if dp[i] > max_val:
        max_val = dp[i]
print(n - max_val)

