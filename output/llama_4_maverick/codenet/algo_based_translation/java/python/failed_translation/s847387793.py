
import sys

class FastScanner:
    def __init__(self):
        self.buffer = sys.stdin.read().split()
        self.index = 0

    def hasNext(self):
        return self.index < len(self.buffer)

    def next(self):
        if self.hasNext():
            result = self.buffer[self.index]
            self.index += 1
            return result
        else:
            raise Exception("No more input")

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


class Solver:
    def __init__(self, sc):
        self.sc = sc
        self.n = None
        self.m = None
        self.q = None
        self.max = 0
        self.a = None
        self.b = None
        self.c = None
        self.d = None

    def run(self):
        self.n = self.sc.nextInt()
        self.m = self.sc.nextInt()
        self.q = self.sc.nextInt()
        self.a = self.sc.nextIntArray(self.q)
        self.b = self.sc.nextIntArray(self.q)
        self.c = self.sc.nextIntArray(self.q)
        self.d = self.sc.nextIntArray(self.q)
        self.dfs([1])
        print(self.max)

    def dfs(self, array):
        if len(array) > self.n:
            score = sum([self.d[i] for i in range(self.q) if array[self.b[i]-1] - array[self.a[i]-1] == self.c[i]])
            self.max = max(self.max, score)
            return
        new_array = array + [array[-1]]
        while new_array[-1] <= self.m:
            self.dfs(new_array)
            new_array[-1] += 1


def main():
    sc = FastScanner()
    solver = Solver(sc)
    solver.run()


if __name__ == "__main__":
    main()

