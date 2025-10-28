
import sys

class Solution:
    def solve(self, in_, out):
        n, k = in_.nextInt(), in_.nextInt()
        logsLength = in_.readArray(n)
        min_, max_ = 1, int(1e9) + 1000
        while min_ < max_:
            mid = (min_ + max_) // 2
            if self.nei(mid, logsLength, k):
                max_ = mid
            else:
                min_ = mid + 1
        out.write(str(min_) + '\n')

    def nei(self, mid, logsLength, k):
        for log in logsLength:
            k -= (log + mid - 1) // mid - 1
        return k >= 0

class InputReader:
    def __init__(self, stream):
        self.reader = stream
        self.tokenizer = None

    def next(self):
        while self.tokenizer is None or not self.tokenizer.hasmoreTokens():
            try:
                self.tokenizer = sys.stdin.readline().split()
            except:
                raise RuntimeError()
        return self.tokenizer.pop(0)

    def nextInt(self):
        return int(self.next())

    def readArray(self, n):
        a = [0] * n
        for i in range(n):
            a[i] = self.nextInt()
        return a

def main():
    inputStream = sys.stdin
    outputStream = sys.stdout
    in_ = InputReader(inputStream)
    out = outputStream
    sol = Solution()
    sol.solve(in_, out)

if __name__ == "__main__":
    main()

