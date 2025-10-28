
mod = 10**9 + 7
n, k = map(int, input().split())
len_list = []
l = 1
while l <= n:
    r = n // (n // l)
    len_list.append(r - l + 1)
    l = r + 1
q = len(len_list)
if k == 0:
    print(1)
    exit()
dp = [0] * (k * (q + 1))
for j in range(1, q + 1):
    dp[j] = (len_list[j - 1] + dp[j - 1]) % mod
for i in range(1, k):
    for j in range(1, q + 1):
        prev_index = (i - 1) * (q + 1) + (q - j + 1)
        current_index = i * (q + 1) + j
        dp[current_index] = (dp[current_index - 1] + dp[prev_index] * len_list[j - 1]) % mod
print(dp[(k - 1) * (q + 1) + q] % mod)

