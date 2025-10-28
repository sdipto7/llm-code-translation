
import sys
from collections import deque

class SimpleScanner:
    BUFFER_SIZE = 10240

    def __init__(self, input_stream):
        self.in_stream = input_stream
        self.buffer = deque()
        self.eof = False

    def read(self):
        if not self.buffer:
            data = self.in_stream.read(SimpleScanner.BUFFER_SIZE)
            if not data:
                self.eof = True
                return '\0'
            self.buffer.extend(data)
        return self.buffer.popleft()

    def check_eof(self):
        if self.eof:
            raise NoSuchElementException()

    def next_char(self):
        self.check_eof()
        b = self.read()
        self.check_eof()
        return b

    def next(self):
        b = self.read()
        while b.isspace():
            b = self.read()
            self.check_eof()
        sb = []
        while not self.eof and not b.isspace():
            sb.append(b)
            b = self.read()
        return ''.join(sb)

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return int(self.next())

    def next_double(self):
        return float(self.next())

def main():
    scanner = SimpleScanner(sys.stdin)
    r = scanner.next_int()
    d = scanner.next_int()
    x = scanner.next_long()
    
    for _ in range(10):
        x = r * x - d
        print(x)

if __name__ == "__main__":
    main()

