
import sys

class MyInput:
    def __init__(self):
        self.buffer = sys.stdin.read().encode()
        self.ptr = 0
        self.buflen = len(self.buffer)

    def has_next_byte(self):
        if self.ptr < self.buflen:
            return True
        else:
            return False

    def read_byte(self):
        if self.has_next_byte():
            byte = self.buffer[self.ptr]
            self.ptr += 1
            return byte
        else:
            return -1

    @staticmethod
    def is_printable_char(c):
        return 33 <= c <= 126

    def skip_unprintable(self):
        while self.has_next_byte() and not self.is_printable_char(self.buffer[self.ptr]):
            self.ptr += 1

    def has_next(self):
        self.skip_unprintable()
        return self.has_next_byte()

    def next(self):
        if not self.has_next():
            raise StopIteration
        sb = bytearray()
        b = self.read_byte()
        while self.is_printable_char(b):
            sb.append(b)
            b = self.read_byte()
        return sb.decode()

    def next_long(self):
        if not self.has_next():
            raise StopIteration
        n = 0
        minus = False
        b = self.read_byte()
        if b == ord('-'):
            minus = True
            b = self.read_byte()
        if b < ord('0') or ord('9') < b:
            raise ValueError
        while True:
            if ord('0') <= b <= ord('9'):
                n *= 10
                n += b - ord('0')
            elif b == -1 or not self.is_printable_char(b):
                return -n if minus else n
            else:
                raise ValueError
            b = self.read_byte()

    def next_int(self):
        nl = self.next_long()
        if nl < -2**31 or nl > 2**31 - 1:
            raise ValueError
        return int(nl)

    def next_double(self):
        return float(self.next())


class Main:
    def __init__(self):
        self.in_ = MyInput()

    def run(self):
        sd = self.in_.next()
        t = self.in_.next()
        count = 0
        ok = False
        first = -1
        end = -1
        for j in range(len(sd)):
            count = 0
            for i in range(len(sd) - j):
                c = sd[i + j]
                if c == '?' or c == t[count]:
                    count += 1
                    if count == len(t):
                        first = i + j - len(t) + 1
                        end = i + j
                        ok = True
                        break
                else:
                    count = 0
        if ok:
            result = ''
            for i in range(len(sd)):
                if first <= i <= end:
                    result += t[i - first]
                else:
                    if sd[i] == '?':
                        result += 'a'
                    else:
                        result += sd[i]
            print(result)
        else:
            print('UNRESTORABLE')

    def main(self):
        self.run()


if __name__ == '__main__':
    Main().main()

