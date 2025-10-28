import sys
from io import StringIO
from collections import deque

class InputReader:
    def __init__(self, stream):
        self.reader = StringIO(stream.read())
        self.tokens = deque()

    def next(self):
        while not self.tokens:
            line = self.reader.readline()
            if not line:
                break
            self.tokens.extend(line.split())
        return self.tokens.popleft()

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return int(self.next())

def main():
    input_stream = sys.stdin
    output_stream = sys.stdout
    in_reader = InputReader(input_stream)
    out_writer = output_stream

    a = in_reader.nextInt()
    b = in_reader.nextInt()
    c = in_reader.nextInt()
    d = in_reader.nextInt()

    if c > b:
        out_writer.write('0\n')
    elif a > d:
        out_writer.write('0\n')
    elif a < c:
        out_writer.write(f'{min(b, d) - c}\n')
    else:
        l = [a, b, c, d]
        l.sort()
        out_writer.write(f'{l[2] - l[1]}\n')

if __name__ == "__main__":
    main()
