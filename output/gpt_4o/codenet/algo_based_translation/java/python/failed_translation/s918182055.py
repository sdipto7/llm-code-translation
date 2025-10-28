
import sys
import io
from collections import defaultdict, deque
from queue import PriorityQueue

class MyScanner:
    BUFFER_SIZE = 8192

    def __init__(self, in_stream):
        self.in_stream = in_stream
        self.buffer = bytearray(self.BUFFER_SIZE)
        self.point = 0
        self.read_length = 0

    def read_byte(self):
        if self.point < self.read_length:
            result = self.buffer[self.point]
            self.point += 1
            return result
        self.read_length = self.in_stream.readinto(self.buffer)
        if self.read_length == -1:
            return -1
        self.point = 1
        return self.buffer[0]

    @staticmethod
    def is_printable_char_except_space(c):
        return 33 <= c <= 126

    def next(self):
        c = self.read_byte()
        while c != -1 and not self.is_printable_char_except_space(c):
            c = self.read_byte()
        if c == -1:
            raise StopIteration
        b = []
        while c != -1 and self.is_printable_char_except_space(c):
            b.append(chr(c))
            c = self.read_byte()
        return ''.join(b)

    def next_long(self):
        c = self.read_byte()
        while c != -1 and not self.is_printable_char_except_space(c):
            c = self.read_byte()
        if c == -1:
            raise StopIteration
        minus = False
        if c == ord('-'):
            minus = True
            c = self.read_byte()
        result = 0
        while c != -1 and self.is_printable_char_except_space(c):
            if not (ord('0') <= c <= ord('9')):
                raise ValueError
            result = result * 10 + (c - ord('0'))
            c = self.read_byte()
        return -result if minus else result

    def next_int(self):
        n = self.next_long()
        if n < -2147483648 or n > 2147483647:
            raise ValueError
        return int(n)

    def next_double(self):
        return float(self.next())

    def next_int_array(self, n):
        return [self.next_int() for _ in range(n)]

    def next_vertical_int_arrays(self, a, b, *c):
        if not self.all_same_length(a, b, *c):
            raise ValueError
        for i in range(len(a)):
            a[i] = self.next_int()
            b[i] = self.next_int()
            for d in c:
                d[i] = self.next_int()

    @staticmethod
    def all_same_length(a, b, *c):
        if len(a) != len(b):
            return False
        for element in c:
            if len(a) != len(element):
                return False
        return True

    def next_long_array(self, n):
        return [self.next_long() for _ in range(n)]

    def next_char(self):
        c = self.read_byte()
        while c != -1 and not self.is_printable_char_except_space(c):
            c = self.read_byte()
        if c == -1:
            raise StopIteration
        return chr(c)

    def next_char_array(self, n):
        return [self.next_char() for _ in range(n)]

    def next_2d_char_array(self, n, m):
        return [[self.next_char() for _ in range(m)] for _ in range(n)]

    def next_vertical_char_arrays(self, a, b, *c):
        if not self.all_same_length(a, b, *c):
            raise ValueError
        for i in range(len(a)):
            a[i] = self.next_char()
            b[i] = self.next_char()
            for d in c:
                d[i] = self.next_char()


class MyWriter(io.TextIOWrapper):
    def __init__(self, out_stream):
        super().__init__(out_stream, write_through=True)

    def join_and_println(self, x, delimiter=' '):
        self.write(delimiter.join(map(str, x)) + '\n')


def main():
    out = MyWriter(sys.stdout)
    sc = MyScanner(sys.stdin)

    N = sc.next_int()
    M = sc.next_int()
    list_ = defaultdict(deque)

    for _ in range(N):
        a = sc.next_int()
        b = sc.next_int()
        list_[a].append(b)

    res = 0
    pqueue = PriorityQueue()
    
    for i in range(1, M + 1):
        if i in list_:
            for value in list_[i]:
                pqueue.put(-value)
        if not pqueue.empty():
            res -= pqueue.get()

    out.write(f"{res}\n")
    out.flush()

if __name__ == "__main__":
    main()

