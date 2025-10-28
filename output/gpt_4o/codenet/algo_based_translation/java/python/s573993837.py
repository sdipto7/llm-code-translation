
import sys
import math

class InputReader:
    def __init__(self, stream):
        self.reader = stream
        self.tokenizer = None
    
    def next(self):
        while self.tokenizer is None or not self.tokenizer:
            try:
                line = self.reader.readline()
                if not line:
                    raise Exception("End of input")
                self.tokenizer = line.split()
            except Exception as e:
                raise RuntimeError(e)
        return self.tokenizer.pop(0)
    
    def nextInt(self):
        return int(self.next())
    
    def nextLong(self):
        return int(self.next())
    
    def nextDouble(self):
        return float(self.next())

def main():
    input_stream = sys.stdin
    output_stream = sys.stdout
    in_reader = InputReader(input_stream)
    out_writer = output_stream
    solve(in_reader, out_writer)

def solve(sc, pw):
    t = 1
    while t > 0:
        t -= 1
        n = sc.nextLong()
        m = sc.nextLong()
        if n == 0:
            print(0, file=pw)
            continue
        if n == m:
            print(0, file=pw)
            continue
        if n > m:
            n = m + n % m
            n -= m
            print(min(m - n, n), file=pw)
            continue
        print(min(m - n, n), file=pw)

def swap(chrr, i, j):
    chrr[i], chrr[j] = chrr[j], chrr[i]

def num(n):
    a = 0
    while n > 0:
        a += (n & 1)
        n >>= 1
    return a

def isPrime(n):
    if n <= 1:
        return False
    if n <= 3:
        return True
    if n % 2 == 0 or n % 3 == 0:
        return False
    for i in range(5, int(math.sqrt(n)) + 1, 6):
        if n % i == 0 or n % (i + 2) == 0:
            return False
    return True

def gcd(a, b):
    if b == 0:
        return a
    return gcd(b, a % b) if a > b else gcd(a, b % a)

def fast_pow(base, n, M):
    if n == 0:
        return 1
    if n == 1:
        return base
    halfn = fast_pow(base, n // 2, M)
    if n % 2 == 0:
        return (halfn * halfn) % M
    else:
        return (((halfn * halfn) % M) * base) % M

def modInverse(n, M):
    return fast_pow(n, M - 2, M)

def feedArr(arr, sc):
    for i in range(len(arr)):
        arr[i] = sc.nextLong()

def feedArr_double(arr, sc):
    for i in range(len(arr)):
        arr[i] = sc.nextDouble()

def feedArr_int(arr, sc):
    for i in range(len(arr)):
        arr[i] = sc.nextInt()

def feedArr_string(arr, sc):
    for i in range(len(arr)):
        arr[i] = sc.next()

def printArr(arr):
    return ' '.join(map(str, arr)) + ' '

if __name__ == "__main__":
    main()

