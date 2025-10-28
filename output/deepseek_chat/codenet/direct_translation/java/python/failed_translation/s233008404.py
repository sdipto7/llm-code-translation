
import sys

class Main:
    def __init__(self):
        self.colorMtr = []
        self.h = 0
        self.w = 0
        self.k = 0

    def main(self):
        self.solve()

    def solve(self):
        fs = FastScanner()
        self.h = fs.next_int()
        self.w = fs.next_int()
        self.k = fs.next_int()
        self.colorMtr = [list(fs.next()) for _ in range(self.h)]
        hPattern = pow(2, self.h)
        wPattern = pow(2, self.w)
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
            if (hPattern >> i) & 1:
                hBitArr[i] = 1
        for i in range(self.w):
            if (wPattern >> i) & 1:
                wBitArr[i] = 1
        black = 0
        for i in range(self.h):
            for j in range(self.w):
                if hBitArr[i] == 1 or wBitArr[j] == 1:
                    continue
                if self.colorMtr[i][j] == '#':
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

class FastScanner:
    def __init__(self):
        self.reader = sys.stdin
        self.st = None

    def next(self):
        if self.st is None or not self.st.hasMoreElements():
            self.st = sys.stdin.readline().split()
        return self.st.pop(0)

    def next_int(self):
        return int(self.next())

    def next_line(self):
        self.st = None
        return sys.stdin.readline().strip()

if __name__ == "__main__":
    mainObj = Main()
    mainObj.main()

