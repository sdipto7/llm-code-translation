
import sys

class MyInput:
    def __init__(self):
        self.buffer = sys.stdin.read()
        self.ptr = 0
        self.buflen = len(self.buffer)

    def has_next_byte(self):
        return self.ptr < self.buflen

    def read_byte(self):
        if self.has_next_byte():
            byte = self.buffer[self.ptr]
            self.ptr += 1
            return ord(byte)
        else:
            return -1

    @staticmethod
    def is_printable_char(c):
        return 33 <= c <= 126

    def skip_unprintable(self):
        while self.has_next_byte() and not self.is_printable_char(ord(self.buffer[self.ptr])):
            self.ptr += 1

    def has_next(self):
        self.skip_unprintable()
        return self.has_next_byte()

    def next(self):
        if not self.has_next():
            raise NoSuchElementException()
        sb = []
        b = self.read_byte()
        while self.is_printable_char(b):
            sb.append(chr(b))
            b = self.read_byte()
        return ''.join(sb)

    def next_long(self):
        if not self.has_next():
            raise NoSuchElementException()
        n = 0
        minus = False
        b = self.read_byte()
        if b == ord('-'):
            minus = True
            b = self.read_byte()
        if b < ord('0') or ord('9') < b:
            raise NumberFormatException()
        while True:
            if ord('0') <= b <= ord('9'):
                n *= 10
                n += b - ord('0')
            elif b == -1 or not self.is_printable_char(b):
                return -n if minus else n
            else:
                raise NumberFormatException()
            b = self.read_byte()

    def next_int(self):
        nl = self.next_long()
        if nl < -2**31 or nl > 2**31 - 1:
            raise NumberFormatException()
        return int(nl)

    def next_double(self):
        return float(self.next())

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
                c = Sd[i + j]
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
            result = []
            for i in range(len(Sd)):
                if first <= i <= end:
                    result.append(T[i - first])
                else:
                    if Sd[i] == '?':
                        result.append('a')
                    else:
                        result.append(Sd[i])
            print(''.join(result))
        else:
            print("UNRESTORABLE")

if __name__ == "__main__":
    Main().run()

