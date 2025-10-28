
import sys

class InputReader:
    def __init__(self, input_stream):
        self.input_stream = input_stream
        self.tokens = []

    def next_string(self):
        if not self.tokens:
            self.tokens = self.input_stream.readline().split()
        return self.tokens.pop(0)

    def next_int(self):
        return int(self.next_string())

    def next_int_array(self, n):
        return [self.next_int() for _ in range(n)]


class TaskD:
    def solve(self, test_number, in_reader, out_stream):
        n = in_reader.next_int()
        m = in_reader.next_int()
        a = in_reader.next_int_array(n)
        dp = {}
        ans = 0
        base = 0
        for i in range(n):
            base = (base - a[i] % m + m) % m
            dp[(base + a[i]) % m] = dp.get((base + a[i]) % m, 0) + 1
            ans += dp.get(base, 0)
        print(ans, file=out_stream)


def main():
    input_stream = sys.stdin
    in_reader = InputReader(input_stream)
    out_stream = sys.stdout
    solver = TaskD()
    solver.solve(1, in_reader, out_stream)


if __name__ == "__main__":
    main()

