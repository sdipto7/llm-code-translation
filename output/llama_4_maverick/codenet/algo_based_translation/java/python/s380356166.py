
import sys

class MyInput:
    def __init__(self, stream):
        self.stream = stream
        self.buffer = ''
        self.pos = 0

    def read(self):
        if self.pos >= len(self.buffer):
            self.buffer = self.stream.readline()
            self.pos = 0
        if not self.buffer:
            raise EOFError
        self.pos += 1
        return self.buffer[self.pos - 1]

    def next_int(self):
        c = self.read()
        while c.isspace():
            c = self.read()
        x = 0
        sign = 1
        if c == '-':
            sign = -1
            c = self.read()
        while c.isdigit():
            x = 10 * x + int(c)
            c = self.read()
        return sign * x

    def next_long(self):
        return self.next_int()

    def next_string(self):
        c = self.read()
        while c.isspace():
            c = self.read()
        s = ''
        while not c.isspace():
            s += c
            c = self.read()
        return s

class Solver:
    def solve(self, test_number, inp, out):
        ans = 0
        K = inp.next_int()
        S = inp.next_int()
        wk = 0
        for x in range(K + 1):
            for y in range(K + 1):
                wk = S - x - y
                if 0 <= wk <= K:
                    ans += 1
        out.write(str(ans) + '\n')

def main():
    inp = MyInput(sys.stdin)
    out = sys.stdout
    solver = Solver()
    solver.solve(1, inp, out)

if __name__ == "__main__":
    main()

