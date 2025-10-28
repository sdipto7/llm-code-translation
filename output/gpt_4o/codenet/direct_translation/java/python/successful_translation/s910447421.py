
import sys
from collections import deque
from functools import cmp_to_key

sys.setrecursionlimit(10**6)
input = sys.stdin.readline

class FastScanner:
    def __init__(self):
        self.st = deque()

    def next(self):
        while not self.st:
            self.st = deque(input().strip().split())
        return self.st.popleft()

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return int(self.next())

    def nextDouble(self):
        return float(self.next())

class OutPut:
    def __init__(self):
        self.w = sys.stdout

    def pln(self, x):
        self.w.write(str(x) + '\n')
        self.w.flush()

    def p(self, x):
        self.w.write(str(x))
        self.w.flush()

def max(a, b):
    return a if a > b else b

def min(a, b):
    return a if a < b else b

def abs(x):
    return x if x >= 0 else -x

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

def main():
    I = FastScanner()
    O = OutPut()
    N = I.nextInt()
    global ans
    ans = N
    balls = [[0, 0] for _ in range(N)]
    for i in range(N):
        balls[i][0] = I.nextInt()
        balls[i][1] = I.nextInt()
    balls.sort(key=cmp_to_key(lambda a, b: a[0] - b[0]))
    solve(balls, N)
    for i in range(N):
        x = balls[i][0]
        y = balls[i][1]
        balls[i][0] = y
        balls[i][1] = x
    balls.sort(key=cmp_to_key(lambda a, b: a[0] - b[0]))
    solve(balls, N)
    O.pln(ans)

def solve(balls, N):
    global ans
    for add in range(1, N):
        taken = [False] * N
        p = balls[add][0] - balls[0][0]
        q = balls[add][1] - balls[0][1]
        ans = min(ans, check(p, q, balls, N, taken))

def check(p, q, balls, N, taken):
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

if __name__ == "__main__":
    main()

