
import sys

def count_flagged(num):
    return bin(num).count('1')

def main():
    n = int(sys.stdin.readline())
    s = sys.stdin.readline().strip()
    flaged = [c == '1' for c in s]
    pop1st = sum(flaged)
    
    surp1 = 0
    mod1 = pop1st + 1
    if mod1 != 0:
        for bit in flaged:
            surp1 = (surp1 * 2 + bit) % mod1
    
    surp9 = 0
    if pop1st > 1:
        mod9 = pop1st - 1
        for bit in flaged:
            surp9 = (surp9 * 2 + bit) % mod9
    
    for p in range(n):
        if flaged[p]:
            if pop1st == 1:
                print(0)
                continue
            mod = pop1st - 1
            exponent = n - p - 1
            power = pow(2, exponent, mod) if mod != 0 else 0
            dw = (surp9 - power) % mod
            ans = 1
            while dw != 0:
                cnt = count_flagged(dw)
                dw %= cnt
                ans += 1
            print(ans)
        else:
            mod = pop1st + 1
            exponent = n - p - 1
            power = pow(2, exponent, mod) if mod != 0 else 0
            dw = (surp1 + power) % mod
            ans = 1
            while dw != 0:
                cnt = count_flagged(dw)
                dw %= cnt
                ans += 1
            print(ans)

if __name__ == "__main__":
    main()

