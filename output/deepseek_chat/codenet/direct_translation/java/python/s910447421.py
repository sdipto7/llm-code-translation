
import sys
import math
from functools import cmp_to_key

def main():
    global ans, ball, N, taken
    N = int(sys.stdin.readline())
    ans = N
    ball = [tuple(map(int, sys.stdin.readline().split())) for _ in range(N)]
    ball.sort()
    solve()
    ball = [(y, x) for x, y in ball]
    ball.sort()
    solve()
    print(ans)

def solve():
    global ans, ball, N, taken
    for add in range(1, N):
        taken = [False] * N
        p = ball[add][0] - ball[0][0]
        q = ball[add][1] - ball[0][1]
        ans = min(ans, check(p, q))

def check(p, q):
    global ball, N, taken
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
                x = ball[i][0] + p
                y = ball[i][1] + q
                break
        if not added:
            break
        for i in range(start + 1, N):
            if ball[i][0] == x and ball[i][1] == y:
                taken[i] = True
                x += p
                y += q
    return ret

def max(a, b):
    return max(a, b)

def min(a, b):
    return min(a, b)

def abs(x):
    return abs(x)

def ceil(num, den):
    ans = num // den
    if num % den != 0:
        ans += 1
    return ans

def GCD(a, b):
    if a == 0 or b == 0:
        return max(a, b)
    return GCD(min(a, b), max(a, b) % min(a, b))

def FastExp(base, exp, mod):
    ans = 1
    while exp > 0:
        if exp % 2 == 1:
            ans *= base
        exp //= 2
        base *= base
        base %= mod
        ans %= mod
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

