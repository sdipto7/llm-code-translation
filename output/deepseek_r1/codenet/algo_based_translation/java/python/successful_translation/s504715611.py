
import sys
import math
from math import sqrt, pi
from random import Random

mod = 1000000007
eps = 1.0e-14
big = 2147483647
PI = 3.14159265358979323846262338327950288

class UnionFind:
    def __init__(self, n):
        self.Parent = [-1]*n
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
        self.inp = sys.stdin.buffer.read()
        self.ptr = 0
        self.buflen = len(self.inp)
    def hasNextByte(self):
        return self.ptr < self.buflen
    def readByte(self):
        if self.hasNextByte():
            res = self.inp[self.ptr]
            self.ptr += 1
            return res
        return -1
    def isPrintableChar(self, c):
        return 33 <= c <= 126
    def hasNext(self):
        while self.hasNextByte() and not self.isPrintableChar(self.inp[self.ptr]):
            self.ptr += 1
        return self.hasNextByte()
    def next(self):
        if not self.hasNext():
            raise StopIteration()
        sb = []
        b = self.readByte()
        while self.isPrintableChar(b):
            sb.append(chr(b))
            b = self.readByte()
        return ''.join(sb)
    def nextLong(self):
        n = 0
        minus = False
        b = self.readByte()
        if b == 45:
            minus = True
            b = self.readByte()
        if b < 48 or b > 57:
            raise ValueError()
        while True:
            if 48 <= b <= 57:
                n = n * 10 + (b - 48)
            elif not self.isPrintableChar(b) or b == -1:
                return -n if minus else n
            else:
                raise ValueError()
            b = self.readByte()
    def nextInt(self):
        nl = self.nextLong()
        if nl < -2147483648 or nl > 2147483647:
            raise ValueError()
        return nl
    def nextDouble(self):
        return float(self.next())
    def nextchar(self):
        b = self.readByte()
        if b == -1:
            raise StopIteration()
        return chr(b)

def modlcm(a, b):
    return a * b * modint(gcd(a, b), mod) % mod

def gcd(a, b):
    return a if b == 0 else gcd(b, a % b)

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
    return 1 if i == 0 else i * factorial(i-1)

def lower_bound(a, key):
    left = 0
    right = len(a)
    while right - left > 1:
        mid = (left + right) // 2
        if a[mid] < key:
            left = mid
        else:
            right = mid
    return left

def upper_bound(a, key):
    left = 0
    right = len(a)
    while right - left > 1:
        mid = (left + right) // 2
        if a[mid] <= key:
            left = mid
        else:
            right = mid
    return left

def isPrime(n):
    if n == 2:
        return True
    if n < 2 or n % 2 == 0:
        return False
    d = int(sqrt(n)) + 1
    for i in range(3, d, 2):
        if n % i == 0:
            return False
    return True

def upper_division(a, b):
    return a // b if a % b == 0 else a // b + 1

def lupper_division(a, b):
    return a // b if a % b == 0 else a // b + 1

def setArray(n):
    return [scan.nextInt() for _ in range(n)]

def lsetArray(n):
    return [scan.nextLong() for _ in range(n)]

def reverse(s):
    return s[::-1]

def printArray(que):
    print(' '.join(map(str, que)))

def doublesort(a):
    a.sort(key=lambda x: x[0])
    return a

def ldoublesort(a):
    a.sort(key=lambda x: x[0])
    return a

def modpow(x, n, mo):
    res = 1
    while n > 0:
        if n & 1:
            res = res * x % mo
        x = x * x % mo
        n >>= 1
    return res

def revch(ch):
    return ch[::-1]

def revint(arr):
    return arr[::-1]

def warshall_floyd(v, n):
    for k in range(n):
        for i in range(n):
            for j in range(n):
                v[i][j] = min(v[i][j], v[i][k] + v[k][j])

def modint(a, m):
    b, u, v = m, 1, 0
    while b != 0:
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
    str_val = scan.next()
    if len(str_val) >= 6 and str_val[2] == str_val[3] and str_val[4] == str_val[5]:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()

