
import sys

class LightScanner:
    def __init__(self, inp):
        self.reader = inp

    def string(self):
        return self.reader.readline().strip()

def solve(testNumber, inp, out):
    s = inp.string()
    d = []
    for c in s:
        if c == '0' or c == '1':
            d.append(c)
        elif c == 'B':
            if d:
                d.pop()
    out.write(''.join(d) + '\n')

def main():
    inp = LightScanner(sys.stdin)
    solve(1, inp, sys.stdout)

if __name__ == "__main__":
    main()

