
import sys

class BUnhappyHackingABCEdit:
    def solve(self, testNumber, in_, out):
        s = in_.string()
        d = []
        for c in s:
            if c == '0':
                d.append('0')
            elif c == '1':
                d.append('1')
            elif c == 'B' and d:
                d.pop()
        out.write(''.join(d) + '\n')

class LightScanner:
    def __init__(self, in_):
        self.reader = in_.readline
        self.buffer = []
        self.index = 0

    def string(self):
        if self.index == len(self.buffer):
            line = self.reader().split()
            self.buffer.extend(line)
            self.index = 0
        result = self.buffer[self.index]
        self.index += 1
        return result

def main():
    in_ = LightScanner(sys.stdin)
    out = sys.stdout
    solver = BUnhappyHackingABCEdit()
    solver.solve(1, in_, out)

if __name__ == "__main__":
    main()

