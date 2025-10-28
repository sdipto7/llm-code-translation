
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
    def __init__(self, file=sys.stdin):
        self.file = file
        self.buf = file.read()
        self.buflist = self.buf.splitlines()
        self.index = 0

    def read(self):
        if self.index >= len(self.buflist):
            raise StopIteration
        result = self.buflist[self.index]
        self.index += 1
        return result

    def next(self):
        return self.read().strip()

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return int(self.next())

    def nextFloat(self):
        return float(self.next())

    def nextLine(self):
        return self.read()

    def nextList(self):
        return self.next().split()

    def nextListInt(self):
        return list(map(int, self.nextList()))

    def nextListFloat(self):
        return list(map(float, self.nextList()))

    def hasNext(self):
        return self.index < len(self.buflist)

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

def modpow(x, n, mo):
    sum = 1
    while n > 0:
        if n & 1:
            sum = sum * x % mo
        x = x * x % mo
        n >>= 1
    return sum

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
    if a % b == 0:
        return a // b
    else:
        return a // b + 1

def lupper_division(a, b):
    if a % b == 0:
        return a // b
    else:
        return a // b + 1

def setArray(a):
    return list(map(int, input().split()))

def lsetArray(a):
    return list(map(int, input().split()))

def reverse(s):
    return s[::-1]

def printArray(que):
    print(" ".join(map(str, que)))

def doublesort(a):
    return sorted(a, key=lambda x: x[0])

def ldoublesort(a):
    return sorted(a, key=lambda x: x[0])

def warshall_floyd(v, n):
    for k in range(n):
        for i in range(n):
            for j in range(n):
                v[i][j] = min(v[i][j], v[i][k] + v[k][j])

def main():
    scan = FastScanner()
    str = scan.next()
    print("Yes" if str[2] == str[3] and str[4] == str[5] else "No")

if __name__ == "__main__":
    main()

