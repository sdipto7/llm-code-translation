
import sys
import io

class CColoringColorfully:
    def solve(self, testNumber, in_reader, out):
        x = in_reader.next()
        a = list(x)
        b = list(x)
        a1 = 0
        a2 = 0
        for i in range(1, len(x)):
            if a[i] == a[i - 1]:
                if a[i] == '1':
                    a[i] = '0'
                else:
                    a[i] = '1'
                a1 += 1
        for i in range(len(x) - 1, 0, -1):
            if b[i] == b[i - 1]:
                if b[i - 1] == '1':
                    b[i - 1] = '0'
                else:
                    b[i - 1] = '1'
                a2 += 1
        out.write(f"{min(a1, a2)}\n")

class InputReader:
    def __init__(self, stream):
        self.reader = io.BufferedReader(io.TextIOWrapper(stream, encoding='utf-8'))
        self.tokenizer = None

    def next(self):
        while self.tokenizer is None or not self.tokenizer.hasMoreTokens():
            line = self.reader.readline()
            if line == '':
                break
            self.tokenizer = StringTokenizer(line)
        if self.tokenizer.hasMoreTokens():
            return self.tokenizer.nextToken()
        else:
            return None

class StringTokenizer:
    def __init__(self, line):
        self.tokens = line.split()
        self.index = 0

    def hasMoreTokens(self):
        return self.index < len(self.tokens)

    def nextToken(self):
        token = self.tokens[self.index]
        self.index += 1
        return token

def main():
    input_stream = sys.stdin.buffer
    output_stream = sys.stdout
    in_reader = InputReader(input_stream)
    out = io.TextIOWrapper(output_stream, encoding='utf-8')
    solver = CColoringColorfully()
    solver.solve(1, in_reader, out)
    out.flush()

if __name__ == "__main__":
    main()

