
import sys
import math
from io import StringIO
from typing import List, Tuple

class InputReader:
    def __init__(self, stream):
        self.reader = stream
        self.tokenizer = None
    
    def next(self):
        while self.tokenizer is None or not self.tokenizer.hasMoreTokens():
            try:
                self.tokenizer = StringTokenizer(self.reader.readline())
            except:
                raise RuntimeError()
        return self.tokenizer.nextToken()
    
    def nextInt(self):
        return int(self.next())
    
    def nextLong(self):
        return int(self.next())
    
    def nextDouble(self):
        return float(self.next())

class StringTokenizer:
    def __init__(self, string):
        self.tokens = string.split()
        self.index = 0
    
    def hasMoreTokens(self):
        return self.index < len(self.tokens)
    
    def nextToken(self):
        if self.index >= len(self.tokens):
            raise RuntimeError("No more tokens")
        token = self.tokens[self.index]
        self.index += 1
        return token

class Pair:
    def __init__(self, a: int, b: int, i: int):
        self.u = a
        self.v = b
        self.i = i
        self.val = 0

def swap(chrr: List[str], i: int, j: int):
    temp = chrr[i]
    chrr[i] = chrr[j]
    chrr[j] = temp

def num(n: int) -> int:
    a = 0
    while n > 0:
        a += (n & 1)
        n >>= 1
    return a

def isPrime(n: int) -> bool:
    if n <= 1:
        return False
    if n <= 3:
        return True
    if n % 2 == 0 or n % 3 == 0:
        return False
    i = 5
    while i * i <= n:
        if n % i == 0 or n % (i + 2) == 0:
            return False
        i += 6
    return True

def gcd(a: int, b: int) -> int:
    if b == 0:
        return a
    if a > b:
        return gcd(b, a % b)
    else:
        return gcd(a, b % a)

def fast_pow(base: int, n: int, M: int) -> int:
    if n == 0:
        return 1
    if n == 1:
        return base
    halfn = fast_pow(base, n // 2, M)
    if n % 2 == 0:
        return (halfn * halfn) % M
    else:
        return (((halfn * halfn) % M) * base) % M

def modInverse(n: int, M: int) -> int:
    return fast_pow(n, M - 2, M)

def feedArr_long(arr: List[int], sc: InputReader):
    for i in range(len(arr)):
        arr[i] = sc.nextLong()

def feedArr_double(arr: List[float], sc: InputReader):
    for i in range(len(arr)):
        arr[i] = sc.nextDouble()

def feedArr_int(arr: List[int], sc: InputReader):
    for i in range(len(arr)):
        arr[i] = sc.nextInt()

def feedArr_string(arr: List[str], sc: InputReader):
    for i in range(len(arr)):
        arr[i] = sc.next()

def printArr_int(arr: List[int]) -> str:
    return ' '.join(map(str, arr))

def printArr_long(arr: List[int]) -> str:
    return ' '.join(map(str, arr))

def printArr_string(arr: List[str]) -> str:
    return ' '.join(arr)

def printArr_double(arr: List[float]) -> str:
    return ' '.join(map(str, arr))

def solve(sc: InputReader, pw):
    t = 1
    while t > 0:
        t -= 1
        n = sc.nextLong()
        m = sc.nextLong()
        if n == 0:
            pw.write("0\n")
            continue
        if n == m:
            pw.write("0\n")
            continue
        if n > m:
            n = m + (n % m)
            n = n - m
            pw.write(str(min(m - n, n)) + "\n")
            continue
        pw.write(str(min(m - n, n)) + "\n")

def main():
    input_stream = sys.stdin
    output_stream = sys.stdout
    sc = InputReader(input_stream)
    pw = output_stream
    solve(sc, pw)
    pw.flush()

if __name__ == "__main__":
    main()

