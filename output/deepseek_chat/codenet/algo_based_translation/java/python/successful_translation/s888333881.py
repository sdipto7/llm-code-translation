
import sys

def pow10E97(base, exponent, modulus):
    if base == 0:
        return 0
    if exponent == 0:
        return 1
    if exponent == 2:
        return (base * base) % modulus
    
    d = getDigit2(exponent)
    ob_pow_2pow = [0] * d
    
    ob_pow_2pow[0] = base % modulus
    for i in range(1, d):
        ob_pow_2pow[i] = (ob_pow_2pow[i-1] * ob_pow_2pow[i-1]) % modulus
    
    ans = 1
    for i in range(d-1, -1, -1):
        if exponent >= (1 << i):
            exponent -= (1 << i)
            ans = (ans * ob_pow_2pow[i]) % modulus
    
    return ans % modulus

def countFlaged(number):
    return bin(number).count('1')

def getDigit2(num):
    if num == 0:
        return 1
    d = 0
    cf = 1
    while num >= cf:
        d += 1
        cf = (1 << d)
    return d

def main():
    data = sys.stdin.read().splitlines()
    n = int(data[0])
    s = data[1].strip()
    
    flaged = [False] * n
    pop1st = s.count('1')
    
    for i in range(n):
        if s[i] == '1':
            flaged[i] = True
    
    surp1 = 0
    mod1 = pop1st + 1
    for i in range(n):
        surp1 = (surp1 * 2) % mod1
        if flaged[i]:
            surp1 = (surp1 + 1) % mod1
    
    surp9 = 0
    if pop1st > 1:
        mod9 = pop1st - 1
        for i in range(n):
            surp9 = (surp9 * 2) % mod9
            if flaged[i]:
                surp9 = (surp9 + 1) % mod9
    
    results = []
    for p in range(n):
        if flaged[p]:
            if pop1st == 1:
                results.append("0")
            else:
                mod_val = pop1st - 1
                dw = surp9
                dif = pow10E97(2, n - p - 1, mod_val)
                dw = (dw - dif + mod_val) % mod_val
                ans = 1
                while dw != 0:
                    count = countFlaged(dw)
                    dw %= count
                    ans += 1
                results.append(str(ans))
        else:
            mod_val = pop1st + 1
            dw = surp1
            dif = pow10E97(2, n - p - 1, mod_val)
            dw = (dw + dif) % mod_val
            ans = 1
            while dw != 0:
                count = countFlaged(dw)
                dw %= count
                ans += 1
            results.append(str(ans))
    
    for res in results:
        print(res)

if __name__ == "__main__":
    main()

