
MOD = 10**9 + 7

def f(n):
    res = 1
    for i in range(2, n + 1):
        res = res * i % MOD
    return res

xx = list(map(int, input().split()))
min_val, max_val = min(xx), max(xx)

if min_val == max_val:
    fact = f(min_val)
    res = (2 * fact * fact) % MOD
elif max_val - min_val == 1:
    fact = f(min_val)
    res = (fact * fact * max_val) % MOD
else:
    res = 0

print(res)

