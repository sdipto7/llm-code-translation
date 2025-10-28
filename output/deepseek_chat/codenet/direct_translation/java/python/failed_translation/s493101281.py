
import sys
import math

MOD = 1000000007

def main():
    sc = FastScanner()
    out = sys.stdout
    i = j = k = n = m = h = w = ans = 0
    a = b = c = d = x = y = z = 0
    l = []
    s = []
    p = []

    n = sc.next_int()

    for i in range(n):
        l.append(sc.next_int())

    l.sort()

    print(l[n//2] - l[n//2 - 1])

    out.flush()

def print(o):
    print(o)

def lcm(m, n):
    return m * n // gcd(m, n)

def gcd(m, n):
    if m < n:
        return gcd(n, m)
    if n == 0:
        return m
    return gcd(n, m % n)

class Pair:
    def __init__(self, key, value):
        self.key = key
        self.value = value

    def get_value(self):
        return self.value

    def get_key(self):
        return self.key

class FastScanner:
    def __init__(self):
        self.in_ = sys.stdin
        self.buffer = bytearray()
        self.ptr = 0
        self.buflen = 0

    def has_next_byte(self):
        if self.ptr < self.buflen:
            return True
        else:
            self.ptr = 0
            self.buffer = self.in_.read(1024)
            self.buflen = len(self.buffer)
            if self.buflen <= 0:
                return False
        return True

    def read_byte(self):
        if self.has_next_byte():
            return self.buffer[self.ptr]
        else:
            return -1

    @staticmethod
    def is_printable_char(c):
        return 33 <= c <= 126

    def has_next(self):
        while self.has_next_byte() and not self.is_printable_char(self.buffer[self.ptr]):
            self.ptr += 1
        return self.has_next_byte()

    def next(self):
        if not self.has_next():
            raise NoSuchElementException()
        sb = []
        b = self.read_byte()
        while self.is_printable_char(b):
            sb.append(chr(b))
            b = self.read_byte()
        return ''.join(sb)

    def next_long(self):
        if not self.has_next():
            raise NoSuchElementException()
        n = 0
        minus = False
        b = self.read_byte()
        if b == ord('-'):
            minus = True
            b = self.read_byte()
        if b < ord('0') or b > ord('9'):
            raise NumberFormatException()
        while True:
            if ord('0') <= b <= ord('9'):
                n *= 10
                n += b - ord('0')
            elif b == -1 or not self.is_printable_char(b):
                return -n if minus else n
            else:
                raise NumberFormatException()
            b = self.read_byte()

    def next_int(self):
        nl = self.next_long()
        if nl < -2147483648 or nl > 2147483647:
            raise NumberFormatException()
        return int(nl)

    def next_double(self):
        return float(self.next())

if __name__ == "__main__":
    main()

