
import math
import sys

def modDiv(a, b, mod):
    return (a % mod) * modInv(b, mod) % mod

def modInv(x, mod):
    return modPow(x, mod - 2, mod)

def modPow(b, e, mod):
    ans = 1
    x = b % mod
    y = e
    while y != 0:
        if y & 1 == 1:
            ans = (ans * x) % mod
        x = (x * x) % mod
        y >>= 1
    return ans

def main():
    import sys
    input = sys.stdin.read().split()
    N = int(input[0])
    A = list(map(int, input[1:]))
    lcm = 1
    for ai in A:
        a = ai
        gcd = math.gcd(lcm, a)
        lcm = (lcm // gcd) * a
    mod = 1000000007
    modLcm = lcm % mod
    ans = 0
    for ai in A:
        ans = (ans + modDiv(modLcm, ai, mod)) % mod
    print(ans)

if __name__ == "__main__":
    main()

