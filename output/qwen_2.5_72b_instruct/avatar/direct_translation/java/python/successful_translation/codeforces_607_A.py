import sys
input = sys.stdin.read
data = input().split()
n = int(data[0])
beacon = [0] * 1000001
dp = [0] * 1000001
index = 1
for i in range(n):
    a = int(data[index])
    b = int(data[index + 1])
    beacon[a] = b
    index += 2
if beacon[0] != 0:
    dp[0] = 1
max_val = 0
for i in range(1, 1000001):
    if beacon[i] != 0 and beacon[i] < i:
        dp[i] = dp[i - beacon[i] - 1] + 1
    elif beacon[i] != 0:
        dp[i] = 1
    else:
        dp[i] = dp[i - 1]
    max_val = max(max_val, dp[i])
print(n - max_val)
