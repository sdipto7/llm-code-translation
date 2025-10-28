
import sys
from io import StringIO
from collections import deque

class InputReader:
    def __init__(self, stream):
        self.reader = StringIO(stream.read())
        self.tokens = deque()

    def next(self):
        while not self.tokens:
            line = self.reader.readline()
            if not line:
                raise RuntimeError("No more input")
            self.tokens.extend(line.split())
        return self.tokens.popleft()

class TaskD:
    def solve(self, testNumber, in_reader, out):
        S = in_reader.next()
        score = 0
        for i in range(len(S)):
            my = 'g' if i % 2 == 0 else 'p'
            his = S[i]
            if my != his:
                if my == 'p':
                    score += 1
                else:
                    score -= 1
        out.write(f"{score}\n")

def main():
    in_reader = InputReader(sys.stdin)
    out = sys.stdout
    solver = TaskD()
    solver.solve(1, in_reader, out)

if __name__ == "__main__":
    main()

