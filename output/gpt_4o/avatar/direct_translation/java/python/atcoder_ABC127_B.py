
import sys

class SimpleScanner:
    BUFFER_SIZE = 10240

    def __init__(self, stream):
        self.in_stream = stream
        self.buffer = ""
        self.eof = False

    def read(self):
        if not self.buffer:
            self.buffer = self.in_stream.read(self.BUFFER_SIZE)
            if not self.buffer:
                self.eof = True
                return '\0'
        char = self.buffer[0]
        self.buffer = self.buffer[1:]
        return char

    def check_eof(self):
        if self.eof:
            raise NoSuchElementException()

    def next_char(self):
        self.check_eof()
        char = self.read()
        self.check_eof()
        return char

    def next(self):
        while True:
            char = self.read()
            self.check_eof()
            if not char.isspace():
                break
        result = []
        while char and not char.isspace():
            result.append(char)
            char = self.read()
        return ''.join(result)

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return int(self.next())

    def next_double(self):
        return float(self.next())

class NoSuchElementException(Exception):
    pass

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

