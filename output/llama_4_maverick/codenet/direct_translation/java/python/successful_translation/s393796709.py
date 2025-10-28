
import sys

MOD = 1000000007

def f(n):
    res = 1
    for i in range(2, n+1):
        res = (res * i) % MOD
    return res

def to_int(s):
    return int(s)

def to_ints(s):
    a = s.split()
    return [to_int(x) for x in a]

def e(o):
    sys.stderr.write(str(o) + '\n')

def solve():
    xx = to_ints(sys.stdin.readline().strip())
    min_val = min(xx[0], xx[1])
    max_val = max(xx[0], xx[1])
    if min_val == max_val:
        res = (2 * pow(f(min_val), 2, MOD)) % MOD
    elif min_val + 1 == max_val:
        res = (f(min_val) * ((f(min_val) * max_val) % MOD)) % MOD
    else:
        res = 0
    print(res)

def main():
    solve()

if __name__ == "__main__":
    main()

