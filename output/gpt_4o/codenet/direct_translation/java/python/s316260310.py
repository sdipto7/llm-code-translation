
import sys
import threading
from collections import deque
from random import randint

class Main:
    def run(self):
        try:
            Solver().solve()
            sys.exit(0)
        except Exception as e:
            print(e, file=sys.stderr)
            sys.exit(1)

class Solver:
    def __init__(self):
        self.MAXN = 1000006
        self.MOD = int(1e9) + 7
        self.hp = Helper(self.MOD, self.MAXN)
        self.hp.initIO(sys.stdin, sys.stdout)
        self.TESTCASES = False

    def solve(self):
        tc = self.hp.nextInt() if self.TESTCASES else 1
        for tce in range(1, tc + 1):
            self.solve_case(tce)
        self.hp.flush()

    def solve_case(self, tc):
        N = self.hp.nextInt()
        K = self.hp.nextLong()
        A = self.hp.getIntArray(N)

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

class Helper:
    def __init__(self, mod, maxn):
        self.MOD = mod
        self.MAXN = maxn
        self.rnd = randint
        self.buf = deque()
        self.index = 0
        self.total = 0
        self.in_stream = None
        self.bw = None

    def initIO(self, input_stream, output_stream):
        self.in_stream = input_stream
        self.bw = output_stream

    def scan(self):
        if not self.buf:
            self.buf.extend(self.in_stream.read().split())
        return self.buf.popleft()

    def next(self):
        return self.scan()

    def nextInt(self):
        return int(self.scan())

    def nextLong(self):
        return int(self.scan())

    def getIntArray(self, size):
        return [self.nextInt() for _ in range(size)]

    def print(self, a):
        self.bw.write(str(a))

    def println(self, a=''):
        self.bw.write(str(a) + '\n')

    def flush(self):
        self.bw.flush()

if __name__ == "__main__":
    threading.Thread(target=Main().run).start()

