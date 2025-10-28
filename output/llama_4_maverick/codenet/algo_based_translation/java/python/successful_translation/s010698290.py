
import sys

class FastReader:
    def __init__(self):
        self.input_buffer = sys.stdin.readline().strip()

    def next(self):
        if not hasattr(self, 'tokens') or not self.tokens:
            self.tokens = self.input_buffer.split()
            self.input_buffer = sys.stdin.readline().strip()
        return self.tokens.pop(0)

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return int(self.next())

    def next_double(self):
        return float(self.next())

    def next_line(self):
        self.input_buffer = sys.stdin.readline().strip()
        return self.input_buffer

def main():
    s = FastReader()
    i, j, m, n, t, max_val, k, x, y, min_val, correct_ans, num, num_penal = 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0
    a, b, total_sum = 0, 0, 0
    str_val = ""

    n = s.next_int()
    m = s.next_int()

    penal = [0] * (n + 1)
    solved = [False] * (n + 1)

    for _ in range(m):
        num = s.next_int()
        str_val = s.next()
        if str_val[0] == 'A':
            solved[num] = True
        elif not solved[num]:
            penal[num] += 1

    correct_ans = 0
    num_penal = 0
    for i in range(1, n + 1):
        if solved[i]:
            correct_ans += 1
            num_penal += penal[i]

    print(f"{correct_ans} {num_penal}")

if __name__ == "__main__":
    main()

