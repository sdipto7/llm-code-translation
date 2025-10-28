
import sys

class LightScanner:
    def __init__(self, stream):
        self.stream = stream
        self.tokens = []

    def string(self):
        if not self.tokens:
            line = self.stream.readline().strip()
            self.tokens = line.split()
        return self.tokens.pop(0)

class BUnhappyHackingABCEdit:
    def solve(self, test_number, in_stream, out_stream):
        s = in_stream.string()
        d = []
        for c in s:
            if c == '0' or c == '1':
                d.append(c)
            elif c == 'B' and d:
                d.pop()
        out_stream.write(''.join(d) + '\n')

def main():
    in_stream = sys.stdin
    out_stream = sys.stdout
    scanner = LightScanner(in_stream)
    solver = BUnhappyHackingABCEdit()
    solver.solve(1, scanner, out_stream)
    out_stream.flush()

if __name__ == "__main__":
    main()

