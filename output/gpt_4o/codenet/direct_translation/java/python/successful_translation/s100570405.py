
import sys

class Main:
    def __init__(self):
        self.inp = MyInput()

    def run(self):
        Sd = self.inp.next()
        T = self.inp.next()
        count = 0
        ok = False
        first = -1
        end = -1
        for j in range(len(Sd)):
            count = 0
            for i in range(len(Sd) - j):
                c = Sd[i+j]
                if c == '?' or c == T[count]:
                    count += 1
                    if count == len(T):
                        first = i + j - len(T) + 1
                        end = i + j
                        ok = True
                        break
                else:
                    count = 0
        if ok:
            for i in range(len(Sd)):
                if first <= i <= end:
                    print(T[i - first], end='')
                else:
                    if Sd[i] == '?':
                        print('a', end='')
                    else:
                        print(Sd[i], end='')
            print()
        else:
            print("UNRESTORABLE")

class MyInput:
    def __init__(self):
        self.buffer = sys.stdin.read().encode()
        self.ptr = 0
        self.buflen = len(self.buffer)

    def hasNextByte(self):
        return self.ptr < self.buflen

    def readByte(self):
        if self.hasNextByte():
            byte = self.buffer[self.ptr]
            self.ptr += 1
            return byte
        else:
            return -1

    def isPrintableChar(self, c):
        return 33 <= c <= 126

    def skipUnprintable(self):
        while self.hasNextByte() and not self.isPrintableChar(self.buffer[self.ptr]):
            self.ptr += 1

    def hasNext(self):
        self.skipUnprintable()
        return self.hasNextByte()

    def next(self):
        if not self.hasNext():
            raise NoSuchElementException()
        sb = []
        b = self.readByte()
        while self.isPrintableChar(b):
            sb.append(chr(b))
            b = self.readByte()
        return ''.join(sb)

    def nextLong(self):
        if not self.hasNext():
            raise NoSuchElementException()
        n = 0
        minus = False
        b = self.readByte()
        if b == ord('-'):
            minus = True
            b = self.readByte()
        if b < ord('0') or ord('9') < b:
            raise NumberFormatException()
        while True:
            if ord('0') <= b <= ord('9'):
                n = n * 10 + (b - ord('0'))
            elif b == -1 or not self.isPrintableChar(b):
                return -n if minus else n
            else:
                raise NumberFormatException()
            b = self.readByte()

    def nextInt(self):
        nl = self.nextLong()
        if nl < -2147483648 or nl > 2147483647:
            raise NumberFormatException()
        return int(nl)

    def nextDouble(self):
        return float(self.next())

if __name__ == "__main__":
    main = Main()
    main.run()

