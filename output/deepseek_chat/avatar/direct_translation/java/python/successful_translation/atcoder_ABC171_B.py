
import sys
import bisect

class InputReader:
    def __init__(self, stream):
        self.reader = stream
        self.tokenizer = None

    def n(self):
        while self.tokenizer is None or not self.tokenizer:
            self.tokenizer = sys.stdin.readline().split()
        return self.tokenizer.pop(0)

    def ni(self):
        return int(self.n())

class Solution:
    def solve(self, in_, out):
        n, k = in_.ni(), in_.ni()
        a = [in_.ni() for _ in range(n)]
        a.sort()
        ans = sum(a[:k])
        print(ans)

def main():
    in_ = InputReader(sys.stdin)
    out = sys.stdout
    sol = Solution()
    sol.solve(in_, out)

if __name__ == "__main__":
    main()

