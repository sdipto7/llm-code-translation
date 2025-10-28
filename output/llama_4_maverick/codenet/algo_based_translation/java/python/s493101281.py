
import sys
from collections import defaultdict, deque
import math

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
        self.input_stream = sys.stdin
        self.buffer = bytearray()
        self.ptr = 0
        self.buflen = 0

    def has_next_byte(self):
        if self.ptr < self.buflen:
            return True
        else:
            self.ptr = 0
            try:
                self.buffer = bytearray(self.input_stream.read(1024))
                self.buflen = len(self.buffer)
            except Exception as e:
                print(e, file=sys.stderr)
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
            raise Exception('No more input')
        sb = ''
        b = self.read_byte()
        self.ptr += 1
        while self.is_printable_char(b):
            sb += chr(b)
            if not self.has_next_byte():
                break
            b = self.read_byte()
            self.ptr += 1
        return sb

    def next_long(self):
        if not self.has_next():
            raise Exception('No more input')
        n = 0
        minus = False
        b = self.read_byte()
        self.ptr += 1
        if b == ord('-'):
            minus = True
            b = self.read_byte()
            self.ptr += 1
        if b < ord('0') or b > ord('9'):
            raise Exception('Invalid input')
        while True:
            if ord('0') <= b <= ord('9'):
                n *= 10
                n += b - ord('0')
            elif b == -1 or not self.is_printable_char(b):
                return -n if minus else n
            else:
                raise Exception('Invalid input')
            if not self.has_next_byte():
                break
            b = self.read_byte()
            self.ptr += 1
        return -n if minus else n

    def next_int(self):
        nl = self.next_long()
        if nl < -2**31 or nl > 2**31 - 1:
            raise Exception('Integer overflow')
        return int(nl)

    def next_double(self):
        return float(self.next())

def gcd(m, n):
    if m < n:
        return gcd(n, m)
    if n == 0:
        return m
    return gcd(n, m % n)

def lcm(m, n):
    return m * n // gcd(m, n)

def print_output(o):
    print(o)

def main():
    sc = FastScanner()
    n = sc.next_int()
    l = []
    for _ in range(n):
        l.append(sc.next_int())
    l.sort()
    print_output(l[n//2] - l[n//2 - 1])

if __name__ == "__main__":
    main()

