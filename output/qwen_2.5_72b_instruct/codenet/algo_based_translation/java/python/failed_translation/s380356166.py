
import sys

class Solver:
    def solve(self, testNumber, in_, out):
        ans = 0
        K = in_.nextInt()
        S = in_.nextInt()
        wk = 0
        for x in range(K + 1):
            for y in range(K + 1):
                wk = S - x - y
                if 0 <= wk <= K:
                    ans += 1
        out.write(f"{ans}\n")

class MyInput:
    def __init__(self, is_):
        self.in_ = is_
        self.pos = 0
        self.readLen = 0
        self.buffer = bytearray(1024 * 8)
        self.str = bytearray()
        self.isDigit = {chr(i): True for i in range(48, 58)}
        self.isDigit['-'] = True
        self.isSpace = {chr(i): True for i in [32, 13, 10, 9]}
        self.isLineSep = {chr(i): True for i in [13, 10]}

    def read(self):
        if self.pos >= self.readLen:
            self.pos = 0
            self.readLen = self.in_.readinto(self.buffer)
            if self.readLen <= 0:
                raise EOFError
        ret = self.buffer[self.pos]
        self.pos += 1
        return ret

    def nextInt(self):
        len_ = 0
        self.str.clear()
        self.str.append(self.nextChar())
        len_ = self.reads(len_, self.isSpace)
        i = 0
        ret = 0
        if self.str[0] == ord('-'):
            i = 1
        for i in range(i, len_):
            ret = ret * 10 + self.str[i] - ord('0')
        if self.str[0] == ord('-'):
            ret = -ret
        return ret

    def nextLong(self):
        len_ = 0
        self.str.clear()
        self.str.append(self.nextChar())
        len_ = self.reads(len_, self.isSpace)
        i = 0
        ret = 0
        if self.str[0] == ord('-'):
            i = 1
        for i in range(i, len_):
            ret = ret * 10 + self.str[i] - ord('0')
        if self.str[0] == ord('-'):
            ret = -ret
        return ret

    def nextString(self):
        b = self.nextDChar()
        ret = b.decode().strip()
        return ret

    def nextDChar(self):
        len_ = 0
        len_ = self.reads(len_, self.isSpace)
        ret = bytearray(len_ + 1)
        for i in range(len_):
            ret[i] = self.str[i]
        ret[len_] = 0
        return ret

    def nextChar(self):
        while True:
            c = self.read()
            if c not in self.isSpace:
                return c

    def reads(self, len_, accept):
        while True:
            c = self.read()
            if c in accept:
                break
            if len(self.str) == len_:
                self.str.extend(bytearray(len(self.str) * 3 // 2))
            self.str[len_] = c
            len_ += 1
        return len_

def main():
    inputStream = sys.stdin.buffer
    outputStream = sys.stdout.buffer
    in_ = MyInput(inputStream)
    out = outputStream
    solver = Solver()
    solver.solve(1, in_, out)

if __name__ == "__main__":
    main()

