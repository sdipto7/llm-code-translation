
import sys

class Solver:
    def __init__(self, sc, writer):
        self.sc = sc
        self.writer = writer
        self.n = 0
        self.m = 0
        self.q = 0
        self.max = 0
        self.a = []
        self.b = []
        self.c = []
        self.d = []

    def run(self):
        self.n = self.sc.next_int()
        self.m = self.sc.next_int()
        self.q = self.sc.next_int()
        self.a = [0] * self.q
        self.b = [0] * self.q
        self.c = [0] * self.q
        self.d = [0] * self.q
        for i in range(self.q):
            self.a[i] = self.sc.next_int()
            self.b[i] = self.sc.next_int()
            self.c[i] = self.sc.next_int()
            self.d[i] = self.sc.next_int()
        self.dfs([1])
        self.writer.write(f"{self.max}\n")

    def dfs(self, array):
        if len(array) > self.n:
            score = 0
            for i in range(self.q):
                if array[self.b[i]] - array[self.a[i]] == self.c[i]:
                    score += self.d[i]
            self.max = max(self.max, score)
            return
        newArray = array + [array[-1]]
        while newArray[-1] <= self.m:
            self.dfs(newArray)
            newArray[-1] += 1

class FastScanner:
    def __init__(self):
        self.in_ = sys.stdin.buffer
        self.buffer = bytearray()
        self.ptr = 0
        self.buflen = 0

    def hasNextByte(self):
        if self.ptr < self.buflen:
            return True
        else:
            self.ptr = 0
            self.buflen = self.in_.readinto(self.buffer)
            if self.buflen <= 0:
                return False
            return True

    def readByte(self):
        if self.hasNextByte():
            result = self.buffer[self.ptr]
            self.ptr += 1
            return result
        else:
            return -1

    def isPrintableChar(self, c):
        return 33 <= c <= 126

    def hasNext(self):
        while self.hasNextByte() and not self.isPrintableChar(self.buffer[self.ptr]):
            self.ptr += 1
        return self.hasNextByte()

    def next(self):
        if not self.hasNext():
            raise Exception("No more input")
        sb = bytearray()
        b = self.readByte()
        while self.isPrintableChar(b):
            sb.append(b)
            b = self.readByte()
        return sb.decode()

    def nextLong(self):
        if not self.hasNext():
            raise Exception("No more input")
        n = 0
        minus = False
        b = self.readByte()
        if b == ord('-'):
            minus = True
            b = self.readByte()
        if b < ord('0') or ord('9') < b:
            raise Exception("Invalid number format")
        while True:
            if ord('0') <= b <= ord('9'):
                n *= 10
                n += b - ord('0')
            elif b == -1 or not self.isPrintableChar(b):
                return -n if minus else n
            else:
                raise Exception("Invalid number format")
            b = self.readByte()

    def nextInt(self):
        return int(self.nextLong())

    def nextDouble(self):
        return float(self.next())

    def nextIntArray(self, n):
        return [self.nextInt() for _ in range(n)]

    def nextLongArray(self, n):
        return [self.nextLong() for _ in range(n)]

def main():
    sc = FastScanner()
    solver = Solver(sc, sys.stdout)
    solver.run()

if __name__ == "__main__":
    main()

