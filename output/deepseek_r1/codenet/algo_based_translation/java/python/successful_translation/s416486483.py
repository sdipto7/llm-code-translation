
def split(n: int, k: int) -> int:
    sum_val = 0
    while n > 0:
        sum_val += n % k
        n = n // k
    return sum_val

def solve(n: int, s: int) -> int:
    k = 2
    while k * k <= n or k < 100:
        if split(n, k) == s:
            return k
        k += 1
    while k <= n:
        a = n // k
        b = n % k
        if (a + b - s) % a == 0:
            dk = (a + b - s) // a
            if dk >= 0 and (b - dk * a) >= 0:
                return k + dk
        k = (n // a) + 1
    if n == s:
        return n + 1
    return -1

n = int(input())
s = int(input())
print(solve(n, s))

