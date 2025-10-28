import sys
import math

class FastScanner:
    def __init__(self):
        self.br = sys.stdin
        self.lines = []
        self.current_line = 0

    def next(self):
        if self.current_line >= len(self.lines):
            self.lines = self.br.readline().split()
            self.current_line = 0
        result = self.lines[self.current_line]
        self.current_line += 1
        return result

    def nextLine(self):
        return self.br.readline().strip()

    def nextByte(self):
        return int(self.next())

    def nextShort(self):
        return int(self.next())

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return int(self.next())

    def nextDouble(self):
        return float(self.next())

in_ = FastScanner()
sc = sys.stdin
out = sys.stdout

n = in_.nextInt()
s = in_.nextInt()
max_ = 0
while n > 0:
    n -= 1
    f = in_.nextInt()
    t = in_.nextInt()
    if max_ < f + t:
        max_ = f + t

out.write(str(max(max_, s)) + '\n')
