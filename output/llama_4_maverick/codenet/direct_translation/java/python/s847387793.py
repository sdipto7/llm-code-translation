
import sys

class FastScanner:
    def __init__(self):
        self.input_stream = sys.stdin
        self.buffer = bytearray(1024)
        self.ptr = 0
        self.buflen = 0

    def has_next_byte(self):
        if self.ptr < self.buflen:
            return True
        else:
            self.ptr = 0
            try:
                self.buflen = self.input_stream.readinto(self.buffer)
            except IOError:
                pass
            if self.buflen <= 0:
                return False
        return True

    def read_byte(self):
        if self.has_next_byte():
            return self.buffer[self.ptr]
        else:
            return -1

    def is_printable_char(self, c):
        return 33 <= c <= 126

    def has_next(self):
        while self.has_next_byte() and not self.is_printable_char(self.buffer[self.ptr]):
            self.ptr += 1
        return self.has_next_byte()

    def next(self):
        if not self.has_next():
            raise StopIteration
        sb = bytearray()
        b = self.read_byte()
        self.ptr += 1
        while self.is_printable_char(b):
            sb.append(b)
            b = self.read_byte()
            self.ptr += 1
        return sb.decode()

    def next_long(self):
        if not self.has_next():
            raise StopIteration
        n = 0
        minus = False
        b = self.read_byte()
        self.ptr += 1
        if b == ord('-'):
            minus = True
            b = self.read_byte()
            self.ptr += 1
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
            self.ptr += 1

    def next_int(self):
        nl = self.next_long()
        if nl < -2**31 or nl > 2**31 - 1:
            raise ValueError
        return int(nl)

    def next_double(self):
        return float(self.next())

    def next_int_array(self, n):
        a = [0] * n
        for i in range(n):
            a[i] = self.next_int()
        return a


class Solver:
    def __init__(self, sc):
        self.sc = sc
        self.writer = sys.stdout

    def run(self):
        n = self.sc.next_int()
        m = self.sc.next_int()
        q = self.sc.next_int()
        a = [0] * q
        b = [0] * q
        c = [0] * q
        d = [0] * q
        for i in range(q):
            a[i] = self.sc.next_int()
            b[i] = self.sc.next_int()
            c[i] = self.sc.next_int()
            d[i] = self.sc.next_int()
        max_score = self.dfs([1], n, m, a, b, c, d)
        self.writer.write(str(max_score) + '\n')

    def dfs(self, array, n, m, a, b, c, d):
        if len(array) > n:
            score = 0
            for i in range(len(a)):
                if array[b[i] - 1] - array[a[i] - 1] == c[i]:
                    score += d[i]
            return score
        new_array = array + [array[-1]]
        max_score = 0
        while new_array[-1] <= m:
            max_score = max(max_score, self.dfs(new_array, n, m, a, b, c, d))
            new_array[-1] += 1
        return max_score


def main():
    sc = FastScanner()
    Solver(sc).run()


if __name__ == "__main__":
    main()

