import sys

class Main:
    def __init__(self):
        self.colorMtr = []
        self.h = 0
        self.w = 0
        self.k = 0

    def solve(self):
        import sys
        input = sys.stdin.read().split()
        fs = FastScanner(input)

        self.h = fs.nextInt()
        self.w = fs.nextInt()
        self.k = fs.nextInt()

        self.colorMtr = [list(fs.next()) for _ in range(self.h)]

        hPattern = self.pow(2, self.h)
        wPattern = self.pow(2, self.w)
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
            if (hPattern >> i) & 1 == 1:
                hBitArr[i] = 1

        for i in range(self.w):
            if (wPattern >> i) & 1 == 1:
                wBitArr[i] = 1

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
            if n & 1 == 1:
                retVal *= base
            n >>= 1
            base *= base
        return retVal

class FastScanner:
    def __init__(self, input):
        self.input = input
        self.index = 0

    def next(self):
        result = self.input[self.index]
        self.index += 1
        return result

    def nextLine(self):
        result = ' '.join(self.input[self.index:])
        self.index = len(self.input)
        return result

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return int(self.next())

    def nextIntArr(self, n):
        return [self.nextInt() for _ in range(n)]

    def nextLongArr(self, n):
        return [self.nextLong() for _ in range(n)]

if __name__ == "__main__":
    mainObj = Main()
    mainObj.solve()
