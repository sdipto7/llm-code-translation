
import sys

class TaskB:
    def solve(self, test_number, in_, out_):
        x = in_.next()
        s = []
        c = 0
        for i in range(len(x)):
            s.append(x[i])
            while len(s) > 1:
                p = s.pop()
                q = s.pop()
                if (p == '1' and q == '0') or (p == '0' and q == '1'):
                    c += 1
                    continue
                else:
                    s.append(q)
                    s.append(p)
                    break
        print(c * 2)

class InputReader:
    def __init__(self, stream):
        self.reader = iter(sys.stdin.read().split())

    def next(self):
        return next(self.reader)

def main():
    input_stream = sys.stdin
    output_stream = sys.stdout
    in_ = InputReader(input_stream)
    out_ = sys.stdout
    solver = TaskB()
    solver.solve(1, in_, out_)

if __name__ == "__main__":
    main()

