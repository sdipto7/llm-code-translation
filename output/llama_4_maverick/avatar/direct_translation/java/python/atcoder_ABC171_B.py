
import sys

class InputReader:
    def __init__(self, stream):
        self.stream = stream
        self.tokenizer = None

    def _read_line(self):
        return self.stream.readline().decode().strip()

    def _tokenize(self):
        line = self._read_line()
        self.tokenizer = iter(line.split())

    def n(self):
        if self.tokenizer is None or not self._has_more_tokens():
            self._tokenize()
        return next(self.tokenizer)

    def _has_more_tokens(self):
        try:
            next(self.tokenizer)
            return True
        except StopIteration:
            return False

    def ni(self):
        return int(self.n())

class Solution:
    def solve(self, in_reader, out_stream):
        n = in_reader.ni()
        k = in_reader.ni()
        a = [in_reader.ni() for _ in range(n)]
        a.sort()
        ans = sum(a[:k])
        print(ans, file=out_stream)

def main():
    in_stream = sys.stdin
    out_stream = sys.stdout
    in_reader = InputReader(in_stream)
    sol = Solution()
    sol.solve(in_reader, out_stream)

if __name__ == "__main__":
    main()

