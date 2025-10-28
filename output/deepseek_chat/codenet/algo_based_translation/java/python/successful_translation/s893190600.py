
import sys

def main():
    input_stream = sys.stdin
    output_stream = sys.stdout
    in_obj = MyInput(input_stream)
    out = sys.stdout

    solver = Solver(in_obj, out)
    solver.solve()

class Solver:
    def __init__(self, in_obj, out):
        self.in_obj = in_obj
        self.out = out

    def solve(self):
        H = self.ni()
        W = self.ni()
        C = [[''] * (W + 2) for _ in range(H + 2)]
        for i in range(H):
            c_line = self.ns()
            c_chars = list(c_line)
            for j in range(W):
                C[i + 1][j + 1] = c_chars[j]
        if H == 1 and W == 1:
            self.prn("No")
            return
        for i in range(1, H + 1):
            for j in range(1, W + 1):
                if C[i][j] == '#' and C[i - 1][j] != '#' and C[i + 1][j] != '#' and C[i][j - 1] != '#' and C[i][j + 1] != '#':
                    self.prn("No")
                    return
        self.prn("Yes")

    def prn(self, s):
        print(s)

    def ni(self):
        return self.in_obj.nextInt()

    def nl(self):
        return self.in_obj.nextLong()

    def nd(self):
        return self.in_obj.nextDouble()

    def ns(self):
        return self.in_obj.nextString()

class MyInput:
    def __init__(self, input_stream):
        self.in_stream = input_stream
        self.buffer = []
        self.pos = 0
        self.read_len = 0

    def read(self):
        if self.pos >= self.read_len:
            self.pos = 0
            try:
                data = self.in_stream.read(1024)
                if not data:
                    raise EOFError()
                self.buffer = list(data)
                self.read_len = len(self.buffer)
            except:
                raise RuntimeError()
        if self.pos < self.read_len:
            char = self.buffer[self.pos]
            self.pos += 1
            return ord(char)
        return -1

    def nextInt(self):
        chars = []
        while True:
            c = self.read()
            if c == -1:
                break
            if chr(c).isspace():
                if chars:
                    break
                continue
            chars.append(chr(c))
        num_str = ''.join(chars)
        if num_str.startswith('-'):
            return -int(num_str[1:])
        return int(num_str)

    def nextLong(self):
        chars = []
        while True:
            c = self.read()
            if c == -1:
                break
            if chr(c).isspace():
                if chars:
                    break
                continue
            chars.append(chr(c))
        num_str = ''.join(chars)
        if num_str.startswith('-'):
            return -int(num_str[1:])
        return int(num_str)

    def nextDouble(self):
        chars = []
        decimal_found = False
        while True:
            c = self.read()
            if c == -1:
                break
            char_val = chr(c)
            if char_val.isspace():
                if chars:
                    break
                continue
            if char_val == '.':
                decimal_found = True
            chars.append(char_val)
        num_str = ''.join(chars)
        if num_str.startswith('-'):
            return -float(num_str[1:])
        return float(num_str)

    def nextString(self):
        chars = []
        while True:
            c = self.read()
            if c == -1:
                break
            char_val = chr(c)
            if char_val.isspace():
                if chars:
                    break
                continue
            chars.append(char_val)
        return ''.join(chars)

if __name__ == "__main__":
    main()

