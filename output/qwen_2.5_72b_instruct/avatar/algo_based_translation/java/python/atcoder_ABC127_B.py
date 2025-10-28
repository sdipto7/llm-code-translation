import sys

class SimpleScanner:
    BUFFER_SIZE = 10240

    def __init__(self, input_stream):
        self.input_stream = input_stream
        self.buffer = bytearray(self.BUFFER_SIZE)
        self.buffer_pos = 0
        self.buffer_len = 0
        self.eof = False

    def _read(self):
        if self.buffer_pos == self.buffer_len:
            self.buffer_pos = 0
            self.buffer_len = self.input_stream.readinto(self.buffer)
            if self.buffer_len <= 0:
                self.eof = True
                return -1
        byte = self.buffer[self.buffer_pos]
        self.buffer_pos += 1
        return byte

    def _check_eof(self):
        if self.eof:
            raise ValueError("No more elements")

    def _next_char(self):
        self._check_eof()
        byte = self._read()
        self._check_eof()
        return chr(byte)

    def _next(self):
        byte = self._read()
        self._check_eof()
        while chr(byte).isspace():
            byte = self._read()
            self._check_eof()

        sb = []
        while not self.eof and not chr(byte).isspace():
            sb.append(chr(byte))
            byte = self._read()

        return ''.join(sb)

    def next_int(self):
        return int(self._next())

    def next_long(self):
        return int(self._next())

    def next_double(self):
        return float(self._next())

def main():
    scanner = SimpleScanner(sys.stdin)
    writer = sys.stdout

    r = scanner.next_int()
    d = scanner.next_int()
    x = scanner.next_long()

    for i in range(10):
        x = r * x - d
        writer.write(f"{x}\n")

if __name__ == "__main__":
    main()
