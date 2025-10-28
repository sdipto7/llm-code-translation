
import sys
import math

MOD = 1000000007

def print_obj(o):
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
    def __init__(self, file=sys.stdin):
        self.file = file
        self.buffer = file.read()
        self.buffer = iter(self.buffer.splitlines())
        self.tokens = []

    def next(self):
        if not self.tokens:
            self.tokens = next(self.buffer).split()
        return self.tokens.pop(0)

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return int(self.next())

    def next_double(self):
        return float(self.next())

def main():
    sc = FastScanner()
    n = sc.next_int()
    l = []
    for _ in range(n):
        l.append(sc.next_int())
    l.sort()
    print_obj(l[n // 2] - l[n // 2 - 1])

if __name__ == "__main__":
    main()

