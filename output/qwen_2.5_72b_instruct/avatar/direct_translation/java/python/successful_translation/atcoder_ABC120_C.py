
import sys

class atcoder_ABC120_C:
    @staticmethod
    def main():
        input_stream = sys.stdin
        output_stream = sys.stdout
        in_reader = InputReader(input_stream)
        out_writer = OutputWriter(output_stream)
        task_b = TaskB()
        task_b.solve(1, in_reader, out_writer)
        out_writer.close()

class TaskB:
    def solve(self, testNumber, in_reader, out_writer):
        x = in_reader.next()
        s = []
        c = 0
        for i in range(len(x)):
            s.append(x[i])
            while len(s) > 1:
                p = s.pop()
                q = s.pop()
                if (p == '1' and q == '0') or (p == '0' and q == '1'):
                    c += 1
                    continue
                else:
                    s.append(q)
                    s.append(p)
                    break
        out_writer.println(c * 2)

class InputReader:
    def __init__(self, stream):
        self.reader = stream
        self.tokenizer = None

    def next(self):
        while self.tokenizer is None or not self.tokenizer.hasMoreTokens():
            line = self.reader.readline()
            if not line:
                raise RuntimeError("EOF")
            self.tokenizer = StringTokenizer(line)
        return self.tokenizer.nextToken()

class StringTokenizer:
    def __init__(self, line):
        self.tokens = line.split()
        self.index = 0

    def hasMoreTokens(self):
        return self.index < len(self.tokens)

    def nextToken(self):
        if self.hasMoreTokens():
            token = self.tokens[self.index]
            self.index += 1
            return token
        else:
            raise RuntimeError("EOF")

class OutputWriter:
    def __init__(self, stream):
        self.writer = stream

    def println(self, x):
        self.writer.write(str(x) + '\n')

    def close(self):
        self.writer.close()

if __name__ == "__main__":
    atcoder_ABC120_C.main()

