
import sys
import heapq
from collections import defaultdict

class MyScanner:
    def __init__(self, stream):
        self.stream = stream
        self.buffer = bytearray()
        self.index = 0

    def read_byte(self):
        if self.index >= len(self.buffer):
            self.buffer = bytearray(self.stream.read(8192))
            self.index = 0
            if not self.buffer:
                return -1
        byte = self.buffer[self.index]
        self.index += 1
        return byte

    def is_printable_char_except_space(self, c):
        return 33 <= c <= 126

    def next(self):
        c = self.read_byte()
        while c != -1 and not self.is_printable_char_except_space(c):
            c = self.read_byte()
        if c == -1:
            raise StopIteration
        result = bytearray()
        while c != -1 and self.is_printable_char_except_space(c):
            result.append(c)
            c = self.read_byte()
        return result.decode('utf-8')

    def next_int(self):
        return int(self.next())

    def next_double(self):
        return float(self.next())

    def next_int_array(self, n):
        return [self.next_int() for _ in range(n)]

class MyWriter:
    def __init__(self, stream):
        self.stream = stream

    def println(self, s):
        self.stream.write(str(s) + '\n')

    def flush(self):
        self.stream.flush()

def main():
    sc = MyScanner(sys.stdin)
    out = MyWriter(sys.stdout)

    N = sc.next_int()
    M = sc.next_int()

    list_dict = defaultdict(list)
    for _ in range(N):
        a = sc.next_int()
        b = sc.next_int()
        list_dict[a].append(b)

    res = 0
    pqueue = []
    for i in range(1, M + 1):
        if i in list_dict:
            for num in list_dict[i]:
                heapq.heappush(pqueue, -num)
        if pqueue:
            res += -heapq.heappop(pqueue)

    out.println(res)
    out.flush()

if __name__ == "__main__":
    main()

