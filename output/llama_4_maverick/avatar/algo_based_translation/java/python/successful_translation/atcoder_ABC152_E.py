
def modPow(b, e, mod):
    ans = 1
    x = b % mod
    while e != 0:
        if e & 1 == 1:
            ans = (ans * x) % mod
        x = (x * x) % mod
        e >>= 1
    return ans

def modInv(x, mod):
    return modPow(x, mod - 2, mod)

def modDiv(a, b, mod):
    return (a % mod) * modInv(b, mod) % mod

def gcd(a, b):
    while b != 0:
        a, b = b, a % b
    return a

def lcm(a, b):
    return a * b // gcd(a, b)

def main():
    N = int(input())
    A = list(map(int, input().split()))
    lcm_val = 1
    for ai in A:
        lcm_val = lcm(lcm_val, ai)
    mod = 1000000007
    modLcm = lcm_val % mod
    ans = 0
    for ai in A:
        ans = (ans + modDiv(modLcm, ai, mod)) % mod
    print(ans)

if __name__ == "__main__":
    main()

