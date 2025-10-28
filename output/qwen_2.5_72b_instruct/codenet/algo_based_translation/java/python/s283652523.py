
import sys

MOD = 10**9 + 7

class FastScanner:
    def __init__(self, stream=None):
        self.input = stream or sys.stdin

    def close(self):
        self.input.close()

    def next_line(self):
        return self.input.readline().strip()

    def next_int(self):
        return int(self.next_line())

    def next_long(self):
        return int(self.next_line())

    def next_double(self):
        return float(self.next_line())

    def next_char(self):
        return self.next_line()[0]

    def next_str(self):
        return self.next_line()

    def next_int_array(self, n):
        return list(map(int, self.next_line().split()))

    def next_long_array(self, n):
        return list(map(int, self.next_line().split()))

    def next_double_array(self, n):
        return list(map(float, self.next_line().split()))

class Main:
    def __init__(self):
        self.in_stream = FastScanner()
        self.out_stream = sys.stdout

    def solve(self):
        N = self.in_stream.next_int()
        A = self.in_stream.next_int_array(N)

        ans = 0
        sum_val = A[N-1]
        for i in range(N - 2, -1, -1):
            ans += (sum_val * A[i]) % MOD
            ans %= MOD
            sum_val += A[i]
            sum_val %= MOD

        self.out_stream.write(f"{ans}\n")

    def m(self):
        self.solve()
        self.out_stream.flush()
        self.in_stream.close()

if __name__ == "__main__":
    main_instance = Main()
    main_instance.m()

