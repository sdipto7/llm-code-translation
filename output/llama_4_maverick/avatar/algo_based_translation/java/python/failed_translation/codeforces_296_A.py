
import sys

class InputReader:
    def __init__(self, stream):
        self.stream = stream

    def next(self):
        return self.stream.readline().strip().split()[0]

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
        frequency = [0] * 1001
        for _ in range(n):
            index = in_reader.next_int()
            frequency[index] += 1
        count_max = max(frequency[1:])
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
    in_stream = sys.stdin
    out_stream = sys.stdout
    in_reader = InputReader(in_stream)
    task = Task()
    task.solve(in_reader, out_stream)
    out_stream.flush()

if __name__ == "__main__":
    main()

