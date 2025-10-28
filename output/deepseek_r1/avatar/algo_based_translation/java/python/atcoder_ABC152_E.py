
import math

n = int(input())
a = list(map(int, input().split()))
mod = 10**9 + 7

lcm = 1
for num in a:
    gcd = math.gcd(lcm, num)
    lcm = (lcm // gcd) * num

mod_lcm = lcm % mod

ans = 0
for num in a:
    inv = pow(num, mod - 2, mod)
    ans = (ans + mod_lcm * inv) % mod

print(ans)

