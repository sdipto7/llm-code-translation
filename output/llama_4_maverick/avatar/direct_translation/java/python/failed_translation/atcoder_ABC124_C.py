
import sys

class InputReader:
    def __init__(self, stream):
        self.reader = stream.readline
        self.tokenizer = None

    def next(self):
        if self.tokenizer is None or not self.tokenizer:
            try:
                line = self.reader().strip()
                if line == '':
                    return self.next()
                self.tokenizer = line.split()
            except Exception as e:
                raise RuntimeError(e)
        return self.tokenizer.pop(0)

class CColoringColorfully:
    def solve(self, testNumber, in_, out):
        x = in_.next()
        a = list(x)
        b = list(x)
        a1 = 0
        a2 = 0
        for i in range(1, len(x)):
            if a
