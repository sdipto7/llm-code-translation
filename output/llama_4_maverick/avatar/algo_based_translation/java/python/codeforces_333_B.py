
import sys

class FastReader:
    def __init__(self):
        self.input_stream = sys.stdin

    def next(self):
        return self.input_stream.readline().strip().split()[0]

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return int(self.next())

    def next_double(self):
        return float(self.next())

    def next_line(self):
        return self.input_stream.readline().strip()

def main():
    in_reader = FastReader()
    out = sys.stdout

    n = in_reader.next_int()
    m = in_reader.next_int()

    banned_rows = set()
    banned_cols = set()

    for _ in range(m):
        r = in_reader.next_int()
        if 1 < r < n:
            banned_rows.add(r)
        c = in_reader.next_int()
        if 1 < c < n:
            banned_cols.add(c)

    answer = (n - 2) * 2
    answer -= len(banned_rows)
    answer -= len(banned_cols)

    if n % 2 != 0:
        mid = (n + 1) // 2
        if mid not in banned_rows and mid not in banned_cols:
            answer -= 1

    out.write(str(answer) + '\n')

if __name__ == "__main__":
    main()

