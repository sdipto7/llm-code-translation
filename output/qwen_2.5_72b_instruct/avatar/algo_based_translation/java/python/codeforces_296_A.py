import sys
from io import StringIO
import re

class Task:
    def solve(self, in_reader, out_writer):
        n = in_reader.next_int()
        array = [0] * 1001
        for i in range(n):
            index = in_reader.next_int()
            array[index] += 1
        count_max = -1
        for i in range(1, 1001):
            if count_max < array[i]:
                count_max = array[i]
        if n % 2 == 0:
            if count_max <= n // 2:
                out_writer.write("YES\n")
            else:
                out_writer.write("NO\n")
        else:
            if count_max <= n // 2 + 1:
                out_writer.write("YES\n")
            else:
                out_writer.write("NO\n")

class InputReader:
    def __init__(self, stream):
        self.reader = stream
        self.tokenizer = None

    def next(self):
        while self.tokenizer is None or not self.tokenizer.hasMoreTokens():
            line = self.reader.readline()
            if not line:
                break
            line = line.strip()
            if len(line) == 0:
                continue
            self.tokenizer = re.findall(r'\S+', line)
        if self.tokenizer is None or not self.tokenizer.hasMoreTokens():
            return None
        return self.tokenizer.pop(0)

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return int(self.next())

    def next_double(self):
        return float(self.next())

    def next_line(self):
        return self.reader.readline().strip()

def main():
    in_reader = InputReader(sys.stdin)
    out_writer = sys.stdout
    task_solver = Task()
    task_solver.solve(in_reader, out_writer)

if __name__ == '__main__':
    main()
