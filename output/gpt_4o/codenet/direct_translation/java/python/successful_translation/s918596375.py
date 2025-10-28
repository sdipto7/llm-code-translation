
import sys
from collections import namedtuple
from math import gcd
from io import StringIO

class FastScanner:
    def __init__(self, input_stream):
        self.reader = input_stream
        self.tokenizer = None

    def next(self):
        if self.tokenizer is None or not self.tokenizer:
            self.tokenizer = self.reader.readline().split()
        return self.tokenizer.pop(0)

    def nextLine(self):
        if self.tokenizer is None or not self.tokenizer:
            return self.reader.readline().rstrip()
        return self.tokenizer.pop(0)

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
    a = ["a", "e", "i", "o", "u"]
    for str in a:
        if str.lower() == s.lower():
            out.write("vowel\n")
            return
    out.write("consonant\n")

def lcm(a, b):
    return (a * b) // gcd(a, b)

Pair = namedtuple('Pair', ['key', 'value'])

def main():
    sc = FastScanner(sys.stdin)
    out = sys.stdout
    solve(sc, out)

if __name__ == "__main__":
    main()

