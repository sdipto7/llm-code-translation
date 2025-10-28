
import sys

class InputReader:
    def __init__(self, stream):
        self.stream = stream
        self.tokenizer = None

    def next(self):
        if self.tokenizer is None or not self.tokenizer:
            line = self.stream.readline().decode().strip()
            self.tokenizer = line.split()
        return self.tokenizer.pop(0)

class TaskD:
    def solve(self, testNumber, in_, out):
        S = in_.next()
        score = 0
        for i in range(len(S)):
            my = 'g' if i % 2 == 0 else 'p'
            his = S[i]
            if my != his:
                score += 1 if my == 'p' else -1
        out.write(str(score) + '\n')

def main():
    inputStream = sys.stdin
    outputStream = sys.stdout
    in_ = InputReader(inputStream)
    out = outputStream
    solver = TaskD()
    solver.solve(1, in_, lambda x: out.write(str(x)))
    outputStream.flush()

if __name__ == "__main__":
    main()

