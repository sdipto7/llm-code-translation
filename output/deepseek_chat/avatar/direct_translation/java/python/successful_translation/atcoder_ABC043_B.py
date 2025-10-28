
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
            elif c == 'B':
                if d:
                    d.pop()
        out.write(''.join(d) + '\n')

class LightScanner:
    def __init__(self, in_):
        self.reader = in_

    def string(self):
        return self.reader.readline().strip()

def main():
    inputStream = sys.stdin
    outputStream = sys.stdout
    in_ = LightScanner(inputStream)
    out = outputStream
    solver = BUnhappyHackingABCEdit()
    solver.solve(1, in_, out)

if __name__ == "__main__":
    main()

