
MOD = 1000000007

def solve():
    import sys
    input = sys.stdin.read
    xx = list(map(int, input().split()))
    min_val = min(xx)
    max_val = max(xx)
    if min_val == max_val:
        f_val = f(min_val)
        res = (2 * f_val * f_val) % MOD
    elif min_val + 1 == max_val:
        f_val = f(min_val)
        res = (f_val * ((f_val * max_val) % MOD)) % MOD
    else:
        res = 0
    print(res)

def f(n):
    res = 1
    for i in range(2, n + 1):
        res = (res * i) % MOD
    return res

if __name__ == "__main__":
    solve()

