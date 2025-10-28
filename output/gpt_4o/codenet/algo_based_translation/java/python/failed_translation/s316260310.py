
import sys
import threading
import random
import math
from functools import lru_cache

class Main:
    def run(self):
        try:
            Solver().solve()
            sys.exit(0)
        except Exception as e:
            print(e, file=sys.stderr)
            sys.exit(1)

    @staticmethod
    def main():
        Main().run()

class Solver:
    MAXN = 1000006
    MOD = 1000000007

    def __init__(self):
        self.hp = Helper(self.MOD, self.MAXN)
        self.hp.init_io(sys.stdin, sys.stdout)

    def solve(self):
        tc = self.hp.next_int() if self.TESTCASES else 1
        for tce in range(1, tc + 1):
            self.solve_case(tce)
        self.hp.flush()

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
            self.hp.println(straight[int(K)] + 1)
        else:
            K -= len(straight)
            self.hp.println(cycle[int(K % len(cycle))] + 1)

    TESTCASES = False

class Helper:
    BUFSIZE = 1 << 20

    def __init__(self, mod, maxn):
        self.MOD = mod
        self.MAXN = maxn
        self.rnd = random.Random()
        self.buf = bytearray(self.BUFSIZE)
        self.index = 0
        self.total = 0

    def init_io(self, input_stream, output_stream):
        self.in_stream = input_stream
        self.out_stream = output_stream

    def scan(self):
        if self.index >= self.total:
            self.index = 0
            self.total = self.in_stream.readinto(self.buf)
            if self.total <= 0:
                return -1
        result = self.buf[self.index]
        self.index += 1
        return result

    def next(self):
        c = self.scan()
        while c <= 32:
            c = self.scan()
        result = []
        while c > 32:
            result.append(chr(c))
            c = self.scan()
        return ''.join(result)

    def next_int(self):
        c = self.scan()
        val = 0
        while c <= 32:
            c = self.scan()
        neg = c == ord('-')
        if c == ord('-') or c == ord('+'):
            c = self.scan()
        while c >= ord('0') and c <= ord('9'):
            val = (val << 3) + (val << 1) + (c & 15)
            c = self.scan()
        return -val if neg else val

    def next_long(self):
        c = self.scan()
        val = 0
        while c <= 32:
            c = self.scan()
        neg = c == ord('-')
        if c == ord('-') or c == ord('+'):
            c = self.scan()
        while c >= ord('0') and c <= ord('9'):
            val = (val << 3) + (val << 1) + (c & 15)
            c = self.scan()
        return -val if neg else val

    def get_long_array(self, size):
        return [self.next_long() for _ in range(size)]

    def get_int_array(self, size):
        return [self.next_int() for _ in range(size)]

    def println(self, a=''):
        self.out_stream.write(f"{a}\n")

    def flush(self):
        self.out_stream.flush()

if __name__ == "__main__":
    Main.main()

