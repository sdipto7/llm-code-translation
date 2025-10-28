
import sys
from math import gcd

class Pair:
    def __init__(self, a, b, i):
        self.u = a
        self.v = b
        self.i = i

class InputReader:
    def __init__(self):
        self.reader = sys.stdin
        self.tokenizer = None

    def next(self):
        if self.tokenizer is None or not self.tokenizer:
            self.tokenizer = self.reader.readline().split()
        return self.tokenizer.pop(0)

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return int(self.next())

    def next_double(self):
        return float(self.next())

def swap(chrr, i, j):
    chrr[i], chrr[j] = chrr[j], chrr[i]

def num(n):
    count = 0
    while n > 0:
        count += n & 1
        n >>= 1
    return count

def is_prime(n):
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

def fast_pow(base, n, M):
    if n == 0:
        return 1
    if n == 1:
        return base
    half_n = fast_pow(base, n // 2, M)
    if n % 2 == 0:
        return (half_n * half_n) % M
    else:
        return ((half_n * half_n) % M * base) % M

def mod_inverse(n, M):
    return fast_pow(n, M - 2, M)

def feed_arr(arr, sc):
    for i in range(len(arr)):
        if isinstance(arr[i], int):
            arr[i] = sc.next_int()
        elif isinstance(arr[i], float):
            arr[i] = sc.next_double()
        else:
            arr[i] = sc.next()

def print_arr(arr):
    return ' '.join(map(str, arr))

def solve(sc, pw):
    t = 1
    while t > 0:
        t -= 1
        n = sc.next_long()
        m = sc.next_long()
        if n == 0:
            pw.write(str(0) + '\n')
            continue
        if n == m:
            pw.write(str(0) + '\n')
            continue
        if n > m:
            n = m + n % m - m
            pw.write(str(min(m - n, n)) + '\n')
            continue
        pw.write(str(min(m - n, n)) + '\n')

def main():
    sc = InputReader()
    pw = sys.stdout
    solve(sc, pw)

if __name__ == "__main__":
    main()

