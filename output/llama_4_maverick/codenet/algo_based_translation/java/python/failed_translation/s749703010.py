
import sys
from io import StringIO
from atexit import register
from collections import defaultdict
from math import log, gcd, ceil

class FastIO(StringIO):
    newlines = 0

    def __init__(self, file):
        self._file = file
        self._fd = file.fileno()
        self.writable = 'x' in file.mode or 'w' in file.mode
        self.write = super(FastIO, self).write if self.writable else None

    def _fill(self):
        s = os.read(self._fd, max(os.fstat(self._fd).st_size, 8192))
        self.seek((self.tell(), self.seek(0, 2), super(FastIO, self).write(s))[0])
        return s

    def read(self):
        while self._fill():
            pass
        return super(FastIO, self).read()

    def readline(self):
        while self.newlines == 0:
            s = self._fill()
            self.newlines = s.count(b'\n') + (not s)
        self.newlines -= 1
        return super(FastIO, self).readline()

    def flush(self):
        if self.writable:
            os.write(self._fd, self.getvalue())
            self.truncate(0), self.seek(0)

class IOWrapper:
    def __init__(self, file):
        self.buffer = FastIO(file)
        self.flush = self.buffer.flush
        self.writable = self.buffer.writable
        self.write = lambda s: self.buffer.write(s.encode('ascii'))
        self.read = lambda: self.buffer.read().decode('ascii')
        self.readline = lambda: self.buffer.readline().decode('ascii')

sys.stdin, sys.stdout = IOWrapper(sys.stdin), IOWrapper(sys.stdout)
input = lambda: sys.stdin.readline().rstrip('\r\n')

class Pair:
    def __init__(self, l, r):
        self.l = l
        self.r = r

    def __repr__(self):
        return f'{self.l} {self.r}'

class Main:
    def __init__(self):
        self.n = 0
        self.a = []
        self.memo = []

    def count_set_bits(self, n):
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count

    def dp(self, fliped, idx, msk):
        if msk == (1 << self.n) - 1:
            return 0
        if self.memo[fliped][idx][msk] != -1:
            return self.memo[fliped][idx][msk]
        x = self.count_set_bits(msk)
        ff = 0
        ans = float('inf')
        for i in range(self.n):
            if not (msk & (1 << i)):
                nf = x % 2
                if idx == self.n or self.a[fliped][idx] <= self.a[(nf + (ff % 2)) % 2][i]:
                    ans = min(ans, ff + self.dp((nf + (ff % 2)) % 2, i, msk | (1 << i)))
                ff += 1
            else:
                x -= 1
        self.memo[fliped][idx][msk] = ans
        return ans

    def solve(self):
        self.n = int(input())
        self.a = [[0] * self.n for _ in range(2)]
        for i in range(self.n):
            self.a[0][i] = int(input())
        for i in range(self.n):
            self.a[1][i] = int(input())
        self.memo = [[[-1 for _ in range(1 << self.n)] for _ in range(self.n + 1)] for _ in range(2)]
        ans = self.dp(0, self.n, 0)
        print(ans if ans < float('inf') else -1)

if __name__ == '__main__':
    Main().solve()

