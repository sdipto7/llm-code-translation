
import sys
import math
import random
from typing import List, Tuple

class UnionFind:
    def __init__(self, n: int):
        self.Parent = [-1] * n
    
    def root(self, A: int) -> int:
        if self.Parent[A] < 0:
            return A
        self.Parent[A] = self.root(self.Parent[A])
        return self.Parent[A]
    
    def size(self, A: int) -> int:
        return -self.Parent[self.root(A)]
    
    def connect(self, A: int, B: int) -> bool:
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
        self.in_stream = sys.stdin
        self.buffer = bytearray(1024)
        self.ptr = 0
        self.buflen = 0
    
    def hasNextByte(self) -> bool:
        if self.ptr < self.buflen:
            return True
        else:
            self.ptr = 0
            try:
                self.buflen = self.in_stream.readinto(self.buffer)
            except:
                pass
            if self.buflen <= 0:
                return False
            return True
    
    def readByte(self) -> int:
        if self.hasNextByte():
            result = self.buffer[self.ptr]
            self.ptr += 1
            return result
        else:
            return -1
    
    @staticmethod
    def isPrintableChar(c: int) -> bool:
        return 33 <= c <= 126
    
    def hasNext(self) -> bool:
        while self.hasNextByte() and not self.isPrintableChar(self.buffer[self.ptr]):
            self.ptr += 1
        return self.hasNextByte()
    
    def next(self) -> str:
        if not self.hasNext():
            raise Exception("NoSuchElementException")
        sb = []
        b = self.readByte()
        while self.isPrintableChar(b):
            sb.append(chr(b))
            b = self.readByte()
        return ''.join(sb)
    
    def nextLong(self) -> int:
        if not self.hasNext():
            raise Exception("NoSuchElementException")
        n = 0
        minus = False
        b = self.readByte()
        if b == ord('-'):
            minus = True
            b = self.readByte()
        if b < ord('0') or b > ord('9'):
            raise Exception("NumberFormatException")
        while True:
            if ord('0') <= b <= ord('9'):
                n = n * 10 + (b - ord('0'))
            elif b == -1 or not self.isPrintableChar(b):
                return -n if minus else n
            else:
                raise Exception("NumberFormatException")
            b = self.readByte()
    
    def nextInt(self) -> int:
        nl = self.nextLong()
        if nl < -2147483648 or nl > 2147483647:
            raise Exception("NumberFormatException")
        return int(nl)
    
    def nextDouble(self) -> float:
        return float(self.next())
    
    def nextchar(self) -> str:
        try:
            return chr(ord(sys.stdin.read(1))
        except:
            raise Exception("RuntimeException")

mod = 1000000007
eps = 1.0E-14
big = 2147483647
PI = 3.14159265358979323846262338327950288

def modlcm(a: int, b: int) -> int:
    return a * b * modint(gcd(a, b), mod)

def gcd(a: int, b: int) -> int:
    return gcd(b, a % b) if b > 0 else a

def lcm(a: int, b: int) -> int:
    return a * b // gcd(a, b)

def max(a: int, b: int) -> int:
    return a if a > b else b

def min(a: int, b: int) -> int:
    return a if a < b else b

def lmax(a: int, b: int) -> int:
    return max(a, b)

def lmin(a: int, b: int) -> int:
    return min(a, b)

def factorial(i: int) -> int:
    return 1 if i == 1 else i * factorial(i - 1)

def lower_bound(a: List[int], key: int) -> int:
    right = len(a)
    left = 0
    while right - left > 1:
        mid = (right + left) // 2
        if a[mid] < key:
            left = mid
        else:
            right = mid
    return left

def upper_bound(a: List[int], key: int) -> int:
    right = len(a)
    left = 0
    while right - left > 1:
        mid = (right + left) // 2
        if a[mid] <= key:
            left = mid
        else:
            right = mid
    return left

def isPrime(n: int) -> bool:
    if n == 2:
        return True
    if n < 2 or n % 2 == 0:
        return False
    d = math.isqrt(n)
    for i in range(3, d + 1, 2):
        if n % i == 0:
            return False
    return True

def upper_division(a: int, b: int) -> int:
    return a // b if a % b == 0 else a // b + 1

def lupper_division(a: int, b: int) -> int:
    return a // b if a % b == 0 else a // b + 1

def setArray(a: int) -> List[int]:
    scan = FastScanner()
    b = [0] * a
    for i in range(a):
        b[i] = scan.nextInt()
    return b

def lsetArray(a: int) -> List[int]:
    scan = FastScanner()
    b = [0] * a
    for i in range(a):
        b[i] = scan.nextLong()
    return b

def reverse(s: str) -> str:
    ch = [''] * len(s)
    chch = list(s)
    a = len(s)
    for i in range(upper_division(a, 2)):
        ch[i] = chch[len(ch) - i - 1]
        ch[len(ch) - 1 - i] = chch[i]
    return ''.join(ch)

def printArray(que: List[int]):
    for i in range(len(que) - 1):
        print(que[i], end=' ')
    print(que[-1])

def doublesort(a: List[List[int]]) -> List[List[int]]:
    a.sort(key=lambda x: x[0])
    return a

def ldoublesort(a: List[List[int]]) -> List[List[int]]:
    a.sort(key=lambda x: x[0])
    return a

def modpow(x: int, n: int, mo: int) -> int:
    sum_val = 1
    while n > 0:
        if n & 1 == 1:
            sum_val = sum_val * x % mo
        x = x * x % mo
        n >>= 1
    return sum_val

def revch(ch: List[str]) -> List[str]:
    ret = [''] * len(ch)
    j = 0
    for i in range(len(ch) - 1, -1, -1):
        ret[j] = ch[i]
        j += 1
    return ret

def revint(arr: List[int]) -> List[int]:
    ret = [0] * len(arr)
    j = 0
    for i in range(len(arr) - 1, -1, -1):
        ret[j] = arr[i]
        j += 1
    return ret

def warshall_floyd(v: List[List[int]], n: int):
    for k in range(n):
        for i in range(n):
            for j in range(n):
                v[i][j] = min(v[i][j], v[i][k] + v[k][j])

def modint(a: int, m: int) -> int:
    b = m
    u = 1
    v = 0
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
    if str_val[2] == str_val[3] and str_val[4] == str_val[5]:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()

