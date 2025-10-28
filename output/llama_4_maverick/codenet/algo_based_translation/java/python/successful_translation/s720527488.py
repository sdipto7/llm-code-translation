
import sys

class InputReader:
    def __init__(self, file):
        self.file = file
        self.buffer = bytearray()
        self.curbuf = 0
        self.lenbuf = 0

    def read_byte(self):
        if self.lenbuf == -1:
            raise EOFError
        if self.curbuf >= self.lenbuf:
            self.curbuf = 0
            self.buffer = self.file.read(1024)
            self.lenbuf = len(self.buffer)
            if self.lenbuf <= 0:
                return -1
        self.curbuf += 1
        return self.buffer[self.curbuf - 1]

    def is_space_char(self, c):
        return c <= 32

    def skip(self):
        b = self.read_byte()
        while b != -1 and self.is_space_char(b):
            b = self.read_byte()
        return b

    def next(self):
        b = self.skip()
        sb = ''
        while not self.is_space_char(b):
            sb += chr(b)
            b = self.read_byte()
        return sb

    def next_int(self):
        c = self.read_byte()
        while self.is_space_char(c):
            c = self.read_byte()
        minus = False
        if c == ord('-'):
            minus = True
            c = self.read_byte()
        res = 0
        while c >= ord('0') and c <= ord('9'):
            res = res * 10 + c - ord('0')
            c = self.read_byte()
        return -res if minus else res

    def to_int_array(self, n):
        a = [0] * n
        for i in range(n):
            a[i] = self.next_int()
        return a


def sort(a):
    import random
    for i in range(len(a) - 1, 0, -1):
        t = random.randint(0, i)
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
            len_ = min(m, i + boxlen[j])
            cnt = sum(manju[m - 1 - k] for k in range(i, len_))
            dp[i][j] = max(dp[i][j], dp[len_][j + 1] + cnt - boxcost[j])
            dp[i][j] = max(dp[i][j], dp[i][j + 1])
    print(dp[0][0])


if __name__ == "__main__":
    main()

