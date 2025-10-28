
import sys
from collections import defaultdict

class FastScanner:
    def __init__(self):
        self.input_stream = sys.stdin
        self.buffer = bytearray()
        self.index = 0

    def has_next_byte(self):
        if self.index >= len(self.buffer):
            self.buffer = bytearray(self.input_stream.read(1024))
            self.index = 0
            return len(self.buffer) > 0
        return True

    def read_byte(self):
        if self.has_next_byte():
            byte = self.buffer[self.index]
            self.index += 1
            return byte
        return -1

    @staticmethod
    def is_printable_char(c):
        return 33 <= c <= 126

    def has_next(self):
        while self.has_next_byte() and not self.is_printable_char(self.buffer[self.index]):
            self.index += 1
        return self.has_next_byte()

    def next(self):
        if not self.has_next():
            raise StopIteration
        result = bytearray()
        while self.has_next_byte():
            byte = self.read_byte()
            if not self.is_printable_char(byte):
                break
            result.append(byte)
        return result.decode()

    def next_int(self):
        if not self.has_next():
            raise StopIteration
        result = 0
        sign = 1
        byte = self.read_byte()
        if byte == ord('-'):
            sign = -1
            byte = self.read_byte()
        if byte < ord('0') or byte > ord('9'):
            raise ValueError
        while True:
            if ord('0') <= byte <= ord('9'):
                result = result * 10 + byte - ord('0')
            elif byte == -1 or not self.is_printable_char(byte):
                return sign * result
            else:
                raise ValueError
            if self.has_next_byte():
                byte = self.read_byte()
            else:
                byte = -1

class Main:
    def __init__(self):
        self.sc = FastScanner()

    def solve(self):
        n = self.sc.next_int()
        m = self.sc.next_int()
        constraints = defaultdict(int)
        for _ in range(m):
            s = self.sc.next_int()
            c = self.sc.next_int()
            if s in constraints and constraints[s] != c:
                print(-1)
                return
            constraints[s] = c
        for i in range(1000):
            s = str(i)
            if len(s) < n:
                continue
            valid = True
            for j in range(n):
                if (j + 1) in constraints and int(s[j]) != constraints[j + 1]:
                    valid = False
                    break
                if (j + 1) not in constraints and j == 0 and int(s[j]) == 0:
                    valid = False
                    break
                if (j + 1) not in constraints and j != 0 and int(s[j]) != 0:
                    valid = False
                    break
            if valid and len(s) == n:
                print(s)
                return
        print(-1)

if __name__ == "__main__":
    Main().solve()

