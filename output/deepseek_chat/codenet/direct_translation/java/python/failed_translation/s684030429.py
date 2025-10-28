
import sys
import math

class Main:
    def __init__(self):
        self.sc = sys.stdin
        self.max = 0
        self.cur = 0

    def solve(self):
        a = int(self.sc.readline())
        b = int(self.sc.readline())
        print(max(0, a - 2 * b))

    def ni(self):
        return int(self.sc.readline())

    def nl(self):
        return int(self.sc.readline())

    def nf(self):
        return float(self.sc.readline())

    def nd(self):
        return float(self.sc.readline())

    def ns(self):
        return self.sc.readline().strip()

    def nst(self, s):
        return s.split()

    def ia(self, a):
        a[:] = map(int, self.sc.readline().split())

    def la(self, a):
        a[:] = map(int, self.sc.readline().split())

    def fa(self, a):
        a[:] = map(float, self.sc.readline().split())

    def da(self, a):
        a[:] = map(float, self.sc.readline().split())

    def sa(self, a, empty):
        if empty:
            a[:] = [""] * len(a)
        else:
            a[:] = [self.ns() for _ in range(len(a))]

    def ida(self, a, n, m):
        for i in range(n):
            a[i] = list(map(int, self.sc.readline().split()))

    def lda(self, a, n, m):
        for i in range(n):
            a[i] = list(map(int, self.sc.readline().split()))

    def dda(self, a, n, m):
        for i in range(n):
            a[i] = list(map(float, self.sc.readline().split()))

    def stoi(self, s):
        return int(s)

    def stod(self, s):
        return float(s)

    def lmin(self, a):
        return min(a)

    def imin(self, a):
        return min(a)

    def lmax(self, a):
        return max(a)

    def imax(self, a):
        return max(a)

    def ibs(self, a, to_find):
        return to_find in a

    def lbs(self, a, to_find):
        return to_find in a

    def stb(self, s):
        return int(s, 2)

if __name__ == "__main__":
    Main().solve()

