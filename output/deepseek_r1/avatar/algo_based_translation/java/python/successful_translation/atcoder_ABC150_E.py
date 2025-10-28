
import sys
mod = 10**9 + 7

def power(x, n):
    if n == 0:
        return 1
    val = power(x, n // 2)
    val = val * val % mod
    if n % 2 == 1:
        val = val * x % mod
    return val

n = int(sys.stdin.readline())
c = list(map(int, sys.stdin.readline().split()))

if n == 1:
    print((c[0] * 2) % mod)
    sys.exit()

c.sort()
b = power(2, n)
a = power(2, n - 2)
ans = 0

for i in range(2, n + 2):
    val = a * i % mod
    idx = (n + 1) - i
    val = val * c[idx] % mod
    ans = (ans + val) % mod

ans = ans * b % mod
print(ans)

