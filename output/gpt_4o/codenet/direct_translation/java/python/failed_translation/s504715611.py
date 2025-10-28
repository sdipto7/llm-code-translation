
import sys
import math
import random

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
        self.buffer = []
        self.ptr = 0
        self.buflen = 0
        self.inp = sys.stdin.read

    def hasNextByte(self):
        if self.ptr < self.buflen:
            return True
        else:
            self.ptr = 0
            self.buffer = self.inp().encode()
            self.buflen = len(self.buffer)
            if self.buflen <= 0:
                return False
        return True

    def readByte(self):
        if self.hasNextByte():
            byte = self.buffer[self.ptr]
            self.ptr += 1
            return byte
        return -1

    @staticmethod
    def isPrintableChar(c):
        return 33 <= c <= 126

    def hasNext(self):
        while self.hasNextByte() and not self.isPrintableChar(self.buffer[self.ptr]):
            self.ptr += 1
        return self.hasNextByte()

    def next(self):
        if not self.hasNext():
            raise NoSuchElementException()
        sb = []
        b = self.readByte()
        while self.isPrintableChar(b):
            sb.append(b)
            b = self.readByte()
        return bytes(sb).decode()

    def nextLong(self):
        if not self.hasNext():
            raise NoSuchElementException()
        n, minus = 0, False
        b = self.readByte()
        if b == ord('-'):
            minus = True
            b = self.readByte()
        if b < ord('0') or ord('9') < b:
            raise NumberFormatException()
        while True:
            if ord('0') <= b <= ord('9'):
                n = n * 10 + b - ord('0')
            elif b == -1 or not self.isPrintableChar(b):
                return -n if minus else n
            else:
                raise NumberFormatException()
            b = self.readByte()

    def nextInt(self):
        nl = self.nextLong()
        if nl < -2147483648 or nl > 2147483647:
            raise NumberFormatException()
        return int(nl)

    def nextDouble(self):
        return float(self.next())

    def nextchar(self):
        return sys.stdin.read(1)

mod = 1000000007
eps = 1.0E-14
big = sys.maxsize
PI = 3.14159265358979323846262338327950288

def modlcm(a, b):
    return a * b * modint(gcd(a, b), mod)

def gcd(a, b):
    return gcd(b, a % b) if b > 0 else a

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
    return 1 if i == 1 else i * factorial(i - 1)

def main():
    scan = FastScanner()
    str = scan.next()
    print("Yes" if str[2] == str[3] and str[4] == str[5] else "No")

def lower_bound(a, key):
    right = len(a)
    left = 0
    while right - left > 1:
        mid = (right + left) // 2
        if a[mid] < key:
            left = mid
        else:
            right = mid
    return left

def upper_bound(a, key):
    right = len(a)
    left = 0
    while right - left > 1:
        mid = (right + left) // 2
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
    d = math.sqrt(n)
    i = 3
    while i <= d:
        if n % i == 0:
            return False
        i += 2
    return True

def upper_division(a, b):
    return a // b if a % b == 0 else a // b + 1

def lupper_division(a, b):
    return a // b if a % b == 0 else a // b + 1

def setArray(a):
    scan = FastScanner()
    b = [0] * a
    for i in range(a):
        b[i] = scan.nextInt()
    return b

def lsetArray(a):
    scan = FastScanner()
    b = [0] * a
    for i in range(a):
        b[i] = scan.nextLong()
    return b

def reverse(str):
    ch = list(str)
    a = len(str)
    for i in range(upper_division(a, 2)):
        ch[i], ch[ch.length - 1 - i] = ch[ch.length - 1 - i], ch[i]
    return ''.join(ch)

def printArray(que):
    for i in range(len(que) - 1):
        print(que[i], end=" ")
    print(que[len(que) - 1])

def doublesort(a):
    a.sort(key=lambda x: x[0])
    return a

def ldoublesort(a):
    a.sort(key=lambda x: x[0])
    return a

def modpow(x, n, mo):
    sum = 1
    while n > 0:
        if (n & 1) == 1:
            sum = sum * x % mo
        x = x * x % mo
        n >>= 1
    return sum

def revch(ch):
    ret = [0] * len(ch)
    i, j = len(ch) - 1, 0
    while i >= 0:
        ret[j] = ch[i]
        i -= 1
        j += 1
    return ret

def revint(ch):
    ret = [0] * len(ch)
    i, j = len(ch) - 1, 0
    while i >= 0:
        ret[j] = ch[i]
        i -= 1
        j += 1
    return ret

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

