
import sys
from bisect import bisect_left

class FastReader:
    def __init__(self):
        self.input_buffer = sys.stdin.read().split()

    def next(self):
        return self.input_buffer.pop(0)

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return int(self.next())

    def next_double(self):
        return float(self.next())

    def next_line(self):
        return ' '.join(self.input_buffer).strip()

def main():
    in_reader = FastReader()
    n = in_reader.next_int()
    left = list(range(n))
    answer = [0] * n
    q = in_reader.next_int()
    while q > 0:
        q -= 1
        l = in_reader.next_int() - 1
        r = in_reader.next_int() - 1
        win = in_reader.next_int() - 1
        idx = bisect_left(left, l)
        while idx < len(left) and left[idx] <= r:
            answer[left[idx]] = win + 1
            left.pop(idx)
        left.insert(bisect_left(left, win), win)
        answer[win] = 0
    print(*answer)

if __name__ == "__main__":
    main()

