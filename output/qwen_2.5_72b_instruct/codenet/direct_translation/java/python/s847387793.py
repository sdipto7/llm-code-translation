
import sys

class Solver:
    def __init__(self, sc, writer):
        self.sc = sc
        self.writer = writer

    def run(self):
        self.n = self.sc.nextInt()
        self.m = self.sc.nextInt()
        self.q = self.sc.nextInt()
        self.a = [0] * self.q
        self.b = [0] * self.q
        self.c = [0] * self.q
        self.d = [0] * self.q
        for i in range(self.q):
            self.a[i] = self.sc.nextInt()
            self.b[i] = self.sc.nextInt()
            self.c[i] = self.sc.nextInt()
            self.d[i] = self.sc.nextInt()
        self.max = 0
        self.dfs([1])
        self.writer.write(str(self.max) + '\n')

    def dfs(self, array):
        if len(array) > self.n:
            score = 0
            for i in range(self.q):
                if array[self.b[i]] - array[self.a[i]] == self.c[i]:
                    score += self.d[i]
            self.max = max(self.max, score)
            return

        newArray = array + [array[-1]]
        while newArray[-1] <= self.m:
            self.dfs(newArray)
            newArray[-1] += 1

class FastScanner:
    def __init__(self):
        self.buffer = sys.stdin.buffer.read().splitlines()
        self.ptr = 0
        self.tokens = []

    def hasNext(self):
        while not self.tokens:
            if self.ptr >= len(self.buffer):
                return False
            self.tokens = self.buffer[self.ptr].split()
            self.ptr += 1
        return True

    def next(self):
        if not self.hasNext():
            raise StopIteration
        return self.tokens.pop(0).decode('ascii')

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return int(self.next())

    def nextDouble(self):
        return float(self.next())

    def nextIntArray(self, n):
        return [self.nextInt() for _ in range(n)]

    def nextLongArray(self, n):
        return [self.nextLong() for _ in range(n)]

sc = FastScanner()
sys.setrecursionlimit(1000000)
solver = Solver(sc, sys.stdout)
solver.run()

