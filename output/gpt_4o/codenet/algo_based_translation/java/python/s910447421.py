
import sys
from collections import deque

class FastScanner:
    def __init__(self):
        self.buffer = deque()
        
    def next(self):
        if not self.buffer:
            self.buffer = deque(sys.stdin.readline().strip().split())
        return self.buffer.popleft()

    def nextInt(self):
        return int(self.next())
    
    def nextLong(self):
        return int(self.next())
    
    def nextDouble(self):
        return float(self.next())

class OutPut:
    def __init__(self):
        self.out = sys.stdout
        
    def pln(self, x):
        print(x, file=self.out)
    
    def p(self, x):
        print(x, end='', file=self.out)

def min(a, b):
    return a if a < b else b

def max(a, b):
    return a if a > b else b

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

def solve():
    global ans, balls, N, taken
    for add in range(1, N):
        taken = [False] * N
        p = balls[add][0] - balls[0][0]
        q = balls[add][1] - balls[0][1]
        ans = min(ans, check(p, q))

def check(p, q):
    global ans, balls, N, taken
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
    scanner = FastScanner()
    output = OutPut()
    N = scanner.nextInt()
    ans = N
    balls = [[0, 0] for _ in range(N)]
    for i in range(N):
        balls[i][0] = scanner.nextInt()
        balls[i][1] = scanner.nextInt()
    balls.sort(key=lambda x: x[0])
    solve()
    for i in range(N):
        x = balls[i][0]
        y = balls[i][1]
        balls[i][0] = y
        balls[i][1] = x
    balls.sort(key=lambda x: x[0])
    solve()
    output.pln(ans)

