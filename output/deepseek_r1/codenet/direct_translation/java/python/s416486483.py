
def split(n, k):
    sum_ = 0
    while n > 0:
        sum_ += n % k
        n = n // k
    return sum_

def solve(n, s):
    k = 2
    while (k * k <= n) or (k < 100):
        if split(n, k) == s:
            return k
        k += 1
    while k <= n:
        a = n // k
        b = n % k
        temp = a + b - s
        if temp % a == 0:
            dk = temp // a
            if dk >= 0 and (b - dk * a) >= 0:
                return k + dk
        k = (n // a) + 1
    if n == s:
        return n + 1
    return -1

n, s = map(int, input().split())
print(solve(n, s))

