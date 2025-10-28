
import sys

class InputReader:
    def __init__(self, stream):
        self.reader = stream
        self.tokenizer = None

    def next(self):
        while self.tokenizer is None or not self.tokenizer:
            try:
                self.tokenizer = self.reader.readline().split()
            except Exception as e:
                raise RuntimeError(e)
        return self.tokenizer.pop(0)

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
        print(0, file=out_writer)
    elif a > d:
        print(0, file=out_writer)
    elif a < c:
        print(min(b, d) - c, file=out_writer)
    else:
        l = [a, b, c, d]
        l.sort()
        print(l[2] - l[1], file=out_writer)

if __name__ == '__main__':
    main()

