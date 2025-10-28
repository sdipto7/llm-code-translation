
MOD = 10**9 + 7

def f(n):
    res = 1
    for i in range(2, n + 1):
        res = (res * i) % MOD
    return res

def solve():
    a, b = map(int, input().split())
    min_val = min(a, b)
    max_val = max(a, b)
    if min_val == max_val:
        f_val = f(min_val)
        res = (2 * f_val * f_val) % MOD
    elif max_val == min_val + 1:
        f_val = f(min_val)
        res = (f_val * ((f_val * max_val) % MOD)) % MOD
    else:
        res = 0
    print(res)

if __name__ == "__main__":
    solve()

