
import sys
import math
import bisect
from collections import deque, defaultdict, Counter, OrderedDict

class Solver:
    def __init__(self, in_, out):
        self.in_ = in_
        self.out = out

    def solve(self):
        H = self.ni()
        W = self.ni()
        C = [['.'] * (W + 2) for _ in range(H + 2)]
        for i in range(H):
            c = self.ns()
            for j in range(W):
                C[i + 1][j + 1] = c[j]
        if H == 1 and W == 1:
            self.prn("No")
            return
        for i in range(1, H + 1):
            for j in range(1, W + 1):
                if C[i][j] == '#' and C[i - 1][j] != '#' and C[i + 1][j] != '#' and C[i][j - 1] != '#' and C[i][j + 1] != '#':
                    self.prn("No")
                    return
        self.prn("Yes")

    def prn(self, s):
        self.out.write(str(s) + '\n')

    def ni(self):
        return int(self.ns())

    def ns(self):
        return self.in_.readline().strip()

class MyInput:
    def __init__(self, in_):
        self.in_ = in_

    def readline(self):
        return self.in_.readline()

    def read(self):
        return self.in_.read()

    def nextString(self):
        return self.readline().strip()

    def nextInt(self):
        return int(self.nextString())

    def nextDouble(self):
        return float(self.nextString())

    def nextLong(self):
        return int(self.nextString())

    def nextDChar(self):
        return list(self.nextString())

def main():
    in_ = MyInput(sys.stdin)
    out = sys.stdout
    solver = Solver(in_, out)
    solver.solve()

if __name__ == '__main__':
    main()

