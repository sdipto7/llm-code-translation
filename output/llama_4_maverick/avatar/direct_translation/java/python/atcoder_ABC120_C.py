
import sys

class InputReader:
    def __init__(self, stream):
        self.stream = stream
        self.tokenizer = None

    def next(self):
        if self.tokenizer is None or not self.tokenizer:
            line = self.stream.readline().decode().strip()
            self.tokenizer = line.split()
        return self.tokenizer.pop(0)

class TaskB:
    def solve(self, test_number, in_reader, out_stream):
        x = in_reader.next()
        s = []
        c = 0
        for char in x:
            s.append(char)
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
        out_stream.write(str(c * 2) + '\n')

def main():
    in_reader = InputReader(sys.stdin)
    out_stream = sys.stdout
    solver = TaskB()
    solver.solve(1, in_reader, out_stream)

if __name__ == "__main__":
    main()

