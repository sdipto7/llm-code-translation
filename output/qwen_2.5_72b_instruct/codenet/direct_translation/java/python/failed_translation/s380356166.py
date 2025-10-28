
import sys

class Solver:
    def solve(self, testNumber, in_, out):
        ans = 0
        K = in_.nextInt()
        S = in_.nextInt()
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
        self.str = bytearray(500 * 8 * 2)
        self.isDigit = [False] * 256
        self.isSpace = [False] * 256
        self.isLineSep = [False] * 256
        for i in range(10):
            self.isDigit[ord('0') + i] = True
        self.isDigit[ord('-')] = True
        self.isSpace[ord(' ')] = self.isSpace[ord('\r')] = self.isSpace[ord('\n')] = self.isSpace[ord('\t')] = True
        self.isLineSep[ord('\r')] = self.isLineSep[ord('\n')] = True

    def read(self):
        if self.pos >= self.readLen:
            self.pos = 0
            try:
                self.readLen = self.in_.readinto(self.buffer)
            except IOError:
                raise RuntimeError()
            if self.readLen <= 0:
                raise MyInput.EndOfFileRuntimeException()
        result = self.buffer[self.pos]
        self.pos += 1
        return result

    def nextInt(self):
        len_ = 0
        self.str[len_] = self.nextChar()
        len_ = self.reads(len_, self.isSpace)
        i = 0
        ret = 0
        if self.str[0] == ord('-'):
            i = 1
        for j in range(i, len_):
            ret = ret * 10 + self.str[j] - ord('0')
        if self.str[0] == ord('-'):
            ret = -ret
        return ret

    def nextLong(self):
        len_ = 0
        self.str[len_] = self.nextChar()
        len_ = self.reads(len_, self.isSpace)
        i = 0
        ret = 0
        if self.str[0] == ord('-'):
            i = 1
        for j in range(i, len_):
            ret = ret * 10 + self.str[j] - ord('0')
        if self.str[0] == ord('-'):
            ret = -ret
        return ret

    def nextString(self):
        ret = self.nextDChar().decode().strip()
        return ret

    def nextDChar(self):
        len_ = 0
        len_ = self.reads(len_, self.isSpace)
        ret = bytearray(len_ + 1)
        for i in range(len_):
            ret[i] = self.str[i]
        ret[len_] = 0x00
        return ret

    def nextChar(self):
        while True:
            c = self.read()
            if not self.isSpace[c]:
                return c

    def reads(self, len_, accept):
        try:
            while True:
                c = self.read()
                if accept[c]:
                    break
                if len(self.str) == len_:
                    rep = bytearray(len(self.str) * 3 // 2)
                    rep[:len(self.str)] = self.str
                    self.str = rep
                self.str[len_] = c
                len_ += 1
        except MyInput.EndOfFileRuntimeException:
            pass
        return len_

    class EndOfFileRuntimeException(RuntimeError):
        pass

def main():
    input_stream = sys.stdin.buffer
    output_stream = sys.stdout
    in_ = MyInput(input_stream)
    out = output_stream
    solver = Solver()
    solver.solve(1, in_, out)

if __name__ == "__main__":
    main()

