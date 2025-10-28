
import sys

class FastScanner:
    def __init__(self, stream=sys.stdin):
        self.stream = stream
        self.buf = []

    def next_int(self):
        return int(self.next_str())

    def next_long(self):
        return int(self.next_str())

    def next_double(self):
        return float(self.next_str())

    def next_char(self):
        return self.next_str()[0]

    def next_str(self):
        while not self.buf:
            line = self.stream.readline().strip()
            if not line:
                return ''
            self.buf = line.split()
        return self.buf.pop(0)

    def next_line(self):
        return self.stream.readline().strip()

    def next_int_array(self, n):
        return [self.next_int() for _ in range(n)]

    def next_int_array_dec(self, n):
        return [self.next_int() - 1 for _ in range(n)]

    def next_int_array_1_index(self, n):
        return [0] + [self.next_int() for _ in range(n)]

    def next_long_array(self, n):
        return [self.next_long() for _ in range(n)]

    def next_long_array_dec(self, n):
        return [self.next_long() - 1 for _ in range(n)]

    def next_long_array_1_index(self, n):
        return [0] + [self.next_long() for _ in range(n)]

    def next_double_array(self, n):
        return [self.next_double() for _ in range(n)]

class Main:
    MOD = int(1e9 + 7)

    def __init__(self):
        self.in_ = FastScanner()
        self.out = sys.stdout

    def solve(self):
        N = self.in_.next_int()
        A = self.in_.next_int_array(N)
        ans = 0
        sum_ = A[N - 1]
        for i in range(N - 2, -1, -1):
            ans = (ans + (sum_ * A[i]) % self.MOD) % self.MOD
            sum_ = (sum_ + A[i]) % self.MOD
        self.out.write(str(ans) + '\n')

    def run(self):
        self.solve()

def main():
    Main().run()

if __name__ == "__main__":
    main()

