class UnionFind:
    def __init__(self, n):
        self.Parent = [-1] * n

    def root(self, A):
        if self.Parent[A] < 0:
            return A
        self.Parent[A] = self.root(self.Parent[A])
        return self.Parent[A]

    def size(self, A):
        return -self.Parent[self.root(A)]

    def connect(self, A, B):
        A = self.root(A)
        B = self.root(B)
        if A == B:
            return False
        if self.size(A) < self.size(B):
            A, B = B, A
        self.Parent[A] += self.Parent[B]
        self.Parent[B] = A
        return True

class FastScanner:
    def __init__(self):
        self.buffer = bytearray()
        self.ptr = 0
        self.end = 0

    def _read(self, size=-1):
        if size == -1:
            self.buffer = bytearray()
            self.ptr = 0
            self.end = 0
            while True:
                chunk = sys.stdin.buffer.read(4096)
                if not chunk:
                    break
                self.buffer.extend(chunk)
                self.end += len(chunk)
        else:
            while self.end - self.ptr < size:
                chunk = sys.stdin.buffer.read(4096)
                if not chunk:
                    break
                self.buffer.extend(chunk)
                self.end += len(chunk)

    def has_next(self):
        if self.ptr == self.end:
            self._read(1)
        return self.ptr < self.end

    def next(self):
        if not self.has_next():
            raise StopIteration
        s = bytearray()
        while self.has_next():
            c = self.buffer[self.ptr]
            if c >= 33:
                s.append(c)
                self.ptr += 1
            else:
                self.ptr += 1
                break
        return s.decode()

    def next_long(self):
        s = self.next()
        return int(s)

    def next_int(self):
        return int(self.next())

    def next_double(self):
        return float(self.next())

import sys
import math

def modlcm(a, b, mod):
    return a * b * modint(math.gcd(a, b), mod)

def gcd(a, b):
    if b > 0:
        return gcd(b, a % b)
    else:
        return a

def lcm(a, b):
    return a * b // gcd(a, b)

def max(a, b):
    return a if a > b else b

def min(a, b):
    return a if a < b else b

def lmax(a, b):
    return max(a, b)

def lmin(a, b):
    return min(a, b)

def factorial(i):
    if i == 1:
        return 1
    else:
        return i * factorial(i - 1)

def lower_bound(a, key):
    left = 0
    right = len(a)
    while right - left > 1:
        mid = (right + left) // 2
        if a[mid] < key:
            left = mid
        else:
            right = mid
    return left

def upper_bound(a, key):
    left = 0
    right = len(a)
    while right - left > 1:
        mid = (right + left) // 2
        if a[mid] <= key:
            left = mid
        else:
            right = mid
    return left

def is_prime(n):
    if n == 2:
        return True
    if n < 2 or n % 2 == 0:
        return False
    d = int(math.sqrt(n))
    for i in range(3, d + 1, 2):
        if n % i == 0:
            return False
    return True

def upper_division(a, b):
    if a % b == 0:
        return a // b
    else:
        return a // b + 1

def lupper_division(a, b):
    return upper_division(a, b)

def set_array(a):
    return [int(x) for x in sys.stdin.readline().split()]

def lset_array(a):
    return [int(x) for x in sys.stdin.readline().split()]

def reverse(s):
    return s[::-1]

def print_array(que):
    print(*que)

def doublesort(a):
    return sorted(a, key=lambda x: x[0])

def ldoublesort(a):
    return sorted(a, key=lambda x: x[0])

def modpow(x, n, mo):
    res = 1
    while n > 0:
        if n % 2 == 1:
            res = (res * x) % mo
        x = (x * x) % mo
        n //= 2
    return res

def revch(ch):
    return ch[::-1]

def revint(ch):
    return ch[::-1]

def warshall_floyd(v, n):
    for k in range(n):
        for i in range(n):
            for j in range(n):
                v[i][j] = min(v[i][j], v[i][k] + v[k][j])

def modint(a, m):
    b = m
    u = 1
    v = 0
    while b:
        t = a // b
        a -= t * b
        a, b = b, a
        u -= t * v
        u, v = v, u
    u %= m
    if u < 0:
        u += m
    return u

def main():
    scan = FastScanner()
    mod = 10**9 + 7
    eps = 1e-14
    big = 2**31 - 1
    PI = 3.14159265358979323846262338327950288
    s = scan.next()
    print("Yes" if s[2] == s[3] and s[4] == s[5] else "No")

if __name__ == "__main__":
    main()
