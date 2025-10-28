
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
        self.buffer = []
        self.ptr = 0

    def has_next_byte(self):
        if self.ptr < len(self.buffer):
            return True
        else:
            self.ptr = 0
            self.buffer = sys.stdin.read(1024)
            if len(self.buffer) <= 0:
                return False
        return True

    def read_byte(self):
        if self.has_next_byte():
            b = self.buffer[self.ptr]
            self.ptr += 1
            return b
        else:
            return -1

    def is_printable_char(self, c):
        return 33 <= ord(c) <= 126

    def skip_unprintable(self):
        while self.has_next_byte() and not self.is_printable_char(self.buffer[self.ptr]):
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
            sb.append(b)
            b = self.read_byte()
        return ''.join(sb)

    def next_long(self):
        if not self.has_next():
            raise NoSuchElementException()
        n = 0
        minus = False
        b = self.read_byte()
        if b == '-':
            minus = True
            b = self.read_byte()
        if not '0' <= b <= '9':
            raise NumberFormatException()
        while True:
            if '0' <= b <= '9':
                n *= 10
                n += ord(b) - ord('0')
            elif b == -1 or not self.is_printable_char(b):
                return -n if minus else n
            else:
                raise NumberFormatException()
            b = self.read_byte()

    def next_int(self):
        nl = self.next_long()
        if nl < -2147483648 or nl > 2147483647:
            raise NumberFormatException()
        return int(nl)

    def next_double(self):
        return float(self.next())

if __name__ == "__main__":
    Main().run()

