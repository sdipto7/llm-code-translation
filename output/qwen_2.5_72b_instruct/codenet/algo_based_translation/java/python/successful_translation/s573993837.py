
import sys

class Pair:
    def __init__(self, u, v, i):
        self.u = u
        self.v = v
        self.i = i

def swap(chrr, i, j):
    temp = chrr[i]
    chrr[i] = chrr[j]
    chrr[j] = temp

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
    i = 5
    while i * i <= n:
        if n % i == 0 or n % (i + 2) == 0:
            return False
        i += 6
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
        return ((halfn * halfn) % M * base) % M

def modInverse(n, M):
    return fast_pow(n, M - 2, M)

def feedArr(arr, sc):
    for i in range(len(arr)):
        arr[i] = sc.nextLong()

def printArr(arr):
    return ' '.join(map(str, arr))

class InputReader:
    def __init__(self, stream):
        self.reader = stream
        self.buffer = []
        self.tokenizer = None

    def next(self):
        while not self.buffer:
            line = self.reader.readline()
            if not line:
                return None
            self.tokenizer = line.split()
            self.buffer = self.tokenizer
        return self.buffer.pop(0)

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return int(self.next())

    def nextDouble(self):
        return float(self.next())

def solve(sc, pw):
    t = 1
    while t > 0:
        t -= 1
        n = sc.nextLong()
        m = sc.nextLong()
        if n == 0:
            pw.write(f"{0}\n")
            continue
        if n == m:
            pw.write(f"{0}\n")
            continue
        if n > m:
            n = m + n % m
            n -= m
            pw.write(f"{min(m - n, n)}\n")
            continue
        pw.write(f"{min(m - n, n)}\n")

def main():
    inputStream = sys.stdin
    outputStream = sys.stdout
    in_ = InputReader(inputStream)
    out = outputStream
    solve(in_, out)

if __name__ == "__main__":
    main()

