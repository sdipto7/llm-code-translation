
import sys
import math
from typing import Optional, List, Set

class Main:
    def solve(self):
        sc = self.Scanner(sys.stdin)
        H = sc.nextInt()
        W = sc.nextInt()
        c = [[sc.nextInt() for _ in range(10)] for _ in range(10)]
        
        min_cost = [c[i][1] for i in range(10)]

        for _ in range(10):
            for i in range(10):
                for j in range(10):
                    min_cost[i] = min(min_cost[i], c[i][j] + min_cost[j])

        ans = 0
        for _ in range(H):
            for _ in range(W):
                A = sc.nextInt()
                if A >= 0:
                    ans += min_cost[A]

        print(ans)

    class Scanner:
        def __init__(self, in_stream):
            self.in_stream = in_stream
            self.buffer = bytearray()
            self.index = 0
            self.length = 0

        def isPrintableChar(self, c):
            return '!' <= c <= '~'

        def isDigit(self, c):
            return '0' <= c <= '9'

        def hasNextByte(self):
            if self.index < self.length:
                return True
            else:
                self.buffer = self.in_stream.read(1024)
                self.length = len(self.buffer)
                self.index = 0
                return self.length > 0

        def hasNext(self):
            while self.hasNextByte() and not self.isPrintableChar(chr(self.buffer[self.index])):
                self.index += 1
            return self.hasNextByte()

        def readByte(self):
            return self.buffer[self.index] if self.hasNextByte() else -1

        def next(self):
            if not self.hasNext():
                raise RuntimeError("no input")
            sb = []
            b = self.readByte()
            while self.isPrintableChar(chr(b)):
                sb.append(chr(b))
                self.index += 1
                b = self.readByte()
            return ''.join(sb)

        def nextLong(self):
            if not self.hasNext():
                raise RuntimeError("no input")
            value = 0
            minus = False
            b = self.readByte()
            if chr(b) == '-':
                minus = True
                self.index += 1
                b = self.readByte()
            while self.isPrintableChar(chr(b)):
                if self.isDigit(chr(b)):
                    value = value * 10 + (b - ord('0'))
                self.index += 1
                b = self.readByte()
            return -value if minus else value

        def nextInt(self):
            return int(self.nextLong())

        def nextDouble(self):
            return float(self.next())

if __name__ == "__main__":
    main = Main()
    main.solve()

