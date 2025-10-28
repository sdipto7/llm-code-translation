
import sys

def power(x, n):
    if n == 0:
        return 1
    mod = 1000000007
    val = power(x, n // 2)
    val = val * val % mod
    if n % 2 == 1:
        val = val * x % mod
    return val

def main():
    input = sys.stdin.read
    data = input().split()
    
    n = int(data[0])
    c = list(map(int, data[1:n+1]))
    
    mod = 1000000007
    if n == 1:
        print(c[0] * 2 % mod)
        return
    
    c.sort()
    b = power(2, n)
    a = power(2, n - 2)
    ans = 0
    
    for i in range(2, n + 2):
        val = a * i % mod
        val *= c[n + 1 - i]
        val %= mod
        ans += val
        ans %= mod
    
    ans *= b
    ans %= mod
    print(ans)

if __name__ == "__main__":
    main()

