
import sys

def modinv(a, m):
    b, u, v = m, 1, 0
    while b > 0:
        t = a // b
        a -= t * b
        a, b = b, a
        u -= t * v
        u, v = v, u
    u %= m
    if u < 0:
        u += m
    return u

n = int(sys.stdin.readline())
a = list(map(int, sys.stdin.readline().split()))
mod = 1000000007
p = 1
for i in range(2, n + 1):
    p = p * i % mod
q = [0] * n
q[0] = 1
for i in range(1, n):
    q[i] = (q[i - 1] + modinv(i + 1, mod)) % mod
ans = 0
for i in range(n):
    val = q[i] + q[n - i - 1] - 1
    val *= a[i]
    val %= mod
    val *= p
    val %= mod
    ans += val
    ans %= mod
print(ans)

