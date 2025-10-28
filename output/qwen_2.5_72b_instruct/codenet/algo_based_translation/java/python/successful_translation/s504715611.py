
import sys
import math

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
        self.in_ = sys.stdin
        self.buffer = []
    
    def _read(self):
        while not self.buffer:
            self.buffer = sys.stdin.readline().strip().split()
        return self.buffer.pop(0)
    
    def hasNext(self):
        return bool(self.buffer or sys.stdin.read(1))
    
    def next(self):
        return self._read()
    
    def nextLong(self):
        return int(self._read())
    
    def nextInt(self):
        return int(self._read())
    
    def nextDouble(self):
        return float(self._read())
    
    def nextchar(self):
        return sys.stdin.read(1)

def modlcm(a, b):
    return a * b * modint(gcd(a, b), mod)

def gcd(a, b):
    while b > 0:
        a, b = b, a % b
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
    return i * factorial(i - 1)

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
    for i in range(3, int(math.sqrt(n)) + 1, 2):
        if n % i == 0:
            return False
    return True

def upper_division(a, b):
    return a // b if a % b == 0 else a // b + 1

def lupper_division(a, b):
    return a // b if a % b == 0 else a // b + 1

def setArray(a):
    return [FastScanner().nextInt() for _ in range(a)]

def lsetArray(a):
    return [FastScanner().nextLong() for _ in range(a)]

def reverse(str_):
    return str_[::-1]

def printArray(que):
    print(' '.join(map(str, que)))

def doublesort(a):
    return sorted(a, key=lambda x: x[0])

def ldoublesort(a):
    return sorted(a, key=lambda x: x[0])

def modpow(x, n, mo):
    sum_ = 1
    while n > 0:
        if n % 2 == 1:
            sum_ = sum_ * x % mo
        x = x * x % mo
        n //= 2
    return sum_

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

if __name__ == "__main__":
    scan = FastScanner()
    str_ = scan.next()
    print("Yes" if str_[2] == str_[3] and str_[4] == str_[5] else "No")

