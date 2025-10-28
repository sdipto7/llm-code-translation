
import sys
import math

def main():
    input_stream = sys.stdin
    output_stream = sys.stdout
    input_reader = InputReader(input_stream)
    output_writer = OutputWriter(output_stream)
    solve(input_reader, output_writer)
    output_writer.close()

def solve(input_reader, output_writer):
    t = 1
    while t > 0:
        t -= 1
        n = input_reader.next_long()
        m = input_reader.next_long()
        if n == 0:
            output_writer.println(0)
            continue
        if n == m:
            output_writer.println(0)
            continue
        if n > m:
            n = m + n % m
            n -= m
            output_writer.println(min(m - n, n))
            continue
        output_writer.println(min(m - n, n))

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

def mod_inverse(n, M):
    return fast_pow(n, M - 2, M)

class InputReader:
    def __init__(self, stream):
        self.stream = stream
        self.tokenizer = None

    def next(self):
        if self.tokenizer is None or not self.tokenizer:
            line = self.stream.readline().decode().strip()
            self.tokenizer = line.split()
        return self.tokenizer.pop(0)

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return int(self.next())

    def next_double(self):
        return float(self.next())

class OutputWriter:
    def __init__(self, stream):
        self.stream = stream

    def println(self, value):
        self.stream.write(str(value) + '\n')

    def close(self):
        pass

if __name__ == "__main__":
    main()

