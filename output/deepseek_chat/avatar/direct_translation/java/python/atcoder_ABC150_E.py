
import sys
import math

def main():
    input = sys.stdin.read
    data = input().split()
    n = int(data[0])
    c = list(map(int, data[1:n+1]))
    mod = 1000000007
    if n == 1:
        print((c[0] * 2) % mod)
        return
    c.sort()
    b = power(2, n)
    a = power(2, n - 2)
    ans = 0
    for i in range(2, n + 2):
        val = a * i % mod
        val = val * c[len(c) - i] % mod
        ans = (ans + val) % mod
    ans = ans * b % mod
    print(ans)

def power(x, n):
    if n == 0:
        return 1
    mod = 1000000007
    val = power(x, n // 2)
    val = val * val % mod
    if n % 2 == 1:
        val = val * x % mod
    return val

if __name__ == "__main__":
    main()

