
import math
from functools import reduce

def main():
    import sys
    data = sys.stdin.read().split()
    N = int(data[0])
    A = list(map(int, data[1:1+N]))
    
    def lcm(a, b):
        return a * b // math.gcd(a, b)
    
    total_lcm = reduce(lcm, A)
    mod = 1000000007
    modLcm = total_lcm % mod
    
    def modPow(b, e, mod):
        ans = 1
        x = b % mod
        y = e
        while y != 0:
            if y & 1:
                ans = (ans * x) % mod
            x = (x * x) % mod
            y >>= 1
        return ans
    
    def modInv(x, mod):
        return modPow(x, mod - 2, mod)
    
    def modDiv(a, b, mod):
        return (a % mod) * modInv(b, mod) % mod
    
    ans = 0
    for ai in A:
        ans = (ans + modDiv(modLcm, ai, mod)) % mod
    
    print(ans)

if __name__ == "__main__":
    main()

