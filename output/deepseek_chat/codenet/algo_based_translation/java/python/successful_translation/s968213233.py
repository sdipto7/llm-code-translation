
import sys
import heapq
from io import BytesIO

class FastScanner:
    def __init__(self, stream):
        self.stream = stream
        self.buf = bytearray(1024)
        self.cur_char = 0
        self.num_chars = 0
    
    def read(self):
        if self.num_chars == -1:
            raise EOFError()
        if self.cur_char >= self.num_chars:
            self.cur_char = 0
            try:
                self.num_chars = self.stream.readinto(self.buf)
            except:
                raise EOFError()
            if self.num_chars <= 0:
                return -1
        ch = self.buf[self.cur_char]
        self.cur_char += 1
        return ch
    
    def is_space_char(self, c):
        return c == 32 or c == 10 or c == 13 or c == 9 or c == -1
    
    def is_endline(self, c):
        return c == 10 or c == 13 or c == -1
    
    def next_int(self):
        return int(self.next())
    
    def next_long(self):
        return int(self.next())
    
    def next_double(self):
        return float(self.next())
    
    def next(self):
        c = self.read()
        while self.is_space_char(c):
            c = self.read()
        res = []
        while True:
            res.append(chr(c))
            c = self.read()
            if self.is_space_char(c):
                break
        return ''.join(res)
    
    def next_line(self):
        c = self.read()
        while self.is_endline(c):
            c = self.read()
        res = []
        while True:
            res.append(chr(c))
            c = self.read()
            if self.is_endline(c):
                break
        return ''.join(res)

def main():
    in_scanner = FastScanner(sys.stdin.buffer)
    out = sys.stdout
    
    N = in_scanner.next_int()
    A = [0] * N
    for i in range(N):
        A[i] = in_scanner.next_int()
    A.sort()
    
    res = 0
    q = []
    heapq.heappush(q, (-min(A[-1], A[-1]), [A[-1], A[-1]]))
    
    for i in range(N-2, -1, -1):
        a = A[i]
        _, place = heapq.heappop(q)
        res += min(place[0], place[1])
        heapq.heappush(q, (-min(place[0], a), [place[0], a]))
        heapq.heappush(q, (-min(a, place[1]), [a, place[1]]))
    
    out.write(str(res) + '\n')
    out.flush()

if __name__ == '__main__':
    main()

