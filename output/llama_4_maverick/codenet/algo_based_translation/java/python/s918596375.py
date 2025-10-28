
import sys
from math import gcd

class Pair:
    def __init__(self, key, value):
        self.key = key
        self.value = value

    def swap(self):
        return Pair(self.value, self.key)

class FastScanner:
    def __init__(self, file):
        self.file = file
        self.buffer = None
        self.tokens = []

    def next(self):
        if not self.tokens:
            self.buffer = self.file.readline().strip()
            self.tokens = self.buffer.split()
        return self.tokens.pop(0)

    def next_line(self):
        return self.file.readline().strip()

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return int(self.next())

    def next_double(self):
        return float(self.next())

    def next_int_array(self, n):
        return [self.next_int() for _ in range(n)]

    def next_long_array(self, n):
        return [self.next_long() for _ in range(n)]

def lcm(a, b):
    return (a * b) // gcd(a, b)

def main():
    sc = FastScanner(sys.stdin)
    s = sc.next()
    a = ["a", "e", "i", "o", "u"]
    for str in a:
        if str.lower() == s.lower():
            print("vowel")
            return
    print("consonant")

if __name__ == "__main__":
    main()

