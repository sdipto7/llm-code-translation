
import sys
from io import StringIO
import random
import math

class Main:
    def run(self):
        try:
            solver = Solver()
            solver.solve()
            sys.exit(0)
        except Exception as e:
            print(e, file=sys.stderr)
            sys.exit(1)

    @staticmethod
    def main(args):
        main = Main()
        main.run()

class Solver:
    def __init__(self):
        self.hp = Helper(10**9 + 7, 1000006)
        self.hp.initIO(sys.stdin, sys.stdout)
        self.TESTCASES = False

    def solve(self):
        tc = self.hp.nextInt() if self.TESTCASES else 1
        for tce in range(1, tc + 1):
            self.solve_one(tce)
        self.hp.flush()

    def solve_one(self, tc):
        N = self.hp.nextInt()
        K = self.hp.nextLong()
        A = self.hp.getIntArray(N)

        straight = []
        cycle = []
        vis = [False] * N
        curr = 0
        while not vis[curr]:
            vis[curr] = True
            curr = A[curr] - 1

        st = 0
        while st != curr:
            straight.append(st)
            st = A[st] - 1

        cycle.append(curr)
        curr = A[curr] - 1
        while curr != cycle[0]:
            cycle.append(curr)
            curr = A[curr] - 1

        if K < len(straight):
            self.hp.println(straight[int(K)] + 1)
        else:
            K -= len(straight)
            self.hp.println(cycle[int(K % len(cycle))] + 1)

class Helper:
    def __init__(self, mod, maxn):
        self.MOD = mod
        self.MAXN = maxn
        self.rnd = random.Random()

    def setSieve(self):
        self.primes = []
        self.sieve = [0] * self.MAXN
        for i in range(2, self.MAXN):
            if self.sieve[i] == 0:
                self.primes.append(i)
                for j in range(i, self.MAXN, i):
                    self.sieve[j] = i

    def setFactorial(self):
        self.factorial = [0] * self.MAXN
        self.factorial[0] = 1
        for i in range(1, self.MAXN):
            self.factorial[i] = self.factorial[i - 1] * i % self.MOD

    def getFactorial(self, n):
        if getattr(self, 'factorial', None) is None:
            self.setFactorial()
        return self.factorial[n]

    def ncr(self, n, r):
        if r > n:
            return 0
        if getattr(self, 'factorial', None) is None:
            self.setFactorial()
        numerator = self.factorial[n]
        denominator = self.factorial[r] * self.factorial[n - r] % self.MOD
        return numerator * self.pow(denominator, self.MOD - 2, self.MOD) % self.MOD

    def getLongArray(self, size):
        ar = [0] * size
        for i in range(size):
            ar[i] = self.nextLong()
        return ar

    def getIntArray(self, size):
        ar = [0] * size
        for i in range(size):
            ar[i] = self.nextInt()
        return ar

    def getStringArray(self, size):
        ar = [0] * size
        for i in range(size):
            ar[i] = self.next()
        return ar

    def joinElements(self, *ar):
        return ' '.join(map(str, ar))

    def gcd(self, a, b):
        while b != 0:
            a, b = b, a % b
        return a

    def max(self, *ar):
        return max(ar)

    def min(self, *ar):
        return min(ar)

    def sum(self, *ar):
        return sum(ar)

    def shuffle(self, ar):
        random.shuffle(ar)

    def reverse(self, ar):
        ar.reverse()

    def pow(self, base, exp, MOD):
        base %= MOD
        ret = 1
        while exp > 0:
            if exp & 1:
                ret = ret * base % MOD
            base = base * base % MOD
            exp >>= 1
        return ret

    def initIO(self, is_input, os_output):
        self.in_stream = is_input
        self.out_stream = os_output
        self.buffer = StringIO()
        self.input_buffer = self.in_stream.read().splitlines()
        self.input_index = 0

    def scan(self):
        if self.input_index >= len(self.input_buffer):
            return -1
        return self.input_buffer[self.input_index]

    def next(self):
        while True:
            line = self.scan()
            if line == -1:
                return ""
            self.input_index += 1
            tokens = line.split()
            if tokens:
                return tokens[0]

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return int(self.next())

    def print(self, a):
        self.buffer.write(str(a))

    def printsp(self, a):
        self.print(a)
        self.print(" ")

    def println(self, a=""):
        self.print(a)
        self.print("\n")

    def flush(self):
        self.out_stream.write(self.buffer.getvalue())
        self.out_stream.flush()

if __name__ == "__main__":
    Main.main(sys.argv)

