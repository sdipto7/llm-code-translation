
import sys
import math
from collections import defaultdict

INF = float('inf')
MOD = 10**9 + 7
SIZE = 10**6

class Main:
    def __init__(self):
        self.fac = [1] * SIZE
        self.inv = [1] * SIZE
        self.finv = [1] * SIZE
        self.sc = FastScanner()

    def solve(self):
        n = self.sc.nextInt()
        m = self.sc.nextInt()
        map = defaultdict(int)

        for _ in range(m):
            s = self.sc.nextInt()
            c = self.sc.nextInt()
            if s in map and map[s] != c:
                print(-1)
                sys.exit()
            map[s] = c

        for i in range(1000):
            s = str(i)
            flag = True
            if len(s) < n:
                continue
            for j in range(n):
                if (j + 1 in map and map[j + 1] != int(s[j])) or (j + 1 not in map and int(s[j]) != 0):
                    if j + 1 not in map and j == 0 and int(s[j]) == 1:
                        continue
                    flag = False
                    break
            if flag and len(s) == n:
                print(s)
                sys.exit()

        print(-1)

    def gcd(self, a, b):
        if b == 0:
            return a
        return self.gcd(b, a % b)

    def lcm(self, a, b):
        return a * b // self.gcd(a, b)

    def inv(self, a):
        return self.pow(a, MOD - 2)

    def pow(self, a, r):
        sum = 1
        while r > 0:
            if r & 1:
                sum *= a
                sum %= MOD
            a *= a
            a %= MOD
            r >>= 1
        return sum

    def modFact(self, n):
        if n == 0:
            return 1
        return n * self.modFact(n - 1) % MOD

    def fact(self, n):
        if n == 0:
            return 1
        return n * self.fact(n - 1)

    def initCOMB(self):
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
        for i in range(2, int(math.isqrt(a)) + 1):
            if a % i == 0:
                return False
        return True

    def nextPermutation(self, s):
        lst = list(s)
        pivotPos = -1
        pivot = 0
        for i in range(len(lst) - 2, -1, -1):
            if lst[i] < lst[i + 1]:
                pivotPos = i
                pivot = lst[i]
                break

        if pivotPos == -1 and pivot == 0:
            return None

        L = pivotPos + 1
        R = len(lst) - 1
        minPos = -1
        minVal = float('inf')
        for i in range(R, L - 1, -1):
            if pivot < lst[i]:
                if lst[i] < minVal:
                    minVal = lst[i]
                    minPos = i

        lst[pivotPos], lst[minPos] = lst[minPos], lst[pivotPos]
        lst[L:] = sorted(lst[L:])

        return ''.join(lst)

    def nextPermutationArray(self, a):
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
        return s if a[m] <= dest else self.find(dest, a, m, e)

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

class FastScanner:
    def __init__(self):
        self.buffer = []
        self.ptr = 0
        self.buflen = 0

    def hasNextByte(self):
        if self.ptr < self.buflen:
            return True
        else:
            self.ptr = 0
            self.buflen = sys.stdin.read(1)
            if self.buflen <= 0:
                return False
        return True

    def readByte(self):
        if self.hasNextByte():
            return self.buffer[self.ptr]
        else:
            return -1

    def isPrintableChar(self, c):
        return 33 <= c <= 126

    def hasNext(self):
        while self.hasNextByte() and not self.isPrintableChar(self.buffer[self.ptr]):
            self.ptr += 1
        return self.hasNextByte()

    def next(self):
        if not self.hasNext():
            raise ValueError
        s = []
        b = self.readByte()
        while self.isPrintableChar(b):
            s.append(chr(b))
            b = self.readByte()
        return ''.join(s)

    def nextLong(self):
        if not self.hasNext():
            raise ValueError
        n = 0
        minus = False
        b = self.readByte()
        if b == '-':
            minus = True
            b = self.readByte()
        if b < '0' or '9' < b:
            raise ValueError
        while True:
            if '0' <= b <= '9':
                n *= 10
                n += int(b) - 0
            elif b == -1 or not self.isPrintableChar(b):
                return -n if minus else n
            else:
                raise ValueError
            b = self.readByte()

    def nextInt(self):
        nl = self.nextLong()
        if nl < -2**31 or nl > 2**31 - 1:
            raise ValueError
        return int(nl)

    def nextDouble(self):
        return float(self.next())

if __name__ == "__main__":
    Main().solve()

