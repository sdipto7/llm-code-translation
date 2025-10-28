
import math
from functools import reduce

def main():
    import sys
    input = sys.stdin.read
    data = input().split()
    N = int(data[0])
    A = list(map(int, data[1:]))

    lcm = 1
    for ai in A:
        lcm = lcm * ai // math.gcd(lcm, ai)

    mod = 1000000007
    modLcm = lcm % mod
    ans = 0
    for ai in A:
        ans = (ans + modDiv(modLcm, ai, mod)) % mod

    print(ans)

def modDiv(a, b, mod):
    return (a % mod) * modInv(b, mod) % mod

def modInv(x, mod):
    return modPow(x, mod - 2, mod)

def modPow(b, e, mod):
    ans = 1
    x = b % mod
    while e != 0:
        if e & 1 == 1:
            ans = (ans * x) % mod
        x = (x * x) % mod
        e >>= 1
    return ans

if __name__ == "__main__":
    main()

