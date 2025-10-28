
import sys
import math
from collections import defaultdict

class Main:
    def __init__(self):
        self.sc = sys.stdin.readline
        self.max = 0
        self.cur = 0

    def solve(self):
        a = self.ni()
        b = self.ni()
        print(max(0, a-2*b))

    def ni(self):
        return int(self.sc().strip())

    def nl(self):
        return int(self.sc().strip())

    def nf(self):
        return float(self.sc().strip())

    def nd(self):
        return float(self.sc().strip())

    def ns(self):
        return self.sc().strip()

    def ia(self, n):
        return [int(x) for x in self.sc().strip().split()]

    def la(self, n):
        return [int(x) for x in self.sc().strip().split()]

    def fa(self, n):
        return [float(x) for x in self.sc().strip().split()]

    def da(self, n):
        return [float(x) for x in self.sc().strip().split()]

    def ida(self, n, m):
        return [self.ia(m) for _ in range(n)]

    def lda(self, n, m):
        return [self.la(m) for _ in range(n)]

    def dda(self, n, m):
        return [self.da(m) for _ in range(n)]

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

    def ibs(self, a, toFind):
        a.sort()
        min = 0
        max = len(a)-1
        found = False

        while min <= max and not found:
            mid = min + (max-min)//2
            if a[mid] == toFind:
                found = True
            elif toFind > a[mid]:
                min = mid+1
            else:
                max = mid-1

        return found

    def lbs(self, a, toFind):
        a.sort()
        min = 0
        max = len(a)-1
        found = False

        while min <= max and not found:
            mid = min + (max-min)//2
            if a[mid] == toFind:
                found = True
            elif toFind > a[mid]:
                min = mid+1
            else:
                max = mid-1

        return found

    def stb(self, s):
        return int(s, 2)

if __name__ == "__main__":
    main = Main()
    main.solve()

