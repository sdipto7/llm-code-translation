
import sys

def main():
    input_stream = sys.stdin
    output_stream = sys.stdout
    in_ = MyInput(input_stream)
    out = PrintWriter(output_stream)
    
    solver = Solver()
    solver.solve(1, in_, out)
    
    out.close()

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
        out.println(ans)

class Pair:
    def __init__(self, key, value):
        self.key = key
        self.value = value

    def getString(self):
        return f"[{self.key}] [{self.value}]"

class MyInput:
    def __init__(self, is_):
        self.in_ = is_
        self.pos = 0
        self.readLen = 0
        self.buffer = [0] * (1024 * 8)
        self.str = [0] * (500 * 8 * 2)
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
                self.readLen = self.in_.read(self.buffer)
            except:
                raise RuntimeError
            if self.readLen <= 0:
                raise EndOfFileRuntimeException
        return self.buffer[self.pos]

    def nextInt(self):
        len_ = 0
        self.str[len_] = self.nextChar()
        len_ = self.reads(len_, self.isSpace)
        i = 0
        ret = 0
        if self.str[0] == '-':
            i = 1
        for i in range(i, len_):
            ret = ret * 10 + ord(self.str[i]) - ord('0')
        if self.str[0] == '-':
            ret = -ret
        return ret

    def nextLong(self):
        len_ = 0
        self.str[len_] = self.nextChar()
        len_ = self.reads(len_, self.isSpace)
        i = 0
        ret = 0
        if self.str[0] == '-':
            i = 1
        for i in range(i, len_):
            ret = ret * 10 + ord(self.str[i]) - ord('0')
        if self.str[0] == '-':
            ret = -ret
        return ret

    def nextString(self):
        ret = ''.join(self.nextDChar()).strip()
        return ret

    def nextDChar(self):
        len_ = 0
        len_ = self.reads(len_, self.isSpace)
        ret = [0] * (len_ + 1)
        for i in range(len_):
            ret[i] = self.str[i]
        ret[len_] = '\x00'
        return ret

    def nextChar(self):
        while True:
            c = self.read()
            if not self.isSpace[c]:
                return chr(c)

    def reads(self, len_, accept):
        try:
            while True:
                c = self.read()
                if accept[c]:
                    break
                if len_ == len(self.str):
                    self.str.extend([0] * (len(self.str) * 3 // 2))
                self.str[len_] = chr(c)
                len_ += 1
        except EndOfFileRuntimeException:
            pass
        return len_

class EndOfFileRuntimeException(RuntimeError):
    pass

class PrintWriter:
    def __init__(self, out):
        self.out = out

    def println(self, *args):
        print(*args, file=self.out)

    def close(self):
        self.out.close()

if __name__ == "__main__":
    main()

