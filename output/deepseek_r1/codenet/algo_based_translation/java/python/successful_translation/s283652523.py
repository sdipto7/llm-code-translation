
MOD = 10**9 + 7

n = int(input())
a = list(map(int, input().split()))[:n]

ans = 0
if n == 0:
    print(ans)
    exit()

sum_val = a[-1]
for i in range(n-2, -1, -1):
    ans = (ans + sum_val * a[i]) % MOD
    sum_val = (sum_val + a[i]) % MOD

print(ans)

