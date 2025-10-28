
MOD = 1000000007

def gcd(m, n):
    if m < n:
        return gcd(n, m)
    if n == 0:
        return m
    return gcd(n, m % n)

def lcm(m, n):
    return m * n // gcd(m, n)

class Pair:
    def __init__(self, key, value):
        self.key = key
        self.value = value

    def get_value(self):
        return self.value

    def get_key(self):
        return self.key

import sys
import os

class FastScanner:
    def __init__(self, file=sys.stdin):
        self.file = file
        self.buffer = file.read()
        self.buffer = list(self.buffer)
        self.index = 0

    def readByte(self):
        if self.index >= len(self.buffer):
            return -1
        byte = ord(self.buffer[self.index])
        self.index += 1
        return byte

    def hasNextByte(self):
        return self.readByte() != -1

    def skip(self):
        while self.hasNextByte() and not (33 <= self.buffer[self.index - 1] <= 126):
            self.readByte()

    def hasNext(self):
        self.skip()
        return self.hasNextByte()

    def next(self):
        if not self.hasNext():
            raise StopIteration
        sb = []
        b = self.readByte()
        while 33 <= b <= 126:
            sb.append(chr(b))
            b = self.readByte()
        return ''.join(sb)

    def nextLong(self):
        if not self.hasNext():
            raise StopIteration
        n = 0
        minus = False
        b = self.readByte()
        if b == 45:
            minus = True
            b = self.readByte()
        if not (48 <= b <= 57):
            raise ValueError
        while 48 <= b <= 57:
            n *= 10
            n += b - 48
            b = self.readByte()
        return -n if minus else n

    def nextInt(self):
        nl = self.nextLong()
        if nl < -2147483648 or nl > 2147483647:
            raise ValueError
        return int(nl)

    def nextDouble(self):
        return float(self.next())

def print(o):
    sys.stdout.write(str(o) + '\n')

sc = FastScanner()
n = sc.nextInt()
l = [sc.nextInt() for _ in range(n)]
l.sort()
print(l[n // 2] - l[n // 2 - 1])

