
import sys

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

class InputReader:
    def __init__(self, stream):
        self.reader = stream
        self.tokenizer = None

    def next(self):
        while self.tokenizer is None or not self.tokenizer.hasmoretokens():
            try:
                self.tokenizer = sys.stdin.readline().split()
            except Exception as e:
                raise RuntimeError(e)
        return self.tokenizer.pop(0)

def main():
    inputStream = sys.stdin
    outputStream = sys.stdout
    in_ = InputReader(inputStream)
    out = outputStream
    solver = TaskD()
    solver.solve(1, in_, out)

if __name__ == "__main__":
    main()

