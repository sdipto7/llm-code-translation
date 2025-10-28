import sys

class SimpleScanner:
    def __init__(self, in_stream):
        self.in_stream = in_stream
        self.buffer = []
        self.eof = False

    def read(self):
        if not self.buffer:
            try:
                self.buffer = list(sys.stdin.readline().strip())
            except IOError:
                self.eof = True
                return ''
        return self.buffer.pop(0) if self.buffer else ''

    def check_eof(self):
        if self.eof:
            raise StopIteration

    def next_char(self):
        self.check_eof()
        b = self.read()
        self.check_eof()
        return b

    def next(self):
        b = self.read()
        while b and b.isspace():
            b = self.read()
        sb = []
        while b and not b.isspace():
            sb.append(b)
            b = self.read()
        return ''.join(sb)

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return int(self.next())

    def next_double(self):
        return float(self.next())

scanner = SimpleScanner(sys.stdin)
writer = sys.stdout
r = scanner.next_int()
d = scanner.next_int()
x = scanner.next_long()
for i in range(10):
    x = r * x - d
    writer.write(f"{x}\n")
writer.flush()
