
import sys
from io import BufferedReader, TextIOWrapper
import itertools

class Solution:
    def solve(self, in_reader, out_writer):
        n = in_reader.next_int()
        k = in_reader.next_int()
        logs_length = in_reader.read_array(n)
        min_len = 1
        max_len = int(1e9) + 1000
        while min_len < max_len:
            mid = (min_len + max_len) // 2
            if self.nei(mid, logs_length, k):
                max_len = mid
            else:
                min_len = mid + 1
        out_writer.write(f"{min_len}\n")

    def nei(self, mid, logs_length, k):
        for log in logs_length:
            k -= (log + mid - 1) // mid - 1
        return k >= 0

class InputReader:
    def __init__(self, stream):
        self.reader = BufferedReader(TextIOWrapper(stream))
        self.tokenizer = None
    
    def next(self):
        while self.tokenizer is None or not self.tokenizer:
            line = self.reader.readline().decode('utf-8')
            self.tokenizer = itertools.chain(*map(str.split, [line]))
        return next(self.tokenizer)

    def next_int(self):
        return int(self.next())

    def read_array(self, n):
        return [self.next_int() for _ in range(n)]

def main():
    input_stream = sys.stdin.buffer
    output_stream = sys.stdout
    in_reader = InputReader(input_stream)
    out_writer = output_stream
    sol = Solution()
    sol.solve(in_reader, out_writer)

if __name__ == "__main__":
    main()

