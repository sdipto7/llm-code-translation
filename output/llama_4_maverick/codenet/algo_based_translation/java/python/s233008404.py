
import sys
from io import StringIO
import unittest
from math import *

class FastScanner:
    def __init__(self, stream):
        self.stream = stream
        self.tokens = []

    def next(self):
        if not self.tokens:
            self.tokens = self.stream.readline().split()
        return self.tokens.pop(0)

    def next_line(self):
        return self.stream.readline().strip()

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return int(self.next())

    def next_int_arr(self, n):
        return [self.next_int() for _ in range(n)]

    def next_long_arr(self, n):
        return [self.next_long() for _ in range(n)]

class Main:
    def __init__(self):
        self.colorMtr = None
        self.h = None
        self.w = None
        self.k = None

    def solve(self, fs):
        self.h = fs.next_int()
        self.w = fs.next_int()
        self.k = fs.next_int()

        self.colorMtr = [list(fs.next_line()) for _ in range(self.h)]

        hPattern = self.pow(2, self.h)
        wPattern = self.pow(2, self.w)

        ans = 0

        for i in range(hPattern):
            for j in range(wPattern):
                if self.judge(i, j):
                    ans += 1

        print(ans)

    def judge(self, hPattern, wPattern):
        hBitArr = [(hPattern >> idx) & 1 for idx in range(self.h)]
        wBitArr = [(wPattern >> idx) & 1 for idx in range(self.w)]

        black = 0

        for i in range(self.h):
            for j in range(self.w):
                if hBitArr[i] == 1 or wBitArr[j] == 1:
                    continue

                if self.colorMtr[i][j] == "#":
                    black += 1

        return black == self.k

    def pow(self, base, n):
        retVal = 1
        while n > 0:
            if n & 1:
                retVal *= base
            n >>= 1
            base *= base
        return retVal

def main():
    stream = sys.stdin
    fs = FastScanner(stream)
    main_obj = Main()
    main_obj.solve(fs)

if __name__ == "__main__":
    main()

