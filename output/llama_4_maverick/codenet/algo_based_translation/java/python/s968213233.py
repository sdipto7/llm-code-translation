
import sys
import heapq

class FastScanner:
    def __init__(self, stream):
        self.stream = stream
        self.buf = bytearray()
        self.pos = 0
        self.limit = 0

    def read(self):
        if self.pos >= self.limit:
            self.limit = self.stream.readinto(self.buf)
            self.pos = 0
            if self.limit == 0:
                return b' '[0]
        self.pos += 1
        return self.buf[self.pos - 1]

    def is_space_char(self, c):
        return c in [b' '[0], b'\n'[0], b'\r'[0], b'\t'[0]]

    def is_endline(self, c):
        return c in [b'\n'[0], b'\r'[0]]

    def next_int(self):
        c = self.read()
        while self.is_space_char(c):
            c = self.read()
        sign = 1
        if c == b'-'[0]:
            sign = -1
            c = self.read()
        num = 0
        while c >= b'0'[0] and c <= b'9'[0]:
            num = num * 10 + c - b'0'[0]
            c = self.read()
        return sign * num

    def next(self):
        c = self.read()
        while self.is_space_char(c):
            c = self.read()
        res = bytearray()
        while not self.is_space_char(c):
            res.append(c)
            c = self.read()
        return res.decode()

class Main:
    def __init__(self, in_stream, out_stream, test):
        self.in_stream = in_stream
        self.out_stream = out_stream
        self.test = test
        self.N = in_stream.next_int()
        A = [in_stream.next_int() for _ in range(self.N)]
        A.sort()
        res = 0
        q = []
        heapq.heappush(q, (-min(A[-1], A[-1]), [A[-1], A[-1]]))
        for i in range(self.N - 2, -1, -1):
            _, place = heapq.heappop(q)
            res += min(place[0], place[1])
            heapq.heappush(q, (-min(place[0], A[i]), [place[0], A[i]]))
            heapq.heappush(q, (-min(A[i], place[1]), [A[i], place[1]]))
        out_stream.write(str(res) + '\n')

def main():
    in_stream = FastScanner(sys.stdin.buffer)
    out_stream = sys.stdout
    for t in range(1, 2):
        Main(in_stream, out_stream, t)
    out_stream.flush()

if __name__ == "__main__":
    main()

