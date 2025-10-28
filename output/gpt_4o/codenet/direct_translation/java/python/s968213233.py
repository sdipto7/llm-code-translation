
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
            raise ValueError("InputMismatchException")
        if self.curChar >= self.numChars:
            self.curChar = 0
            try:
                self.numChars = self.stream.readinto(self.buf)
            except IOError:
                raise ValueError("InputMismatchException")
            if self.numChars <= 0:
                return -1
        result = self.buf[self.curChar]
        self.curChar += 1
        return result

    def isSpaceChar(self, c):
        return c in (b' ', b'\n', b'\r', b'\t', -1)

    def isEndline(self, c):
        return c in (b'\n', b'\r', -1)

    def next(self):
        c = self.read()
        while self.isSpaceChar(c):
            c = self.read()
        res = bytearray()
        while not self.isSpaceChar(c):
            res.append(c)
            c = self.read()
        return res.decode()

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return int(self.next())

    def nextDouble(self):
        return float(self.next())

    def nextLine(self):
        c = self.read()
        while self.isEndline(c):
            c = self.read()
        res = bytearray()
        while not self.isEndline(c):
            res.append(c)
            c = self.read()
        return res.decode()

def main():
    out = sys.stdout
    in_ = FastScanner(sys.stdin)
    N = in_.nextInt()
    A = [in_.nextInt() for _ in range(N)]
    A.sort()

    res = 0
    q = []
    heapq.heappush(q, (-A[N - 1], -A[N - 1]))

    for i in range(N - 2, -1, -1):
        a = A[i]
        place = heapq.heappop(q)
        res += -min(place[0], place[1])
        heapq.heappush(q, (place[0], -a))
        heapq.heappush(q, (-a, place[1]))
    
    print(res)

if __name__ == "__main__":
    main()

