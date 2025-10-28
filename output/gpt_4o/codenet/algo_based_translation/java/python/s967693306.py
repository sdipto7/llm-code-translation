
import sys
from collections import defaultdict
from itertools import permutations
from math import gcd, isqrt

INF = float('inf')
MOD = 1_000_000_007
SIZE = 1_000_000

class Main:
    def __init__(self):
        self.fac = [0] * SIZE
        self.inv = [0] * SIZE
        self.finv = [0] * SIZE
        self.sc = FastScanner()

    def solve(self):
        n = self.sc.next_int()
        m = self.sc.next_int()
        map_ = {}

        for _ in range(m):
            s = self.sc.next_int()
            c = self.sc.next_int()
            if s in map_ and map_[s] != c:
                print(-1)
                sys.exit()
            map_[s] = c

        for i in range(1000):
            s = str(i)
            if len(s) < n:
                continue
            flag = True
            for j in range(n):
                if (j + 1 in map_ and map_[j + 1] != int(s[j])) or (j + 1 not in map_ and int(s[j]) != 0):
                    if j + 1 not in map_ and j == 0 and int(s[j]) == 1:
                        continue
                    flag = False
                    break
            if flag and len(s) == n:
                print(s)
                sys.exit()
        print(-1)

    def lcm(self, a, b):
        return a * b // gcd(a, b)

    def inv(self, a):
        return self.pow(a, MOD - 2)

    def pow(self, a, r):
        sum_ = 1
        while r > 0:
            if (r & 1) == 1:
                sum_ *= a
                sum_ %= MOD
            a *= a
            a %= MOD
            r >>= 1
        return sum_

    def modFact(self, n):
        if n == 0:
            return 1
        return n * self.modFact(n - 1) % MOD

    def fact(self, n):
        if n == 0:
            return 1
        return n * self.fact(n - 1)

    def initCOMB(self):
        self.fac[0] = self.fac[1] = 1
        self.inv[1] = 1
        self.finv[0] = self.finv[1] = 1
        for i in range(2, SIZE):
            self.fac[i] = self.fac[i - 1] * i % MOD
            self.inv[i] = MOD - self.inv[MOD % i] * (MOD // i) % MOD
            self.finv[i] = self.finv[i - 1] * self.inv[i] % MOD

    def modComb(self, n, r):
        if n < r or n < 0 or r < 0:
            return 0
        return self.fac[n] * self.finv[r] % MOD * self.finv[n - r] % MOD

    def comb(self, n, r):
        num = 1
        for i in range(1, r + 1):
            num = num * (n - i + 1) // i
        return num

    def isPrime(self, a):
        if a <= 1:
            return False
        for i in range(2, isqrt(a) + 1):
            if a % i == 0:
                return False
        return True

    def nextPermutation(self, s):
        list_ = list(s)
        pivotPos = -1
        pivot = 0
        for i in range(len(list_) - 2, -1, -1):
            if list_[i] < list_[i + 1]:
                pivotPos = i
                pivot = list_[i]
                break

        if pivotPos == -1:
            return None

        L = pivotPos + 1
        R = len(list_) - 1
        minPos = -1
        min_ = chr(127)
        for i in range(R, L - 1, -1):
            if pivot < list_[i] < min_:
                min_ = list_[i]
                minPos = i

        list_[pivotPos], list_[minPos] = list_[minPos], list_[pivotPos]
        list_[L:] = sorted(list_[L:])
        return ''.join(list_)

    def nextPermutation_array(self, a):
        for i in range(len(a) - 1, 0, -1):
            if a[i - 1] < a[i]:
                swapIndex = self.find(a[i - 1], a, i, len(a) - 1)
                a[swapIndex], a[i - 1] = a[i - 1], a[swapIndex]
                a[i:] = sorted(a[i:])
                return True
        return False

    def find(self, dest, a, s, e):
        if s == e:
            return s
        m = (s + e + 1) // 2
        if a[m] <= dest:
            return self.find(dest, a, s, m - 1)
        else:
            return self.find(dest, a, m, e)

    def elimination(self, a, b):
        n = len(a)
        for k in range(n - 1):
            for i in range(k + 1, n):
                f = -a[i][k] / a[k][k]
                for j in range(k + 1, n):
                    a[i][j] += f * a[k][j]
                b[i] += f * b[k]
            for i in range(n - 1, -1, -1):
                for j in range(i + 1, n):
                    b[i] -= a[i][j] * b[j]
                b[i] = b[i] / a[i][i]

class Pair:
    def __init__(self, i, j):
        self.a = i
        self.b = j

    def __lt__(self, other):
        return self.b < other.b

class FastScanner:
    def __init__(self):
        self.buffer = sys.stdin.read().split()
        self.ptr = 0

    def next(self):
        if self.ptr < len(self.buffer):
            result = self.buffer[self.ptr]
            self.ptr += 1
            return result
        raise Exception("No more input")

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return int(self.next())

    def next_double(self):
        return float(self.next())

if __name__ == "__main__":
    main = Main()
    main.solve()

