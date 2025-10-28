import sys
from io import StringIO
import re

class LightScanner:
    def __init__(self, in_stream):
        self.reader = in_stream
        self.buffer = []
        self.tokenizer = None

    def string(self):
        if not self.buffer:
            line = self.reader.readline()
            if not line:
                return None
            self.tokenizer = re.findall(r'\S+', line)
        return self.buffer.pop(0) if self.buffer else self.tokenizer.pop(0) if self.tokenizer else None

class BUnhappyHackingABCEdit:
    def solve(self, testNumber, in_scanner, out):
        s = in_scanner.string()
        d = []
        for c in s:
            if c == '0':
                d.append('0')
            elif c == '1':
                d.append('1')
            elif c == 'B' and d:
                d.pop()
        out.write(''.join(d) + '\n')

def main():
    in_stream = sys.stdin
    out_stream = sys.stdout
    in_scanner = LightScanner(in_stream)
    out = out_stream
    solver = BUnhappyHackingABCEdit()
    solver.solve(1, in_scanner, out)

if __name__ == '__main__':
    main()
