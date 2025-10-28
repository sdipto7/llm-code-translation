
import sys
from collections import namedtuple

MOD = 1000000007

def main():
    sc = FastScanner()
    n = sc.next_int()
    l = []

    for _ in range(n):
        l.append(sc.next_int())

    l.sort()

    print(l[n // 2] - l[n // 2 - 1])

def gcd(m, n):
    while n:
        m, n = n, m % n
    return m

def lcm(m, n):
    return m * n // gcd(m, n)

Pair = namedtuple('Pair', ['key', 'value'])

class FastScanner:
    def __init__(self):
        self.buffer = sys.stdin.read().split()
        self.index = 0

    def next(self):
        result = self.buffer[self.index]
        self.index += 1
        return result

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return int(self.next())

    def next_double(self):
        return float(self.next())

if __name__ == "__main__":
    main()

