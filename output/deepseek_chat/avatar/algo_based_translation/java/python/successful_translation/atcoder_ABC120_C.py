
import sys
from collections import deque

class InputReader:
    def __init__(self, stream):
        self.reader = stream
        self.tokenizer = None
    
    def next(self):
        while self.tokenizer is None or not self.tokenizer:
            try:
                line = self.reader.readline()
                self.tokenizer = line.split()
            except:
                raise RuntimeError()
        return self.tokenizer.pop(0)

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
        out_writer.write(str(c * 2) + '\n')

def main():
    input_stream = sys.stdin
    output_stream = sys.stdout
    in_reader = InputReader(input_stream)
    out_writer = output_stream
    solver = TaskB()
    solver.solve(1, in_reader, out_writer)
    out_writer.flush()

if __name__ == '__main__':
    main()

