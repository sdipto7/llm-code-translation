
import sys
import math

def mod_div(a, b, mod):
    return (a % mod) * mod_inv(b, mod) % mod

def mod_inv(x, mod):
    return mod_pow(x, mod - 2, mod)

def mod_pow(b, e, mod):
    ans = 1
    x = b % mod
    y = e
    while y != 0:
        if (y & 1) == 1:
            ans = (ans * x) % mod
        x = (x * x) % mod
        y >>= 1
    return ans

def main():
    input = sys.stdin.read
    data = input().split()
    N = int(data[0])
    A = list(map(int, data[1:N+1]))
    
    lcm = 1
    for ai in A:
        lcm = lcm * ai // math.gcd(lcm, ai)
    
    mod = 1000000007
    mod_lcm = lcm % mod
    ans = 0
    
    for ai in A:
        ans = (ans + mod_div(mod_lcm, ai, mod)) % mod
    
    print(ans)

main()

