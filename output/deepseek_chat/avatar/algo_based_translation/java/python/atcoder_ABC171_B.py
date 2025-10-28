
import sys
from io import BufferedReader, InputStreamReader
from tokenize import generate_tokens, STRING
from collections import deque

class InputReader:
    def __init__(self, stream):
        self.reader = BufferedReader(InputStreamReader(stream))
        self.tokenizer = deque()
    
    def n(self):
        while not self.tokenizer:
            line = self.reader.readline()
            if not line:
                break
            tokens = generate_tokens(iter([line]).__next__)
            for token in tokens:
                if token.type == STRING:
                    self.tokenizer.append(token.string)
        return self.tokenizer.popleft() if self.tokenizer else None
    
    def ni(self):
        return int(self.n())

class Solution:
    def solve(self, in_reader, out_writer):
        n = in_reader.ni()
        k = in_reader.ni()
        a = [0] * n
        for i in range(n):
            a[i] = in_reader.ni()
        a.sort()
        ans = 0
        for i in range(k):
            ans += a[i]
        out_writer.write(str(ans) + '\n')

def main():
    input_stream = sys.stdin
    output_stream = sys.stdout
    in_reader = InputReader(input_stream)
    out_writer = output_stream
    sol = Solution()
    sol.solve(in_reader, out_writer)
    out_writer.flush()

if __name__ == '__main__':
    main()

