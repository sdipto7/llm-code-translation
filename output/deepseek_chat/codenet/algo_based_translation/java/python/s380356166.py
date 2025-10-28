
import sys

class MyInput:
    def __init__(self, stream):
        self.in_stream = stream
        self.buffer = []
        self.pos = 0
        self.read_len = 0
    
    def read(self):
        if self.pos >= self.read_len:
            self.buffer = list(sys.stdin.read(1024))
            self.read_len = len(self.buffer)
            self.pos = 0
            if self.read_len <= 0:
                raise EOFError()
        char = self.buffer[self.pos]
        self.pos += 1
        return char
    
    def next_int(self):
        chars = []
        while True:
            c = self.read()
            if not c.isspace():
                chars.append(c)
                break
        
        while True:
            c = self.read()
            if c.isspace():
                break
            chars.append(c)
        
        num_str = ''.join(chars)
        if num_str[0] == '-':
            return -int(num_str[1:])
        else:
            return int(num_str)

class Solver:
    def solve(self, test_number, inp, out):
        K = inp.next_int()
        S = inp.next_int()
        ans = 0
        
        for x in range(0, K + 1):
            for y in range(0, K + 1):
                wk = S - x - y
                if wk >= 0 and wk <= K:
                    ans += 1
        
        out.write(str(ans) + '\n')

def main():
    inp = MyInput(sys.stdin)
    out = sys.stdout
    
    solver = Solver()
    solver.solve(1, inp, out)
    
    out.flush()

if __name__ == '__main__':
    main()

