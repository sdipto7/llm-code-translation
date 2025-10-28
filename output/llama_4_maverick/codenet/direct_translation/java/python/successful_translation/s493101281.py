
import sys
from math import gcd

MOD = 1000000007

def lcm(m, n):
    return m * n // gcd(m, n)

class FastScanner:
    def __init__(self):
        self.buffer = sys.stdin.buffer.read()
        self.ptr = 0

    def has_next_byte(self):
        return self.ptr < len(self.buffer)

    def read_byte(self):
        if self.has_next_byte():
            self.ptr += 1
            return self.buffer[self.ptr - 1]
        else:
            return -1

    def is_printable_char(self, c):
        return 33 <= c <= 126

    def has_next(self):
        while self.has_next_byte() and not self.is_printable_char(self.buffer[self.ptr]):
            self.ptr += 1
        return self.has_next_byte()

    def next(self):
        if not self.has_next():
            raise Exception
        sb = bytearray()
        b = self.read_byte()
        while self.is_printable_char(b):
            sb.append(b)
            b = self.read_byte()
        return sb.decode('utf-8')

    def next_long(self):
        if not self.has_next():
            raise Exception
        n = 0
        minus = False
        b = self.read_byte()
        if b == ord('-'):
            minus = True
            b = self.read_byte()
        if b < ord('0') or ord('9') < b:
            raise Exception
        while True:
            if ord('0') <= b <= ord('9'):
                n *= 10
                n += b - ord('0')
            elif b == -1 or not self.is_printable_char(b):
                return -n if minus else n
            else:
                raise Exception
            b = self.read_byte()

    def next_int(self):
        nl = self.next_long()
        if nl < -2**31 or nl > 2**31 - 1:
            raise Exception
        return int(nl)

    def next_double(self):
        return float(self.next())

def main():
    sc = FastScanner()
    n = sc.next_int()
    l = [sc.next_int() for _ in range(n)]
    l.sort()
    print(l[n//2] - l[n//2 - 1])

if __name__ == "__main__":
    main()

