
import sys
import random
import bisect

class InputReader:
    def __init__(self, stream):
        self.stream = stream
        self.buffer = bytearray()
        self.current_pos = 0

    def read_byte(self):
        if self.current_pos >= len(self.buffer):
            self.buffer = self.stream.read(1024)
            if not self.buffer:
                return -1
            self.current_pos = 0
        b = self.buffer[self.current_pos]
        self.current_pos += 1
        return b

    def is_space_char(self, c):
        return not (33 <= c <= 126)

    def skip(self):
        b = self.read_byte()
        while b != -1 and self.is_space_char(b):
            b = self.read_byte()
        return b

    def next(self):
        b = self.skip()
        sb = bytearray()
        while not self.is_space_char(b):
            sb.append(b)
            b = self.read_byte()
        return sb.decode('utf-8')

    def next_int(self):
        c = self.read_byte()
        while self.is_space_char(c):
            c = self.read_byte()
        minus = False
        if c == ord('-'):
            minus = True
            c = self.read_byte()
        res = 0
        while not self.is_space_char(c):
            if not (ord('0') <= c <= ord('9')):
                raise ValueError("Input mismatch")
            res = res * 10 + c - ord('0')
            c = self.read_byte()
        return -res if minus else res

    def to_int_array(self, n):
        return [self.next_int() for _ in range(n)]

def sort(a):
    for i in range(len(a) - 1, 0, -1):
        t = int(random.random() * i)
        a[i], a[t] = a[t], a[i]
    a.sort()

def main():
    ir = InputReader(sys.stdin.buffer)

    m = ir.next_int()
    n = ir.next_int()
    manju = ir.to_int_array(m)

    boxlen = [0] * n
    boxcost = [0] * n
    for i in range(n):
        boxlen[i] = ir.next_int()
        boxcost[i] = ir.next_int()

    sort(manju)

    dp = [[0] * (n + 1) for _ in range(m + 1)]

    for i in range(m - 1, -1, -1):
        for j in range(n - 1, -1, -1):
            len_ = min(i + boxlen[j], m)
            cnt = sum(manju[m - 1 - k] for k in range(i, len_))
            dp[i][j] = max(dp[i][j], dp[len_][j + 1] + cnt - boxcost[j])
            dp[i][j] = max(dp[i][j], dp[i][j + 1])

    print(dp[0][0])

if __name__ == "__main__":
    main()

