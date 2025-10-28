
import sys

class FastScanner:
    def __init__(self):
        self.br = sys.stdin
        self.st = []
    
    def next(self):
        while not self.st:
            try:
                self.st = self.br.readline().split()
            except ValueError:
                return None
        return self.st.pop(0)
    
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
        self.w.write(f"{x}\n")
        self.w.flush()
    
    def p(self, x):
        self.w.write(f"{x}")
        self.w.flush()

def max(a, b):
    return a if a > b else b

def min(a, b):
    return a if a < b else b

def abs(x):
    return -x if x < 0 else x

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

def main():
    ans = 100
    I = FastScanner()
    O = OutPut()
    N = I.nextInt()
    ans = N
    balls = [[0, 0] for _ in range(N)]
    for i in range(N):
        balls[i][0] = I.nextInt()
        balls[i][1] = I.nextInt()
    balls.sort(key=lambda a: a[0])
    solve(balls, N, ans, O)
    for i in range(N):
        balls[i][0], balls[i][1] = balls[i][1], balls[i][0]
    balls.sort(key=lambda a: a[0])
    solve(balls, N, ans, O)
    O.pln(ans)

def solve(balls, N, ans, O):
    global taken
    for add in range(1, N):
        taken = [False] * N
        p = balls[add][0] - balls[0][0]
        q = balls[add][1] - balls[0][1]
        ans = min(ans, check(balls, N, p, q))
    O.pln(ans)

def check(balls, N, p, q):
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

