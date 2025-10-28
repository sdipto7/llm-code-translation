
import sys

class Solution:
    def solve(self, in_, out_):
        n, k = in_.next_int(), in_.next_int()
        logs_length = in_.read_array(n)
        min_, max_ = 1, int(1e9) + 1000
        while min_ < max_:
            mid = (min_ + max_) // 2
            if self.nei(mid, logs_length, k):
                max_ = mid
            else:
                min_ = mid + 1
        out_.write(f"{min_}\n")
        
    def nei(self, mid, logs_length, k):
        for log in logs_length:
            k -= (log + mid - 1) // mid - 1
        return k >= 0

class InputReader:
    def __init__(self, stream):
        self.reader = stream
        self.tokenizer = None

    def next(self):
        while self.tokenizer is None or not self.tokenizer:
            self.tokenizer = iter(self.reader.readline().split())
        return next(self.tokenizer)

    def next_int(self):
        return int(self.next())

    def read_array(self, n):
        return [self.next_int() for _ in range(n)]

def main():
    input_reader = InputReader(sys.stdin)
    output_writer = sys.stdout
    sol = Solution()
    sol.solve(input_reader, output_writer)

if __name__ == "__main__":
    main()

