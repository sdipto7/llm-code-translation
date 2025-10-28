
import sys
from collections import defaultdict

class TaskD:
    def solve(self, testNumber, in_, out):
        n, m = in_.nextInt(), in_.nextInt()
        a = in_.nextIntArray(n)
        dp = defaultdict(int)
        ans = 0
        base = 0
        for i in range(n):
            base = (base - a[i] % m + m) % m
            dp[(base + a[i]) % m] += 1
            ans += dp.get(base, 0)
        out.write(str(ans) + '\n')

class InputReader:
    def __init__(self, inputStream):
        self.br = inputStream
        self.st = []

    def nextString(self):
        while not self.st:
            self.st = sys.stdin.readline().split()
        return self.st.pop(0)

    def nextInt(self):
        return int(self.nextString())

    def nextIntArray(self, n):
        res = [0] * n
        for i in range(n):
            res[i] = self.nextInt()
        return res

def main():
    inputStream = sys.stdin
    outputStream = sys.stdout
    in_ = InputReader(inputStream)
    out = outputStream
    solver = TaskD()
    solver.solve(1, in_, out)

if __name__ == "__main__":
    main()

