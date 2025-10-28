
n = int(input())
a = list(map(int, input().split()))
mod = 10**9 + 7
p = 1
for i in range(2, n + 1):
    p = p * i % mod
q = [0] * n
q[0] = 1
for i in range(1, n):
    inv = pow(i + 1, mod - 2, mod)
    q[i] = (q[i - 1] + inv) % mod
ans = 0
for i in range(n):
    val = (q[i] + q[n - 1 - i] - 1) % mod
    val = val * a[i] % mod
    val = val * p % mod
    ans = (ans + val) % mod
print(ans)

