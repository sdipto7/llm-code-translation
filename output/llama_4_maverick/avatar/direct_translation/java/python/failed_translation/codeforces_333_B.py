
import sys
from collections import defaultdict

class FastReader:
    def __init__(self):
        self.input_stream = sys.stdin

    def next(self):
        return self.input_stream.readline().split()[0]

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return int(self.next())

    def next_double(self):
        return float(self.next())

    def next_line(self):
        return self.input_stream.readline().strip()

def main():
    in_stream = FastReader()
    out_stream = sys.stdout

    n = in_stream.next_int()
    m = in_stream.next_int()

    banned_rows = set()
    banned_cols = set()

    for _ in range(m):
        r = in_stream.next_int()
        if 1 < r < n:
            banned_rows.add(r)
        c = in_stream.next_int()
        if 1 < c < n:
            banned_cols.add(c)

    answer = (n - 2) * 2
    answer -= len(banned_rows)
    answer -= len(banned_cols)

    if n % 2 != 0:
        mid = (n + 1) // 2
        if mid not in banned_rows and mid not in banned_cols:
            answer -= 1

    print(answer, file=out_stream)

if __name__ == "__main__":
    main()

