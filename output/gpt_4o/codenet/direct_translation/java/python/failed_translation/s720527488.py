
import sys
import random

INF = float('inf')
LINF = float('inf')

class InputReader:
    def __init__(self, stream):
        self.in_stream = stream
        self.buffer = bytearray(1024)
        self.curbuf = 0
        self.lenbuf = 0

    def read_byte(self):
        if self.lenbuf == -1:
            raise Exception("InputMismatchException")
        if self.curbuf >= self.lenbuf:
            self.curbuf = 0
            self.lenbuf = self.in_stream.readinto(self.buffer)
            if self.lenbuf <= 0:
                return -1
        byte = self.buffer[self.curbuf]
        self.curbuf += 1
        return byte

    def is_space_char(self, c):
        return not (33 <= c <= 126)

    def skip(self):
        b = self.read_byte()
        while b != -1 and self.is_space_char(b):
            b = self.read_byte()
        return b

    def next(self):
        b = self.skip()
        sb = []
        while not self.is_space_char(b):
            sb.append(b)
            b = self.read_byte()
        return bytes(sb).decode()

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
            if c < ord('0') or c > ord('9'):
                raise Exception("InputMismatchException")
            res = res * 10 + c - ord('0')
            c = self.read_byte()
        return -res if minus else res

    def next_long(self):
        c = self.read_byte()
        while self.is_space_char(c):
            c = self.read_byte()
        minus = False
        if c == ord('-'):
            minus = True
            c = self.read_byte()
        res = 0
        while not self.is_space_char(c):
            if c < ord('0') or c > ord('9'):
                raise Exception("InputMismatchException")
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
    ir = InputReader(sys.stdin)
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
            length = min(i + boxlen[j], m)
            cnt = sum(manju[m - 1 - k] for k in range(i, length))
            dp[i][j] = max(dp[i][j], dp[length][j + 1] + cnt - boxcost[j])
            dp[i][j] = max(dp[i][j], dp[i][j + 1])
    print(dp[0][0])

if __name__ == '__main__':
    main()

