
import sys

class MyInput:
    def __init__(self):
        self.input_stream = sys.stdin

    def next_int(self):
        return int(self.input_stream.readline().strip())

    def next_string(self):
        return self.input_stream.readline().strip()

class Solver:
    def __init__(self, input_stream):
        self.in_stream = MyInput()
        self.out_stream = sys.stdout

    def solve(self):
        H = self.in_stream.next_int()
        W = self.in_stream.next_int()
        C = [['.' for _ in range(W + 2)] for _ in range(H + 2)]
        for i in range(H):
            c = list(self.in_stream.next_string())
            for j in range(W):
                C[i + 1][j + 1] = c[j]
        if H == 1 and W == 1:
            self.out_stream.write('No\n')
            return
        for i in range(1, H + 1):
            for j in range(1, W + 1):
                if C[i][j] == '#' and C[i - 1][j] != '#' and C[i + 1][j] != '#' and C[i][j - 1] != '#' and C[i][j + 1] != '#':
                    self.out_stream.write('No\n')
                    return
        self.out_stream.write('Yes\n')

def main():
    solver = Solver(sys.stdin)
    solver.solve()

if __name__ == "__main__":
    main()

