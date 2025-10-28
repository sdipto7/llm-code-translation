
import sys

class FastReader:
    def __init__(self):
        self.buffer = sys.stdin
        self.tokenizer = None

    def next(self):
        while self.tokenizer is None or not self.has_more_tokens():
            self.tokenizer = iter(self.buffer.readline().split())
        return next(self.tokenizer)

    def has_more_tokens(self):
        return hasattr(self.tokenizer, '__next__')

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return int(self.next())

    def next_double(self):
        return float(self.next())

    def next_line(self):
        return self.buffer.readline().strip()

def main():
    sc = FastReader()
    x = sc.next_int()
    count = 0
    tmp = x
    x = 0
    while x != 360:
        x = x + tmp
        if x > 360:
            x = x - 360
        count += 1
    print(count)

if __name__ == "__main__":
    main()

