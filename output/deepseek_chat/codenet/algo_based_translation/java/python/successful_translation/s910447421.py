
import sys
import math
from collections import defaultdict

ans = 100
balls = []
N = 0
taken = []

def main():
    global ans, balls, N, taken
    data = sys.stdin.read().split()
    idx = 0
    N = int(data[idx]); idx += 1
    ans = N
    balls = [[0, 0] for _ in range(N)]
    for i in range(N):
        balls[i][0] = int(data[idx]); idx += 1
        balls[i][1] = int(data[idx]); idx += 1
    
    balls.sort(key=lambda x: x[0])
    solve()
    
    for i in range(N):
        x = balls[i][0]
        y = balls[i][1]
        balls[i][0] = y
        balls[i][1] = x
    
    balls.sort(key=lambda x: x[0])
    solve()
    
    print(ans)

def solve():
    global ans, taken
    for add in range(1, N):
        taken = [False] * N
        p = balls[add][0] - balls[0][0]
        q = balls[add][1] - balls[0][1]
        ans = min(ans, check(p, q))

def check(p, q):
    global taken
    ret = 0
    while True:
        added = False
        start = 0
        x = -1
        y = -1
        for i in range(N):
            if not taken[i]:
                added = True
                ret += 1
                start = i
                taken[i] = True
                x = balls[i][0] + p
                y = balls[i][1] + q
                break
        if not added:
            break
        for i in range(start + 1, N):
            if balls[i][0] == x and balls[i][1] == y:
                taken[i] = True
                x += p
                y += q
    return ret

def max_double(a, b):
    return max(a, b)

def min_double(a, b):
    return min(a, b)

def min_long(a, b):
    return min(a, b)

def max_long(a, b):
    return max(a, b)

def min_int(a, b):
    return min(a, b)

def max_int(a, b):
    return max(a, b)

def abs_long(x):
    return abs(x)

def ceil(num, den):
    ans = num // den
    if num % den != 0:
        ans += 1
    return ans

def GCD(a, b):
    if a == 0 or b == 0:
        return max_long(a, b)
    return GCD(min_long(a, b), max_long(a, b) % min_long(a, b))

def FastExp(base, exp, mod):
    ans = 1
    base %= mod
    while exp > 0:
        if exp % 2 == 1:
            ans = (ans * base) % mod
        exp //= 2
        base = (base * base) % mod
    return ans

def ModInv(num, mod):
    return FastExp(num, mod - 2, mod)

def pop(x):
    cnt = 0
    while x > 0:
        if x % 2 == 1:
            cnt += 1
        x //= 2
    return cnt

if __name__ == "__main__":
    main()

