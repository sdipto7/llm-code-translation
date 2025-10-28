
import sys

class InputReader:
    def __init__(self, stream):
        self.stream = stream
        self.tokens = []

    def next(self):
        if not self.tokens:
            self.tokens = self.stream.readline().split()
        return self.tokens.pop(0)

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return int(self.next())

    def next_double(self):
        return float(self.next())

    def next_line(self):
        return self.stream.readline().strip()

class Task:
    def solve(self, in_reader, out_stream):
        n = in_reader.next_int()
        array = [0] * 1001
        for _ in range(n):
            index = in_reader.next_int()
            array[index] += 1
        count_max = max(array[1:])
        if n % 2 == 0:
            if count_max <= n // 2:
                out_stream.write("YES\n")
            else:
                out_stream.write("NO\n")
        else:
            if count_max <= n // 2 + 1:
                out_stream.write("YES\n")
            else:
                out_stream.write("NO\n")

def main():
    in_reader = InputReader(sys.stdin)
    task = Task()
    task.solve(in_reader, sys.stdout)

if __name__ == "__main__":
    main()

