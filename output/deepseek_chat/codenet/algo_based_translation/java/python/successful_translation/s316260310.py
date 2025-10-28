
import sys
import threading
import time
import random
import math
from collections import deque

class Helper:
    def __init__(self, mod, maxn):
        self.MOD = mod
        self.MAXN = maxn
        self.rnd = random.Random()
        self.sieve = None
        self.primes = None
        self.factorial = None
        self.buf = bytearray()
        self.index = 0
        self.total = 0
        self.in_stream = sys.stdin
        self.out = sys.stdout

    def set_sieve(self):
        self.primes = []
        self.sieve = [0] * self.MAXN
        for i in range(2, self.MAXN):
            if self.sieve[i] == 0:
                self.primes.append(i)
                for j in range(i, self.MAXN, i):
                    self.sieve[j] = i

    def set_factorial(self):
        self.factorial = [0] * self.MAXN
        self.factorial[0] = 1
        for i in range(1, self.MAXN):
            self.factorial[i] = self.factorial[i-1] * i % self.MOD

    def get_factorial(self, n):
        if self.factorial is None:
            self.set_factorial()
        return self.factorial[n]

    def ncr(self, n, r):
        if r > n:
            return 0
        if self.factorial is None:
            self.set_factorial()
        numerator = self.factorial[n]
        denominator = self.factorial[r] * self.factorial[n-r] % self.MOD
        return numerator * self.pow(denominator, self.MOD-2, self.MOD) % self.MOD

    def get_long_array(self, size):
        return [self.next_long() for _ in range(size)]

    def get_int_array(self, size):
        return [self.next_int() for _ in range(size)]

    def get_string_array(self, size):
        return [self.next() for _ in range(size)]

    def join_elements(self, *args):
        return ' '.join(str(x) for x in args)

    def gcd(self, a, b):
        return a if b == 0 else self.gcd(b, a % b)

    def max(self, *args):
        return max(args)

    def min(self, *args):
        return min(args)

    def sum(self, *args):
        return sum(args)

    def shuffle(self, arr):
        random.shuffle(arr)

    def reverse(self, arr):
        arr.reverse()

    def pow(self, base, exp, mod):
        base %= mod
        ret = 1
        while exp > 0:
            if exp & 1:
                ret = ret * base % mod
            base = base * base % mod
            exp >>= 1
        return ret

    def init_io(self, in_stream=None, out_stream=None):
        if in_stream:
            self.in_stream = in_stream
        if out_stream:
            self.out = out_stream

    def _fill_buffer(self):
        self.buf = self.in_stream.buffer.read(1 << 20)
        self.index = 0
        self.total = len(self.buf) if self.buf else 0

    def _read_byte(self):
        if self.index >= self.total:
            self._fill_buffer()
            if self.total == 0:
                return -1
        byte_val = self.buf[self.index]
        self.index += 1
        return byte_val

    def next(self):
        c = self._read_byte()
        while c <= 32 and c != -1:
            c = self._read_byte()
        if c == -1:
            return ''
        sb = []
        while c > 32:
            sb.append(chr(c))
            c = self._read_byte()
        return ''.join(sb)

    def next_int(self):
        c = self._read_byte()
        while c <= 32 and c != -1:
            c = self._read_byte()
        neg = False
        if c == ord('-'):
            neg = True
            c = self._read_byte()
        elif c == ord('+'):
            c = self._read_byte()
        val = 0
        while ord('0') <= c <= ord('9'):
            val = val * 10 + (c - ord('0'))
            c = self._read_byte()
        return -val if neg else val

    def next_long(self):
        c = self._read_byte()
        while c <= 32 and c != -1:
            c = self._read_byte()
        neg = False
        if c == ord('-'):
            neg = True
            c = self._read_byte()
        elif c == ord('+'):
            c = self._read_byte()
        val = 0
        while ord('0') <= c <= ord('9'):
            val = val * 10 + (c - ord('0'))
            c = self._read_byte()
        return -val if neg else val

    def print(self, *args, **kwargs):
        print(*args, end='', file=self.out, **kwargs)

    def printsp(self, *args, **kwargs):
        print(*args, end=' ', file=self.out, **kwargs)

    def println(self, *args, **kwargs):
        print(*args, file=self.out, **kwargs)

    def flush(self):
        self.out.flush()

class Solver:
    def __init__(self):
        self.hp = Helper(10**9+7, 1000006)
        self.hp.init_io(sys.stdin, sys.stdout)
        self.TESTCASES = False
        self.timer = None

    def solve(self):
        try:
            tc = self.hp.next_int() if self.TESTCASES else 1
            for tce in range(1, tc+1):
                self.solve_case(tce)
            self.hp.flush()
        except Exception as e:
            import traceback
            traceback.print_exc()
            sys.exit(1)

    def solve_case(self, tc):
        N = self.hp.next_int()
        K = self.hp.next_long()
        A = self.hp.get_int_array(N)
        
        straight = []
        cycle = []
        vis = [False] * N
        curr = 0
        
        while not vis[curr]:
            vis[curr] = True
            curr = A[curr] - 1
        
        st = 0
        while st != curr:
            straight.append(st)
            st = A[st] - 1
        
        cycle.append(curr)
        curr = A[curr] - 1
        while curr != cycle[0]:
            cycle.append(curr)
            curr = A[curr] - 1
        
        if K < len(straight):
            self.hp.println(straight[K] + 1)
        else:
            K -= len(straight)
            self.hp.println(cycle[K % len(cycle)] + 1)

def main():
    solver = Solver()
    solver.solve()

if __name__ == '__main__':
    main()

