
import sys
import math
import random
import time

class Main:
    def __init__(self):
        self.solver = Solver()
        self.solver.solve()

class Solver:
    def __init__(self):
        self.hp = Helper(10**9 + 7, 1000006)
        self.hp.initIO(sys.stdin, sys.stdout)
        self.timer = time.Timer(4.7, self.hp.flush_and_exit)
        self.timer.start()
        self.TESTCASES = False

    def solve(self):
        tc = self.hp.nextInt() if self.TESTCASES else 1
        for tce in range(1, tc + 1):
            self.solve_case(tce)
        self.timer.cancel()
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
        self.rnd = random.Random()

    def initIO(self, input_stream, output_stream):
        self.input = input_stream
        self.output = output_stream
        self.buffer = []
        self.buffer_index = 0

    def next(self):
        if self.buffer_index == len(self.buffer):
            self.buffer = self.input.readline().split()
            self.buffer_index = 0
        result = self.buffer[self.buffer_index]
        self.buffer_index += 1
        return result

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return int(self.next())

    def getIntArray(self, size):
        return [self.nextInt() for _ in range(size)]

    def println(self, a=''):
        self.output.write(str(a) + '\n')

    def flush(self):
        self.output.flush()

    def flush_and_exit(self):
        self.flush()
        sys.exit(0)

