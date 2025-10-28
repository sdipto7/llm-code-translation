
import sys
from collections import defaultdict, deque
from math import gcd

class Helper:
    def __init__(self, mod):
        self.MOD = mod
        self.factorial = None
        self.sieve = None
        self.primes = None

    def set_sieve(self, maxn):
        self.primes = []
        self.sieve = [0] * maxn
        for i in range(2, maxn):
            if self.sieve[i] == 0:
                self.primes.append(i)
                for j in range(i, maxn, i):
                    self.sieve[j] = i

    def set_factorial(self, maxn):
        self.factorial = [1] * (maxn + 1)
        for i in range(1, maxn + 1):
            self.factorial[i] = self.factorial[i - 1] * i % self.MOD

    def get_factorial(self, n, maxn):
        if self.factorial is None:
            self.set_factorial(maxn)
        return self.factorial[n]

    def ncr(self, n, r, maxn):
        if r > n:
            return 0
        if self.factorial is None:
            self.set_factorial(maxn)
        numerator = self.factorial[n]
        denominator = self.factorial[r] * self.factorial[n - r] % self.MOD
        return numerator * pow(denominator, self.MOD - 2, self.MOD) % self.MOD

    def get_long_array(self, size):
        return list(map(int, sys.stdin.readline().split()))

    def get_int_array(self, size):
        return list(map(int, sys.stdin.readline().split()))

    def get_string_array(self, size):
        return sys.stdin.readline().split()

    def join_elements(self, *ar):
        return ' '.join(map(str, ar))

    def max(self, *ar):
        return max(ar)

    def min(self, *ar):
        return min(ar)

    def sum(self, *ar):
        return sum(ar)

    def pow(self, base, exp):
        return pow(base, exp, self.MOD)


class Solver:
    def __init__(self):
        self.hp = Helper(10**9 + 7)
        self.MAXN = 1000006
        self.TESTCASES = False

    def solve(self):
        if self.TESTCASES:
            tc = int(sys.stdin.readline())
        else:
            tc = 1
        for tce in range(tc):
            self.solve_tc(tce + 1)

    def solve_tc(self, tc):
        N = int(sys.stdin.readline())
        K = int(sys.stdin.readline())
        A = list(map(int, sys.stdin.readline().split()))

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
            print(straight[int(K)] + 1)
        else:
            K -= len(straight)
            print(cycle[int(K % len(cycle))] + 1)


def main():
    solver = Solver()
    solver.solve()


if __name__ == "__main__":
    main()

