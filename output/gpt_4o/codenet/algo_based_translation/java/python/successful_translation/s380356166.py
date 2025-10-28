
import sys

class Main:
    def __init__(self):
        input_stream = sys.stdin
        output_stream = sys.stdout
        in_reader = MyInput(input_stream)
        out_writer = sys.stdout
        solver = Solver()
        solver.solve(1, in_reader, out_writer)

class Solver:
    def solve(self, test_number, in_reader, out_writer):
        ans = 0
        K = in_reader.next_int()
        S = in_reader.next_int()
        for x in range(K + 1):
            for y in range(K + 1):
                wk = S - x - y
                if 0 <= wk <= K:
                    ans += 1
        out_writer.write(f"{ans}\n")

class MyInput:
    def __init__(self, input_stream):
        self._in = input_stream
        self._buffer = []
        self._index = 0

    def next_int(self):
        if self._index >= len(self._buffer):
            self._buffer = self._in.read().split()
            self._index = 0
        result = int(self._buffer[self._index])
        self._index += 1
        return result

if __name__ == "__main__":
    Main()

