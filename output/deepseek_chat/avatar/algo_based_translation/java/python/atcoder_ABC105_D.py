
import sys
from collections import defaultdict

class InputReader:
    def __init__(self, input_stream):
        self.br = input_stream
        self.st = []
    
    def next_string(self):
        while not self.st:
            try:
                self.st = self.br.readline().split()
            except:
                raise Exception("Input error")
        return self.st.pop(0)
    
    def next_int(self):
        return int(self.next_string())
    
    def next_int_array(self, n):
        res = []
        for i in range(n):
            res.append(self.next_int())
        return res

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
            key = (base + a[i]) % m
            dp[key] += 1
            ans += dp.get(base, 0)
        
        out_writer.write(str(ans) + '\n')

def main():
    input_stream = sys.stdin
    output_stream = sys.stdout
    in_reader = InputReader(input_stream)
    out_writer = output_stream
    solver = TaskD()
    solver.solve(1, in_reader, out_writer)

if __name__ == '__main__':
    main()

