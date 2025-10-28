
import sys
import random
import math
from typing import List, Dict, Set, Optional, Union, Any, Iterator

class Main:
    def __init__(self):
        pass

    def run(self):
        try:
            Solver().solve()
            sys.exit(0)
        except (Exception, BaseException) as e:
            print(e, file=sys.stderr)
            sys.exit(1)

class Solver:
    def __init__(self):
        self.hp = Helper(int(1e9 + 7), 1000006)
        self.MAXN = 1000006
        self.MOD = int(1e9 + 7)
        self.TESTCASES = False

    def solve(self):
        try:
            tc = self.hp.next_int() if self.TESTCASES else 1
            for tce in range(1, tc + 1):
                self.solve_case(tce)
            self.hp.flush()
        except Exception as e:
            print(e, file=sys.stderr)

    def solve_case(self, tc):
        N = self.hp.next_int()
        K = self.hp.next_long()
        A = self.hp.get_int_array(N)

        straight = []
        cycle = []
        visited = [False] * N
        current = 0
        while not visited[current]:
            visited[current] = True
            current = A[current] - 1

        start = 0
        while start != current:
            straight.append(start)
            start = A[start] - 1

        cycle.append(current)
        current = A[current] - 1
        while current != cycle[0]:
            cycle.append(current)
            current = A[current] - 1

        if K < len(straight):
            self.hp.println(straight[int(K)] + 1)
        else:
            K -= len(straight)
            self.hp.println(cycle[int(K % len(cycle))] + 1)

class Helper:
    def __init__(self, MOD, MAXN):
        self.MOD = MOD
        self.MAXN = MAXN
        self.rnd = random.Random()
        self.buf = bytearray(1 << 20)
        self.index = 0
        self.total = 0
        self.bw = sys.stdout

    def next_int(self):
        c = self._scan()
        while c <= 32:
            c = self._scan()
        neg = c == ord('-')
        if c == ord('-') or c == ord('+'):
            c = self._scan()
        val = 0
        while c >= ord('0') and c <= ord('9'):
            val = (val << 3) + (val << 1) + (c & 15)
            c = self._scan()
        return -val if neg else val

    def next_long(self):
        c = self._scan()
        while c <= 32:
            c = self._scan()
        neg = c == ord('-')
        if c == ord('-') or c == ord('+'):
            c = self._scan()
        val = 0
        while c >= ord('0') and c <= ord('9'):
            val = (val << 3) + (val << 1) + (c & 15)
            c = self._scan()
        return -val if neg else val

    def get_int_array(self, size):
        return [self.next_int() for _ in range(size)]

    def println(self, obj):
        self.bw.write(str(obj) + '\n')

    def flush(self):
        self.bw.flush()

    def _scan(self):
        if self.index >= self.total:
            self.index = 0
            self.total = sys.stdin.buffer.readinto(self.buf)
            if self.total <= 0:
                return -1
        c = self.buf[self.index]
        self.index += 1
        return c

if __name__ == "__main__":
    Main().run()

