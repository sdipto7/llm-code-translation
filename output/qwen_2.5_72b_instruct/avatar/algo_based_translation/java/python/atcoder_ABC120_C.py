
import sys
from io import StringIO
from collections import deque

class TaskB:
    def solve(self, testNumber, in_reader, out_writer):
        x = in_reader.next()
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
        out_writer.write(f"{c * 2}\n")

class InputReader:
    def __init__(self, stream):
        self.reader = StringIO(stream.read())
        self.tokenizer = None

    def next(self):
        while self.tokenizer is None or not self.tokenizer.hasMoreTokens():
            line = self.reader.readline()
            if not line:
                raise RuntimeError("Expected more input")
            self.tokenizer = StringTokenizer(line)
        return self.tokenizer.nextToken()

class StringTokenizer:
    def __init__(self, line):
        self.tokens = line.split()
        self.index = 0

    def hasMoreTokens(self):
        return self.index < len(self.tokens)

    def nextToken(self):
        if self.index >= len(self.tokens):
            raise RuntimeError("No more tokens")
        token = self.tokens[self.index]
        self.index += 1
        return token

def main():
    input_stream = sys.stdin
    output_stream = sys.stdout
    in_reader = InputReader(input_stream)
    out_writer = StringIO()
    solver = TaskB()
    solver.solve(1, in_reader, out_writer)
    output_stream.write(out_writer.getvalue())

if __name__ == "__main__":
    main()

