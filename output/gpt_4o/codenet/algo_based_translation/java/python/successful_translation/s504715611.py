
import sys
import math
from functools import cmp_to_key

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
        self.inp = sys.stdin.read()
        self.ptr = 0
        self.buflen = len(self.inp)

    def hasNextByte(self):
        return self.ptr < self.buflen

    def readByte(self):
        if self.hasNextByte():
            byte = self.inp[self.ptr]
            self.ptr += 1
            return byte
        else:
            return -1

    def isPrintableChar(self, c):
        return 33 <= c <= 126

    def hasNext(self):
        while self.hasNextByte() and not self.isPrintableChar(ord(self.inp[self.ptr])):
            self.ptr += 1
        return self.hasNextByte()

    def next(self):
        if not self.hasNext():
            raise Exception("NoSuchElementException")
        sb = []
        b = self.readByte()
        while self.isPrintableChar(ord(b)):
            sb.append(b)
            b = self.readByte()
        return ''.join(sb)

    def nextLong(self):
        if not self.hasNext():
            raise Exception("NoSuchElementException")
        n = 0
        minus = False
        b = self.readByte()
        if b == '-':
            minus = True
            b = self.readByte()
        if not '0' <= b <= '9':
            raise Exception("NumberFormatException")
        while True:
            if '0' <= b <= '9':
                n = n * 10 + (ord(b) - ord('0'))
            elif b == -1 or not self.isPrintableChar(ord(b)):
                return -n if minus else n
            else:
                raise Exception("NumberFormatException")
            b = self.readByte()

    def nextInt(self):
        nl = self.nextLong()
        if nl < -2147483648 or nl > 2147483647:
            raise Exception("NumberFormatException")
        return int(nl)

    def nextDouble(self):
        return float(self.next())

    def nextchar(self):
        return self.readByte()

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

def lower_bound(a, key):
    left, right = 0, len(a)
    while right - left > 1:
        mid = (right + left) // 2
        if a[mid] < key:
            left = mid
        else:
            right = mid
    return left

def upper_bound(a, key):
    left, right = 0, len(a)
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
    d = math.isqrt(n)
    for i in range(3, d + 1, 2):
        if n % i == 0:
            return False
    return True

def upper_division(a, b):
    return a // b if a % b == 0 else a // b + 1

def lupper_division(a, b):
    return a // b if a % b == 0 else a // b + 1

def setArray(a):
    return [scan.nextInt() for _ in range(a)]

def lsetArray(a):
    return [scan.nextLong() for _ in range(a)]

def reverse(str):
    ch = list(str)
    a = len(str)
    for i in range(upper_division(a, 2)):
        ch[i], ch[a - i - 1] = ch[a - i - 1], ch[i]
    return ''.join(ch)

def printArray(que):
    print(' '.join(map(str, que)))

def doublesort(a):
    a.sort(key=cmp_to_key(lambda x, y: x[0] - y[0]))
    return a

def ldoublesort(a):
    a.sort(key=cmp_to_key(lambda x, y: x[0] - y[0]))
    return a

def modpow(x, n, mo):
    sum = 1
    while n > 0:
        if n & 1:
            sum = sum * x % mo
        x = x * x % mo
        n >>= 1
    return sum

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
    b, u, v = m, 1, 0
    while b != 0:
        t = a // b
        a, b = b, a - t * b
        u, v = v, u - t * v
    u %= m
    if u < 0:
        u += m
    return u

scan = FastScanner()

if __name__ == '__main__':
    str = scan.next()
    if str[2] == str[3] and str[4] == str[5]:
        print("Yes")
    else:
        print("No")

