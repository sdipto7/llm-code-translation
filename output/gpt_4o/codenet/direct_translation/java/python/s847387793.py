
import sys
import itertools

class Solver:
    def __init__(self, sc, writer):
        self.sc = sc
        self.writer = writer

    def run(self):
        self.n = self.sc.next_int()
        self.m = self.sc.next_int()
        self.q = self.sc.next_int()
        self.a = [0] * self.q
        self.b = [0] * self.q
        self.c = [0] * self.q
        self.d = [0] * self.q
        for i in range(self.q):
            self.a[i] = self.sc.next_int()
            self.b[i] = self.sc.next_int()
            self.c[i] = self.sc.next_int()
            self.d[i] = self.sc.next_int()
        self.max = 0
        self.dfs([1])
        self.writer.write(f"{self.max}\n")

    def dfs(self, array):
        if len(array) > self.n:
            score = 0
            for i in range(self.q):
                if array[self.b[i]] - array[self.a[i]] == self.c[i]:
                    score += self.d[i]
            self.max = max(self.max, score)
            return
        new_array = array + [array[-1]]
        while new_array[-1] <= self.m:
            self.dfs(new_array)
            new_array[-1] += 1

class FastScanner:
    def __init__(self):
        self.buffer = sys.stdin.read().split()
        self.index = 0

    def next(self):
        result = self.buffer[self.index]
        self.index += 1
        return result

    def next_int(self):
        return int(self.next())

    def next_float(self):
        return float(self.next())

    def next_int_array(self, n):
        return [self.next_int() for _ in range(n)]

    def next_float_array(self, n):
        return [self.next_float() for _ in range(n)]

def main():
    sc = FastScanner()
    writer = sys.stdout
    solver = Solver(sc, writer)
    solver.run()

if __name__ == "__main__":
    main()

