
import sys

class InputReader:
    def __init__(self, stream):
        self.stream = stream

    def read_line(self):
        return self.stream.readline().decode().strip()

    def read_int(self):
        return int(self.read_line())

    def read_ints(self):
        return map(int, self.read_line().split())

class Solution:
    def solve(self, in_reader, out_stream):
        n, k = in_reader.read_ints()
        a = list(in_reader.read_ints())
        a.sort()
        ans = sum(a[:k])
        print(ans, file=out_stream)

def main():
    in_reader = InputReader(sys.stdin.buffer)
    out_stream = sys.stdout
    solution = Solution()
    solution.solve(in_reader, out_stream)

if __name__ == "__main__":
    main()

