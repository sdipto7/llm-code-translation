
MOD = 10**9 + 7

n, k = map(int, input().split())
ans = 0

for i in range(k, n + 2):
    max_val = i * (2 * n - i + 1) // 2
    min_val = i * (i - 1) // 2
    term = (max_val - min_val + 1) % MOD
    ans += term

ans %= MOD
print(ans)

