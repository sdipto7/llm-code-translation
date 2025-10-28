
import sys

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
        out_writer.write(f"{ans}\n")

class InputReader:
    def __init__(self, stream):
        self.reader = stream
        self.buffer = []
        self.tokenizer = None

    def n(self):
        while not self.tokenizer or not self.tokenizer.hasMoreTokens():
            line = self.reader.readline()
            if not line:
                break
            self.tokenizer = StringTokenizer(line)
        return self.tokenizer.nextToken()

    def ni(self):
        return int(self.n())

class StringTokenizer:
    def __init__(self, line):
        self.tokens = line.split()
        self.index = 0

    def hasMoreTokens(self):
        return self.index < len(self.tokens)

    def nextToken(self):
        token = self.tokens[self.index]
        self.index += 1
        return token

def main():
    in_reader = InputReader(sys.stdin)
    out_writer = sys.stdout
    sol = Solution()
    sol.solve(in_reader, out_writer)

if __name__ == "__main__":
    main()

