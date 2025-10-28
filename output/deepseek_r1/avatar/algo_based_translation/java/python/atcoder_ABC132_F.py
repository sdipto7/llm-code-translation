
import sys

n, k = map(int, sys.stdin.readline().split())
len_ = []
l = 1
while l <= n:
    r = n // (n // l)
    len_.append(r - l + 1)
    l = r + 1
q = len(len_)
mod = 10**9 + 7
dp = [0] * (k * (q + 1))

for j in range(1, q + 1):
    dp[j] = len_[j-1] + dp[j-1]

for i in range(1, k):
    for j in range(1, q + 1):
        current = i * (q + 1) + j
        prev_j = current - 1
        prev_layer = (i-1) * (q + 1) + (q - j + 1)
        dp[current] = (dp[prev_j] + dp[prev_layer] * len_[j-1]) % mod

print(dp[k * (q + 1) - 1] % mod)

