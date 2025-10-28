
import sys
from io import StringIO
import unittest
from math import gcd

class FastScanner:
    def __init__(self):
        self.input = sys.stdin.read().splitlines()
        self.index = 0

    def next(self):
        if self.index >= len(self.input):
            raise EOFError
        line = self.input[self.index]
        self.index += 1
        return line.strip()

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return int(self.next())

    def next_double(self):
        return float(self.next())

class OutPut:
    def __init__(self):
        self.output = StringIO()

    def pln(self, x):
        print(x, file=self.output)

    def p(self, x):
        print(x, end='', file=self.output)

    def flush(self):
        sys.stdout.write(self.output.getvalue())

def max_double(a, b):
    return max(a, b)

def min_double(a, b):
    return min(a, b)

def max_long(a, b):
    return max(a, b)

def min_long(a, b):
    return min(a, b)

def max_int(a, b):
    return max(a, b)

def min_int(a, b):
    return min(a, b)

def abs_long(x):
    return abs(x)

def ceil_long(num, den):
    ans = num // den
    if num % den != 0:
        ans += 1
    return ans

def GCD_long(a, b):
    return gcd(a, b)

def FastExp_long(base, exp, mod):
    ans = 1
    while exp > 0:
        if exp % 2 == 1:
            ans = (ans * base) % mod
        exp //= 2
        base = (base * base) % mod
    return ans

def ModInv_long(num, mod):
    return FastExp_long(num, mod - 2, mod)

def pop_long(x):
    cnt = 0
    while x > 0:
        if x % 2 == 1:
            cnt += 1
        x //= 2
    return cnt

class Main:
    ans = 100
    balls = None
    N = 0
    taken = None

    def __init__(self):
        self.I = FastScanner()
        self.O = OutPut()

    def main(self):
        self.N = self.I.next_int()
        self.ans = self.N
        self.balls = []
        for _ in range(self.N):
            self.balls.append([self.I.next_int(), self.I.next_int()])
        self.balls.sort(key=lambda x: x[0])
        self.solve()
        for i in range(self.N):
            x, y = self.balls[i]
            self.balls[i] = [y, x]
        self.balls.sort(key=lambda x: x[0])
        self.solve()
        self.O.pln(self.ans)
        self.O.flush()

    def solve(self):
        for add in range(1, self.N):
            self.taken = [False] * self.N
            p = self.balls[add][0] - self.balls[0][0]
            q = self.balls[add][1] - self.balls[0][1]
            self.ans = min_int(self.ans, self.check(p, q))

    def check(self, p, q):
        ret = 0
        while True:
            added = False
            start = 0
            x = -1
            y = -1
            for i in range(self.N):
                if not self.taken[i]:
                    added = True
                    ret += 1
                    start = i
                    self.taken[i] = True
                    x = self.balls[i][0] + p
                    y = self.balls[i][1] + q
                    break
            if not added:
                break
            for i in range(start + 1, self.N):
                if self.balls[i][0] == x and self.balls[i][1] == y:
                    self.taken[i] = True
                    x += p
                    y += q
        return ret

if __name__ == '__main__':
    main = Main()
    main.main()

