
import sys

class FastScanner:
    def __init__(self, stream=sys.stdin):
        self.stream = stream
        self.tokens = []

    def next_int(self):
        return int(self.next_token())

    def next_long(self):
        return int(self.next_token())

    def next_double(self):
        return float(self.next_token())

    def next_char(self):
        return self.next_token()[0]

    def next_str(self):
        return self.next_token()

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

    def next_token(self):
        if not self.tokens:
            self.tokens = self.stream.read().split()
            self.tokens = self.tokens[::-1]
        return self.tokens.pop()

    def close(self):
        self.stream.close()

def main():
    MOD = 10**9 + 7
    in_ = FastScanner()
    N = in_.next_int()
    A = in_.next_int_array(N)
    ans = 0
    sum_ = A[N-1]
    for i in range(N-2, -1, -1):
        ans = (ans + sum_ * A[i]) % MOD
        sum_ = (sum_ + A[i]) % MOD
    print(ans)

if __name__ == "__main__":
    main()

