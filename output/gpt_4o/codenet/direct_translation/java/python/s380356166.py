
import sys
from collections import deque

class Solver:
    def solve(self, test_number, in_file, out_file):
        ans = 0
        K = in_file.next_int()
        S = in_file.next_int()
        for x in range(K + 1):
            for y in range(K + 1):
                wk = S - x - y
                if 0 <= wk <= K:
                    ans += 1
        out_file.write(f"{ans}\n")

class MyInput:
    def __init__(self, input_stream):
        self.input = input_stream
        self.buffer = deque()
    
    def read(self):
        if not self.buffer:
            self.buffer.extend(self.input.readline().strip())
        return self.buffer.popleft()
    
    def next_int(self):
        num_str = ''
        while True:
            c = self.read()
            if c.isdigit() or c == '-':
                num_str += c
            else:
                break
        return int(num_str)

    def next_string(self):
        return self.input.readline().strip()

def main():
    in_file = MyInput(sys.stdin)
    out_file = sys.stdout
    solver = Solver()
    solver.solve(1, in_file, out_file)

if __name__ == "__main__":
    main()

