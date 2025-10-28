
import sys
from collections import defaultdict

class InputReader:
    def __init__(self, input_stream):
        self.input_stream = input_stream
        self.buffer = []
        self.index = 0
    
    def next_string(self):
        while self.index >= len(self.buffer):
            self.buffer = self.input_stream.readline().strip().split()
            self.index = 0
        result = self.buffer[self.index]
        self.index += 1
        return result
    
    def next_int(self):
        return int(self.next_string())
    
    def next_int_array(self, n):
        return [self.next_int() for _ in range(n)]

class TaskD:
    def solve(self, test_number, in_reader, out_writer):
        n = in_reader.next_int()
        m = in_reader.next_int()
        a = in_reader.next_int_array(n)
        dp = defaultdict(int)
        ans = 0
        base = 0
        for i in range(n):
            base = (base - a[i] % m + m) % m
            dp[(base + a[i]) % m] += 1
            ans += dp.get(base, 0)
        out_writer.write(f"{ans}\n")

def main():
    input_stream = sys.stdin
    output_stream = sys.stdout
    in_reader = InputReader(input_stream)
    out_writer = output_stream
    solver = TaskD()
    solver.solve(1, in_reader, out_writer)

if __name__ == "__main__":
    main()

