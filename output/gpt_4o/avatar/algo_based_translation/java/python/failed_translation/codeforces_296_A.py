
import sys
from collections import defaultdict

class InputReader:
    def __init__(self, stream):
        self.reader = stream
        self.tokenizer = None

    def next(self):
        while self.tokenizer is None or not self.tokenizer:
            try:
                self.tokenizer = iter(self.reader.readline().split())
            except Exception as e:
                raise RuntimeError(e)
        return next(self.tokenizer)

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return int(self.next())

    def nextDouble(self):
        return float(self.next())

    def nextLine(self):
        try:
            return self.reader.readline().strip()
        except Exception as e:
            print(e)
            return ""

def solve(in_reader, out_writer):
    n = in_reader.nextInt()
    array = [0] * 1001
    for _ in range(n):
        index = in_reader.nextInt()
        array[index] += 1

    countMax = -1
    for i in range(1, len(array)):
        if countMax < array[i]:
            countMax = array[i]

    if n % 2 == 0:
        if countMax <= n // 2:
            out_writer.write("YES\n")
        else:
            out_writer.write("NO\n")
    else:
        if countMax <= n // 2 + 1:
            out_writer.write("YES\n")
        else:
            out_writer.write("NO\n")

if __name__ == "__main__":
    in_reader = InputReader(sys.stdin)
    out_writer = sys.stdout
    solve(in_reader, out_writer)

