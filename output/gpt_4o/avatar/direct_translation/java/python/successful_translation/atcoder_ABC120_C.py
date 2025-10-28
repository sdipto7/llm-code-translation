
import sys
from collections import deque

class TaskB:
    def solve(self, testNumber, in_stream, out_stream):
        x = in_stream.readline().strip()
        s = deque()
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
        out_stream.write(f"{c * 2}\n")

class InputReader:
    def __init__(self, stream):
        self.reader = stream
        self.tokenizer = None

    def next(self):
        while self.tokenizer is None or not self.tokenizer:
            self.tokenizer = self.reader.readline().strip().split()
        return self.tokenizer.pop(0)

if __name__ == "__main__":
    in_stream = sys.stdin
    out_stream = sys.stdout
    solver = TaskB()
    solver.solve(1, in_stream, out_stream)

