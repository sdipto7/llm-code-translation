import sys
from typing import TypeVar, Generic, List, Tuple

K = TypeVar('K')
V = TypeVar('V')

class Pair(Generic[K, V]):
    def __init__(self, key: K, value: V):
        self.key = key
        self.value = value
    
    def swap(self):
        return Pair(self.value, self.key)
    
    def __str__(self):
        return f"({self.key}, {self.value})"

class FastScanner:
    def __init__(self, input_stream=sys.stdin):
        self.reader = input_stream
        self.tokenizer = None
    
    def next(self):
        if self.tokenizer is None or not self.tokenizer:
            line = self.reader.readline()
            if not line:
                raise EOFError
            self.tokenizer = line.split()
        return self.tokenizer.pop(0)
    
    def next_line(self):
        if self.tokenizer is None or not self.tokenizer:
            return self.reader.readline().strip()
        result = ' '.join(self.tokenizer)
        self.tokenizer = None
        return result
    
    def next_long(self):
        return int(self.next())
    
    def next_int(self):
        return int(self.next())
    
    def next_double(self):
        return float(self.next())
    
    def next_int_array(self, n):
        return [self.next_int() for _ in range(n)]
    
    def next_long_array(self, n):
        return [self.next_long() for _ in range(n)]

def gcd_int(a: int, b: int) -> int:
    if a < b:
        return gcd_int(b, a)
    if b == 0:
        return a
    return gcd_int(b, a % b)

def gcd_long(a: int, b: int) -> int:
    if a < b:
        return gcd_long(b, a)
    if b == 0:
        return a
    return gcd_long(b, a % b)

def lcm(a: int, b: int) -> int:
    return (a * b) // gcd_int(a, b)

def solve(sc: FastScanner, out):
    s = sc.next()
    vowels = ["a", "e", "i", "o", "u"]
    
    for vowel in vowels:
        if vowel.lower() == s.lower():
            out.write("vowel\n")
            return
    
    out.write("consonant\n")

def main():
    sc = FastScanner(sys.stdin)
    out = sys.stdout
    
    solve(sc, out)
    out.flush()

if __name__ == "__main__":
    main()
