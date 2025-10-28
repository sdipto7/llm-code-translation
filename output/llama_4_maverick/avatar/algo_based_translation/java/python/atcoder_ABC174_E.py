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

    def read_array(self, n):
        return [self.next_int() for _ in range(n)]

class Solution:
    def solve(self, in_reader, out_stream):
        n = in_reader.next_int()
        k = in_reader.next_int()
        logs_length = in_reader.read_array(n)
        min_val = 1
        max_val = 10**9 + 1000
        while min_val < max_val:
            mid = (min_val + max_val) // 2
            if self.nei(mid, logs_length, k):
                max_val = mid
            else:
                min_val = mid + 1
        out_stream.write(str(min_val) + '\n')

    def nei(self, mid, logs_length, k):
        for log in logs_length:
            k -= (log + mid - 1) // mid - 1
        return k >= 0

def main():
    in_stream = sys.stdin
    out_stream = sys.stdout
    in_reader = InputReader(in_stream)
    sol = Solution()
    sol.solve(in_reader, out_stream)
    out_stream.flush()

if __name__ == "__main__":
    main()
