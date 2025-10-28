
import sys
import heapq

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
        while not (c == -1 or self.is_printable_char_except_space(c)):
            c = self.read_byte()
        if c == -1:
            raise StopIteration
        b = []
        while c != -1 and self.is_printable_char_except_space(c):
            b.append(c)
            c = self.read_byte()
        return bytes(b).decode()

    def next_long(self):
        c = self.read_byte()
        while not (c == -1 or self.is_printable_char_except_space(c)):
            c = self.read_byte()
        if c == -1:
            raise StopIteration
        minus = False
        if c == ord('-'):
            minus = True
            c = self.read_byte()
        result = 0
        while c != -1 and self.is_printable_char_except_space(c):
            if c < ord('0') or c > ord('9'):
                raise ValueError
            result = result * 10 + (c - ord('0'))
            c = self.read_byte()
        return -result if minus else result

    def next_int(self):
        n = self.next_long()
        if n < -2147483648 or n > 2147483647:
            raise ValueError
        return int(n)

class MyWriter:
    def __init__(self, out_stream):
        self.out_stream = out_stream

    def println(self, message=""):
        self.out_stream.write(f"{message}\n")

    def flush(self):
        self.out_stream.flush()

def main():
    out = MyWriter(sys.stdout)
    sc = MyScanner(sys.stdin.buffer)

    N = sc.next_int()
    M = sc.next_int()
    list_ = [[] for _ in range(100001)]

    for _ in range(N):
        a = sc.next_int()
        b = sc.next_int()
        list_[a].append(b)

    res = 0
    pqueue = []
    for i in range(1, M + 1):
        for b in list_[i]:
            heapq.heappush(pqueue, -b)
        if pqueue:
            res += -heapq.heappop(pqueue)

    out.println(res)
    out.flush()

if __name__ == "__main__":
    main()

