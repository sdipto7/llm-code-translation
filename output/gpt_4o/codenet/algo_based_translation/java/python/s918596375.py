
import sys
from collections import namedtuple

class FastScanner:
    def __init__(self, stream=sys.stdin):
        self.reader = iter(stream.read().splitlines())
        self.tokenizer = iter([])

    def next(self):
        while not self.tokenizer:
            self.tokenizer = iter(next(self.reader).split())
        return next(self.tokenizer)

    def nextLine(self):
        return next(self.reader)

    def nextLong(self):
        return int(self.next())

    def nextInt(self):
        return int(self.next())

    def nextDouble(self):
        return float(self.next())

    def nextIntArray(self, n):
        return [self.nextInt() for _ in range(n)]

    def nextLongArray(self, n):
        return [self.nextLong() for _ in range(n)]

def solve(sc, out):
    s = sc.next()
    vowels = {"a", "e", "i", "o", "u"}
    if s.lower() in vowels:
        out.write("vowel\n")
    else:
        out.write("consonant\n")

def gcd(a, b):
    if a < b:
        return gcd(b, a)
    if b == 0:
        return a
    return gcd(b, a % b)

def lcm(a, b):
    return (a * b) // gcd(a, b)

Pair = namedtuple('Pair', ['key', 'value'])

def main():
    sc = FastScanner()
    out = sys.stdout
    solve(sc, out)

if __name__ == "__main__":
    main()

