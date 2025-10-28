
import sys

class SimpleScanner:
    def __init__(self, stream):
        self.reader = stream
        self.buffer = ""
        self.eof = False

    def read(self):
        if not self.buffer:
            try:
                self.buffer = self.reader.readline()
                if not self.buffer:
                    self.eof = True
                    return '\0'
            except:
                self.eof = True
                return '\0'
        char = self.buffer[0]
        self.buffer = self.buffer[1:]
        return char

    def check_eof(self):
        if self.eof:
            raise EOFError()

    def next_char(self):
        self.check_eof()
        char = self.read()
        self.check_eof()
        return char

    def next(self):
        char = self.read()
        while char.isspace():
            char = self.read()
            self.check_eof()
        result = []
        while not self.eof and not char.isspace():
            result.append(char)
            char = self.read()
        return ''.join(result)

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return int(self.next())

    def next_double(self):
        return float(self.next())

def main():
    scanner = SimpleScanner(sys.stdin)
    writer = sys.stdout
    r = scanner.next_int()
    d = scanner.next_int()
    x = scanner.next_long()
    for _ in range(10):
        x = r * x - d
        writer.write(str(x) + '\n')

if __name__ == "__main__":
    main()

