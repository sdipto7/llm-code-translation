
import sys
import math
from collections import defaultdict

INF = sys.maxsize // 2
MOD = 1_000_000_007
SIZE = 1_000_000

class Main:
    def __init__(self):
        self.fac = [0] * SIZE
        self.inv = [0] * SIZE
        self.finv = [0] * SIZE
        self.sc = FastScanner()

    def solve(self):
        n = self.sc.nextInt()
        m = self.sc.nextInt()
        map = defaultdict(int)

        for i in range(m):
            s = self.sc.nextInt()
            c = self.sc.nextInt()
            if map[s] != 0 and map[s] != c:
                print(-1)
                sys.exit(0)
            map[s] = c

        for i in range(1000):
            s = str(i)
            flag = True
            if len(s) < n:
                continue
            for j in range(n):
                if (map[j + 1] != 0 and map[j + 1] != int(s[j])) or (map[j + 1] == 0 and int(s[j]) != 0):
                    if map[j + 1] == 0 and j == 0 and int(s[j]) == 1:
                        continue
                    flag = False
                    break
            if flag and len(s) == n:
                print(s)
                sys.exit(0)

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
        for i in range(2, int(math.sqrt(a)) + 1):
            if a % i == 0:
                return False
        return True

    def nextPermutation(self, s):
        s = list(s)
        pivotPos = -1
        pivot = 0
        for i in range(len(s) - 2, -1, -1):
            if s[i] < s[i + 1]:
                pivotPos = i
                pivot = s[i]
                break

        if pivotPos == -1 and pivot == 0:
            return None

        L = pivotPos + 1
        R = len(s) - 1
        minPos = -1
        min_val = chr(ord('z') + 1)
        for i in range(R, L - 1, -1):
            if pivot < s[i]:
                if s[i] < min_val:
                    min_val = s[i]
                    minPos = i

        s[pivotPos], s[minPos] = s[minPos], s[pivotPos]
        s = s[:L] + sorted(s[L:])

        return ''.join(s)

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
        return self.find(dest, a, s, m - 1) if a[m] <= dest else self.find(dest, a, m, e)

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
            b[i] /= a[i][i]

class Pair:
    def __init__(self, i, j):
        self.a = i
        self.b = j

    def __lt__(self, other):
        return self.b < other.b

class FastScanner:
    def __init__(self, file=sys.stdin):
        self.file = file
        self.buffer = file.read()
        self.buffer = self.buffer.splitlines()
        self.index = 0

    def hasNext(self):
        return self.index < len(self.buffer)

    def next(self):
        if not self.hasNext():
            raise ValueError("No more input")
        result = self.buffer[self.index]
        self.index += 1
        return result

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return int(self.next())

    def nextDouble(self):
        return float(self.next())

if __name__ == "__main__":
    main = Main()
    main.solve()

