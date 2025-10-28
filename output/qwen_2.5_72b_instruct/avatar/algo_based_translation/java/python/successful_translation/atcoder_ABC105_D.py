
import sys
from collections import defaultdict

class TaskD:
    def solve(self, testNumber, in_reader, out_writer):
        n = in_reader.nextInt()
        m = in_reader.nextInt()
        a = in_reader.nextIntArray(n)
        dp = defaultdict(int)
        ans = 0
        base = 0
        for i in range(n):
            base = (base - a[i] % m + m) % m
            dp[(base + a[i]) % m] += 1
            ans += dp[base]
        out_writer.write(f"{ans}\n")

class InputReader:
    def __init__(self, input_stream):
        self.br = input_stream
        self.st = []

    def nextString(self):
        while not self.st:
            try:
                self.st = sys.stdin.readline().strip().split()
            except:
                raise Exception("EOF")
        return self.st.pop(0)

    def nextInt(self):
        return int(self.nextString())

    def nextIntArray(self, n):
        res = [0] * n
        for i in range(n):
            res[i] = self.nextInt()
        return res

def main():
    in_reader = InputReader(sys.stdin)
    out_writer = sys.stdout
    solver = TaskD()
    solver.solve(1, in_reader, out_writer)

if __name__ == "__main__":
    main()

