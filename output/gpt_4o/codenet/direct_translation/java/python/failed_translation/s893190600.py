
import sys
from collections import defaultdict, deque
from sys import setrecursionlimit, stdin, stdout

setrecursionlimit(10**6)

class Main:

    class Solver:
        def __init__(self, in_data, out_data):
            self.in_data = in_data
            self.out_data = out_data

        def solve(self):
            H = self.ni()
            W = self.ni()
            C = [['.'] * (W + 2) for _ in range(H + 2)]
            for i in range(1, H + 1):
                c = list(self.ns())
                for j in range(1, W + 1):
                    C[i][j] = c[j - 1]
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
            self.out_data.write(str(s) + '\n')

        def ni(self):
            return int(self.in_data.readline().strip())

        def ns(self):
            return self.in_data.readline().strip()

    def __init__(self):
        input_stream = stdin
        output_stream = stdout
        in_data = input_stream
        out_data = output_stream
        solver = Main.Solver(in_data, out_data)
        solver.solve()
        out_data.flush()

if __name__ == "__main__":
    Main()

