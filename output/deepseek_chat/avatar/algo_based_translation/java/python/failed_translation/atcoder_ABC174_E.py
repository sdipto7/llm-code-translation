
import sys
import math

class InputReader:
    def __init__(self, stream):
        self.reader = stream
        self.tokenizer = None
    
    def next(self):
        while self.tokenizer is None or not self.tokenizer:
            try:
                line = self.reader.readline()
                self.tokenizer = line.split()
            except:
                raise RuntimeError()
        token = self.tokenizer[0]
        self.tokenizer = self.tokenizer[1:]
        return token
    
    def next_int(self):
        return int(self.next())
    
    def read_array(self, n):
        a = [0] * n
        for i in range(n):
            a[i] = self.next_int()
        return a

class Solution:
    def solve(self, in_reader, out):
        n = in_reader.next_int()
        k = in_reader.next_int()
        logs_length = in_reader.read_array(n)
        
        min_val = 1
        max_val = 1000000100
        
        while min_val < max_val:
            mid = (min_val + max_val) // 2
            if self.nei(mid, logs_length, k):
                max_val = mid
            else:
                min_val = mid + 1
        
        out.write(str(min_val) + '\n')
    
    def nei(self, mid, logs_length, k):
        for log in logs_length:
            k -= (log + mid - 1) // mid - 1
        return k >= 0

def main():
    input_stream = sys.stdin
    output_stream = sys.stdout
    
    in_reader = InputReader(input_stream)
    sol = Solution()
    sol.solve(in_reader, output_stream)

if __name__ == '__main__':
    main()

