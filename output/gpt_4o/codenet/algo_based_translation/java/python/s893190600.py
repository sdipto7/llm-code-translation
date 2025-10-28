
import sys

class MyInput:
    def __init__(self, input_stream):
        self.input_stream = input_stream
        self.buffer = []
    
    def next_int(self):
        return int(self.next_token())
    
    def next_long(self):
        return int(self.next_token())
    
    def next_double(self):
        return float(self.next_token())
    
    def next_string(self):
        return self.next_token()
    
    def next_token(self):
        while not self.buffer:
            line = self.input_stream.readline()
            if not line:
                raise EOFError
            self.buffer = line.split()
        return self.buffer.pop(0)

class Solver:
    def __init__(self, in_stream, out_stream):
        self.in_stream = in_stream
        self.out_stream = out_stream

    def solve(self):
        H = self.in_stream.next_int()
        W = self.in_stream.next_int()
        C = [['' for _ in range(W + 2)] for _ in range(H + 2)]
        
        for i in range(H):
            c = list(self.in_stream.next_string())
            for j in range(W):
                C[i + 1][j + 1] = c[j]
        
        if H == 1 and W == 1:
            self.prn("No")
            return
        
        for i in range(1, H + 1):
            for j in range(1, W + 1):
                if C[i][j] == '#' and C[i-1][j] != '#' and C[i+1][j] != '#' and C[i][j-1] != '#' and C[i][j+1] != '#':
                    self.prn("No")
                    return
        
        self.prn("Yes")
    
    def prn(self, s):
        print(s, file=self.out_stream)

def main():
    input_stream = sys.stdin
    output_stream = sys.stdout
    in_stream = MyInput(input_stream)
    out_stream = output_stream
    solver = Solver(in_stream, out_stream)
    solver.solve()

if __name__ == "__main__":
    main()

