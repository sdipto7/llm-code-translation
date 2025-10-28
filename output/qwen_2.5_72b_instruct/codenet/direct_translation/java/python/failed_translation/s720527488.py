
import sys
import random

class InputReader:
    def __init__(self, stream):
        self.stream = stream
        self.buffer = []
        self.preload()

    def preload(self):
        while True:
            try:
                self.buffer.extend(list(self.stream.readline().strip()))
            except:
                self.buffer.append(-1)
                break

    def readByte(self):
        if len(self.buffer) == 0:
            self.preload()
        if len(self.buffer) == 1 and self.buffer[0] == -1:
            return -1
        return ord(self.buffer.pop(0))

    def isSpaceChar(self, c):
        return not (33 <= c <= 126)

    def skip(self):
        b = self.readByte()
        while self.isSpaceChar(b):
            b = self.readByte()
        return b

    def next(self):
        b = self.skip()
        sb = []
        while not self.isSpaceChar(b):
            sb.append(chr(b))
            b = self.readByte()
        return ''.join(sb)

    def nextInt(self):
        c = self.readByte()
        while self.isSpaceChar(c):
            c = self.readByte()
        minus = False
        if c == 45:
            minus = True
            c = self.readByte()
        res = 0
        while not self.isSpaceChar(c):
            if not (48 <= c <= 57):
                raise Exception("InputMismatchException")
            res = res * 10 + c - 48
            c = self.readByte()
        return -res if minus else res

    def nextLong(self):
        c = self.readByte()
        while self.isSpaceChar(c):
            c = self.readByte()
        minus = False
        if c == 45:
            minus = True
            c = self.readByte()
        res = 0
        while not self.isSpaceChar(c):
            if not (48 <= c <= 57):
                raise Exception("InputMismatchException")
            res = res * 10 + c - 48
            c = self.readByte()
        return -res if minus else res

    def toIntArray(self, n):
        a = []
        for _ in range(n):
            a.append(self.nextInt())
        return a

INF = sys.maxsize // 2
LINF = sys.maxsize // 2

def sort(a):
    for i in range(len(a) - 1, 0, -1):
        t = random.randint(0, i)
        a[i], a[t] = a[t], a[i]
    a.sort()

def main():
    ir = InputReader(sys.stdin)
    m = ir.nextInt()
    n = ir.nextInt()
    manju = ir.toIntArray(m)
    boxlen = [0] * n
    boxcost = [0] * n
    for i in range(n):
        boxlen[i] = ir.nextInt()
        boxcost[i] = ir.nextInt()
    sort(manju)
    dp = [[0] * (n + 1) for _ in range(m + 1)]
    for i in range(m - 1, -1, -1):
        for j in range(n - 1, -1, -1):
            len_ = i + boxlen[j] if i + boxlen[j] < m else m
            cnt = sum(manju[m - 1 - k] for k in range(i, len_))
            dp[i][j] = max(dp[i][j], dp[len_][j + 1] + cnt - boxcost[j])
            dp[i][j] = max(dp[i][j], dp[i][j + 1])
    print(dp[0][0])

if __name__ == "__main__":
    main()

