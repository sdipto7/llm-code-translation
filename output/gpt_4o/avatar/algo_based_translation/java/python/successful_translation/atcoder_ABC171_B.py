
import sys
from functools import cmp_to_key

class Solution:
    def solve(self, in_reader, out_writer):
        n = in_reader.ni()
        k = in_reader.ni()
        a = [in_reader.ni() for _ in range(n)]
        a.sort()
        ans = sum(a[i] for i in range(k))
        out_writer.write(f"{ans}\n")

class InputReader:
    def __init__(self, stream):
        self.reader = stream
        self.tokenizer = None

    def n(self):
        while self.tokenizer is None or not self.tokenizer:
            try:
                self.tokenizer = sys.stdin.readline().split()
            except Exception as e:
                raise RuntimeError(e)
        return self.tokenizer.pop(0)
    
    def ni(self):
        return int(self.n())

def main():
    input_stream = sys.stdin
    output_stream = sys.stdout
    in_reader = InputReader(input_stream)
    out_writer = output_stream
    sol = Solution()
    sol.solve(in_reader, out_writer)

if __name__ == "__main__":
    main()

