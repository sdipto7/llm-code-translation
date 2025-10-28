
import sys
from collections import defaultdict

class InputReader:
    def __init__(self, stream):
        self.reader = stream
        self.tokenizer = None

    def next(self):
        while self.tokenizer is None or not self.tokenizer:
            self.tokenizer = sys.stdin.readline().split()
        return self.tokenizer.pop(0)

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return int(self.next())

    def nextDouble(self):
        return float(self.next())

    def nextLine(self):
        return sys.stdin.readline().rstrip()

class Task:
    def solve(self, in_, out):
        n = in_.nextInt()
        array = defaultdict(int)
        for _ in range(n):
            index = in_.nextInt()
            array[index] += 1
        
        countMax = -1
        for key in array:
            if countMax < array[key]:
                countMax = array[key]
        
        if n % 2 == 0:
            if countMax <= n // 2:
                out.write("YES\n")
            else:
                out.write("NO\n")
        else:
            if countMax <= n // 2 + 1:
                out.write("YES\n")
            else:
                out.write("NO\n")

input_stream = sys.stdin
output_stream = sys.stdout
in_ = InputReader(input_stream)
out = output_stream
solver = Task()
solver.solve(in_, out)

