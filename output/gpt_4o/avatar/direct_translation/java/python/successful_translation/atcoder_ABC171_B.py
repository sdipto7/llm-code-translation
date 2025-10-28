
import sys

class Solution:
    def solve(self, in_reader, out_writer):
        n = in_reader.ni()
        k = in_reader.ni()
        a = [in_reader.ni() for _ in range(n)]
        a.sort()
        ans = sum(a[:k])
        out_writer.write(f"{ans}\n")

class InputReader:
    def __init__(self, stream):
        self.reader = sys.stdin
        self.tokenizer = None

    def n(self):
        while self.tokenizer is None or not self.tokenizer.hasMoreTokens():
            line = self.reader.readline()
            if line == "":
                return None
            self.tokenizer = StringTokenizer(line)
        return self.tokenizer.nextToken()

    def ni(self):
        return int(self.n())

class StringTokenizer:
    def __init__(self, string):
        self.tokens = string.split()
        self.index = 0

    def hasMoreTokens(self):
        return self.index < len(self.tokens)

    def nextToken(self):
        token = self.tokens[self.index]
        self.index += 1
        return token

if __name__ == "__main__":
    input_reader = InputReader(sys.stdin)
    output_writer = sys.stdout
    sol = Solution()
    sol.solve(input_reader, output_writer)

