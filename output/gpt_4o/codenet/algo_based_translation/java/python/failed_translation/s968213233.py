
import sys
import heapq

class FastScanner:
    def __init__(self, stream):
        self.stream = stream
        self.buf = bytearray(1024)
        self.curChar = 0
        self.numChars = 0

    def read(self):
        if self.numChars == -1:
            raise Exception("InputMismatchException")
        if self.curChar >= self.numChars:
            self.curChar = 0
            self.numChars = self.stream.readinto(self.buf)
            if self.numChars <= 0:
                return -1
        c = self.buf[self.curChar]
        self.curChar += 1
        return c

    def isSpaceChar(self, c):
        return c in (b' ', b'\n', b'\r', b'\t', -1)

    def isEndline(self, c):
        return c in (b'\n', b'\r', -1)

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return int(self.next())

    def nextDouble(self):
        return float(self.next())

    def next(self):
        c = self.read()
        while self.isSpaceChar(c):
            c = self.read()
        result = bytearray()
        while not self.isSpaceChar(c):
            result.append(c)
            c = self.read()
        return result.decode()

    def nextLine(self):
        c = self.read()
        while self.isEndline(c):
            c = self.read()
        result = bytearray()
        while not self.isEndline(c):
            result.append(c)
            c = self.read()
        return result.decode()

def main():
    out = sys.stdout
    in_stream = FastScanner(sys.stdin)

    for t in range(1, 2):
        N = in_stream.nextInt()
        A = [in_stream.nextInt() for _ in range(N)]

        A.sort()

        res = 0

        q = []
        heapq.heappush(q, (-min(A[N - 1], A[N - 1]), A[N - 1], A[N - 1]))

        for i in range(N - 2, -1, -1):
            a = A[i]
            _, x, y = heapq.heappop(q)
            res += min(x, y)
            heapq.heappush(q, (-min(x, a), x, a))
            heapq.heappush(q, (-min(a, y), a, y))

        out.write(f"{res}\n")

if __name__ == "__main__":
    main()

