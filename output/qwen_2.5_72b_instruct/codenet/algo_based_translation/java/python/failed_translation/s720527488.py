
import sys
import random

class Main:
    @staticmethod
    def main():
        in_ = sys.stdin
        out = sys.stdout
        INF = (1 << 31) - 1
        LINF = (1 << 63) - 1
        ir = Main.InputReader(in_)
        m = ir.nextInt()
        n = ir.nextInt()
        manju = ir.toIntArray(m)
        boxlen = [0] * n
        boxcost = [0] * n
        for i in range(n):
            boxlen[i] = ir.nextInt()
            boxcost[i] = ir.nextInt()
        Main.sort(manju)
        dp = [[0] * (n + 1) for _ in range(m + 1)]
        for i in range(m - 1, -1, -1):
            for j in range(n - 1, -1, -1):
                len_ = i + boxlen[j] if i + boxlen[j] < m else m
                cnt = 0
                for k in range(i, len_):
                    cnt += manju[m - 1 - k]
                dp[i][j] = max(dp[i][j], dp[len_][j + 1] + cnt - boxcost[j])
                dp[i][j] = max(dp[i][j], dp[i][j + 1])
        out.write(f"{dp[0][0]}\n")
        out.flush()

    @staticmethod
    def sort(a):
        for i in range(len(a) - 1, 0, -1):
            t = random.randint(0, i)
            temp = a[i]
            a[i] = a[t]
            a[t] = temp
        a.sort()

    class InputReader:
        def __init__(self, in_):
            self.in_ = in_
            self.buffer = bytearray()
            self.curbuf = 0
            self.lenbuf = 0

        def readByte(self):
            if self.lenbuf == -1:
                raise Exception("InputMismatchException")
            if self.curbuf >= self.lenbuf:
                self.curbuf = 0
                self.lenbuf = self.in_.readinto(self.buffer)
                if self.lenbuf <= 0:
                    return -1
            result = self.buffer[self.curbuf]
            self.curbuf += 1
            return result

        def isSpaceChar(self, c):
            return not (33 <= c <= 126)

        def skip(self):
            b = self.readByte()
            while b != -1 and self.isSpaceChar(b):
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
            c = self.skip()
            minus = False
            if c == ord('-'):
                minus = True
                c = self.readByte()
            res = 0
            while not self.isSpaceChar(c):
                if c < ord('0') or c > ord('9'):
                    raise Exception("InputMismatchException")
                res = res * 10 + c - ord('0')
                c = self.readByte()
            return -res if minus else res

        def nextLong(self):
            c = self.skip()
            minus = False
            if c == ord('-'):
                minus = True
                c = self.readByte()
            res = 0
            while not self.isSpaceChar(c):
                if c < ord('0') or c > ord('9'):
                    raise Exception("InputMismatchException")
                res = res * 10 + c - ord('0')
                c = self.readByte()
            return -res if minus else res

        def toIntArray(self, n):
            a = [0] * n
            for i in range(n):
                a[i] = self.nextInt()
            return a

if __name__ == "__main__":
    Main.main()

