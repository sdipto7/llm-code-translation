
import sys

class CColoringColorfully:
    def solve(self, test_number, input_reader, output_writer):
        x = input_reader.next()
        a = list(x)
        b = list(x)
        a1 = 0
        a2 = 0
        for i in range(1, len(x)):
            if a[i] == a[i - 1]:
                a[i] = '0' if a[i] == '1' else '1'
                a1 += 1
        for i in range(len(x) - 1, 0, -1):
            if b[i] == b[i - 1]:
                b[i - 1] = '0' if b[i - 1] == '1' else '1'
                a2 += 1
        output_writer.write(f"{min(a1, a2)}\n")

class InputReader:
    def __init__(self, stream):
        self.reader = sys.stdin
        self.tokenizer = None

    def next(self):
        while self.tokenizer is None or not self.tokenizer.has_more_tokens():
            try:
                self.tokenizer = StringTokenizer(self.reader.readline())
            except Exception as e:
                raise RuntimeError(e)
        return self.tokenizer.next_token()

class StringTokenizer:
    def __init__(self, string):
        self.tokens = string.split()
        self.index = 0

    def has_more_tokens(self):
        return self.index < len(self.tokens)

    def next_token(self):
        token = self.tokens[self.index]
        self.index += 1
        return token

if __name__ == "__main__":
    input_stream = sys.stdin
    output_stream = sys.stdout
    input_reader = InputReader(input_stream)
    output_writer = output_stream
    solver = CColoringColorfully()
    solver.solve(1, input_reader, output_writer)
    output_writer.flush()

