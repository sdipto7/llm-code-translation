
import sys
from typing import List

class Main:
    def __init__(self):
        self.colorMtr: List[List[str]] = []
        self.h: int = 0
        self.w: int = 0
        self.k: int = 0

    def main(self):
        self.solve()

    def solve(self):
        fs = FastScanner()
        
        self.h = fs.nextInt()
        self.w = fs.nextInt()
        self.k = fs.nextInt()

        self.colorMtr = [None] * self.h
        for i in range(self.h):
            self.colorMtr[i] = list(fs.next())

        hPattern = self.pow(2, self.h)
        wPattern = self.pow(2, self.w)

        ans = 0

        for i in range(hPattern):
            for j in range(wPattern):
                if self.judge(i, j):
                    ans += 1

        print(ans)

    def judge(self, hPattern: int, wPattern: int) -> bool:
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

    def pow(self, base: int, n: int) -> int:
        retVal = 1
        while n > 0:
            if (n & 1) == 1:
                retVal *= base
            n >>= 1
            base *= base
        return retVal

class FastScanner:
    def __init__(self):
        self.st = None
        self.reader = sys.stdin

    def next(self) -> str:
        if self.st is None or not self.st.hasMoreTokens():
            self.st = StringTokenizer(self.reader.readline())
        return self.st.nextToken()

    def nextLine(self) -> str:
        self.st = None
        return self.reader.readline().strip()

    def nextInt(self) -> int:
        return int(self.next())

    def nextLong(self) -> int:
        return int(self.next())

    def nextIntArr(self, n: int) -> List[int]:
        return [self.nextInt() for _ in range(n)]

    def nextLongArr(self, n: int) -> List[int]:
        return [self.nextLong() for _ in range(n)]

class StringTokenizer:
    def __init__(self, string: str):
        self.tokens = string.split()
        self.index = 0

    def nextToken(self) -> str:
        token = self.tokens[self.index]
        self.index += 1
        return token

    def hasMoreTokens(self) -> bool:
        return self.index < len(self.tokens)

if __name__ == "__main__":
    Main().main()

