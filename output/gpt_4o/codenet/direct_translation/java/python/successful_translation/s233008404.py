
import sys
from itertools import product

class Main:
    def __init__(self):
        self.colorMtr = []
        self.h = 0
        self.w = 0
        self.k = 0

    def solve(self):
        fs = FastScanner()
        
        self.h = fs.next_int()
        self.w = fs.next_int()
        self.k = fs.next_int()
        
        self.colorMtr = [list(fs.next()) for _ in range(self.h)]
        
        hPattern = 1 << self.h
        wPattern = 1 << self.w
        
        ans = 0
        
        for i in range(hPattern):
            for j in range(wPattern):
                if self.judge(i, j):
                    ans += 1

        print(ans)
    
    def judge(self, hPattern, wPattern):
        hBitArr = [0] * self.h
        wBitArr = [0] * self.w
        
        for i in range(self.h):
            if ((hPattern >> i) & 1) == 1:
                hBitArr[i] = 1
        
        for i in range(self.w):
            if ((wPattern >> i) & 1) == 1:
                wBitArr[i] = 1
        
        black = 0
        
        for i in range(self.h):
            for j in range(self.w):
                if hBitArr[i] == 1 or wBitArr[j] == 1:
                    continue
                if self.colorMtr[i][j] == "#":
                    black += 1
        
        return black == self.k

class FastScanner:
    def __init__(self):
        self.reader = sys.stdin
        self.st = None

    def next(self):
        if self.st is None or not self.st:
            self.st = self.reader.readline().strip().split()
        return self.st.pop(0)

    def next_int(self):
        return int(self.next())

if __name__ == "__main__":
    mainObj = Main()
    mainObj.solve()

