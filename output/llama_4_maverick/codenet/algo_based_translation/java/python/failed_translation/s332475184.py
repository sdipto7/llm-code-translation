
from collections import defaultdict, deque
import sys

class FastScanner:
    def __init__(self):
        self.input_stream = sys.stdin
        self.buffer = bytearray()
        self.ptr = 0
        self.end = 0

    def _has_next_byte(self):
        if self.ptr < self.end:
            return True
        else:
            self.ptr = 0
            self.buffer = bytearray(self.input_stream.read(1024))
            self.end = len(self.buffer)
            if self.end <= 0:
                return False
            return True

    def _read_byte(self):
        if self._has_next_byte():
            byte = self.buffer[self.ptr]
            self.ptr += 1
            return byte
        else:
            return -1

    def _is_printable_char(self, c):
        return 33 <= c <= 126

    def has_next(self):
        while self._has_next_byte() and not self._is_printable_char(self.buffer[self.ptr]):
            self.ptr += 1
        return self._has_next_byte()

    def next(self):
        if not self.has_next():
            raise StopIteration
        sb = bytearray()
        byte = self._read_byte()
        while self._is_printable_char(byte):
            sb.append(byte)
            byte = self._read_byte()
        return sb.decode()

    def next_long(self):
        if not self.has_next():
            raise StopIteration
        n = 0
        minus = False
        byte = self._read_byte()
        if byte == ord('-'):
            minus = True
            byte = self._read_byte()
        if not (ord('0') <= byte <= ord('9')):
            raise ValueError
        while True:
            if ord('0') <= byte <= ord('9'):
                n = n * 10 + byte - ord('0')
            elif byte == -1 or not self._is_printable_char(byte):
                return -n if minus else n
            else:
                raise ValueError
            byte = self._read_byte()

    def next_int(self):
        nl = self.next_long()
        if not (-2**31 <= nl <= 2**31 - 1):
            raise ValueError
        return int(nl)

    def next_double(self):
        return float(self.next())

class Main:
    def __init__(self):
        self.fs = FastScanner()
        self.n = self.fs.next_int()
        self.q = self.fs.next_int()
        self.graph = [[] for _ in range(self.n)]
        self.counter = [0] * self.n

    def read_input(self):
        for _ in range(self.n - 1):
            a = self.fs.next_int() - 1
            b = self.fs.next_int() - 1
            self.graph[a].append(b)
            self.graph[b].append(a)
        for _ in range(self.q):
            x = self.fs.next_int() - 1
            y = self.fs.next_int()
            self.counter[x] += y

    def dfs(self, v, par, val):
        for i in self.graph[v]:
            if i != par:
                self.dfs(i, v, val + self.counter[v])
        self.counter[v] += val

    def solve(self):
        self.read_input()
        self.dfs(0, -1, 0)
        print(' '.join(map(str, self.counter)))

def main():
    Main().solve()

if __name__ == "__main__":
    main()

