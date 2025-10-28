
import sys

def main():
    import sys
    import math
    input = sys.stdin.read().split()
    n = int(input[0])
    c = list(map(int, input[1:]))
    if n == 1:
        print((c[0] * 2) % 1000000007)
        return
    c.sort()
    b = power(2, n)
    a = power(2, n - 2)
    ans = 0
    for i in range(2, n + 2):
        val = a * i % 1000000007
        val *= c[n + 1 - i]
        val %= 1000000007
        ans += val
        ans %= 1000000007
    ans *= b
    ans %= 1000000007
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

