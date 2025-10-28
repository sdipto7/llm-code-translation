
import sys
import heapq

class FastScanner:
    def __init__(self, stream):
        self.stream = stream
        self.buf = []
        self.cur_char = 0

    def _read(self):
        if len(self.buf) == 0:
            self.buf = list(sys.stdin.read())
        if len(self.buf) == 0:
            return -1
        self.cur_char = 0
        return self.buf.pop(0)

    def _is_space_char(self, c):
        return c == ' ' or c == '\n' or c == '\r' or c == '\t' or c == -1

    def _is_endline(self, c):
        return c == '\n' or c == '\r' or c == -1

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return int(self.next())

    def next_double(self):
        return float(self.next())

    def next(self):
        c = self._read()
        while self._is_space_char(c):
            c = self._read()
        res = []
        while not self._is_space_char(c):
            res.append(chr(c))
            c = self._read()
        return ''.join(res)

    def next_line(self):
        c = self._read()
        while self._is_endline(c):
            c = self._read()
        res = []
        while not self._is_endline(c):
            res.append(chr(c))
            c = self._read()
        return ''.join(res)

class Main:
    def __init__(self, in_scanner, out_writer, test):
        N = in_scanner.next_int()
        A = [in_scanner.next_int() for _ in range(N)]
        A.sort()

        res = 0

        q = []
        heapq.heappush(q, (-A[N - 1], -A[N - 1]))

        for i in range(N - 2, -1, -1):
            a = A[i]
            place = heapq.heappop(q)
            res += -min(place[0], place[1])
            heapq.heappush(q, (place[0], -a))
            heapq.heappush(q, (-a, place[1]))

        out_writer.write(f"{res}\n")

def main():
    in_scanner = FastScanner(sys.stdin)
    out_writer = sys.stdout
    for t in range(1, 2):
        main_instance = Main(in_scanner, out_writer, t)

if __name__ == "__main__":
    main()

