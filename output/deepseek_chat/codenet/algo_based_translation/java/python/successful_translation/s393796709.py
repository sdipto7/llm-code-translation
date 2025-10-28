
MOD = 1000000007

def main():
    import sys
    in_reader = sys.stdin
    solve(in_reader)

def solve(in_reader):
    line = in_reader.readline().strip()
    xx = to_ints(line)
    min_val = min(xx[0], xx[1])
    max_val = max(xx[0], xx[1])
    
    if min_val == max_val:
        f = factorial(min_val)
        res = (2 * f * f) % MOD
    elif min_val + 1 == max_val:
        f = factorial(min_val)
        res = (f * ((f * max_val) % MOD)) % MOD
    else:
        res = 0
    
    print(res)

def factorial(n):
    res = 1
    for i in range(2, n + 1):
        res = (res * i) % MOD
    return res

def to_int(s):
    return int(s)

def to_ints(s):
    a = s.split()
    o = [0] * len(a)
    for i in range(len(a)):
        o[i] = to_int(a[i])
    return o

if __name__ == "__main__":
    main()

