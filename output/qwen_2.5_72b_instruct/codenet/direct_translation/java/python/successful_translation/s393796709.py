
MOD = 1000000007

def solve():
    import sys
    in_ = sys.stdin.read().strip().split()
    xx = list(map(int, in_))
    min_ = min(xx[0], xx[1])
    max_ = max(xx[0], xx[1])
    if min_ == max_:
        f_ = f(min_)
        res = (2 * f_ * f_) % MOD
    elif min_ + 1 == max_:
        f_ = f(min_)
        res = (f_ * ((f_ * max_) % MOD)) % MOD
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

