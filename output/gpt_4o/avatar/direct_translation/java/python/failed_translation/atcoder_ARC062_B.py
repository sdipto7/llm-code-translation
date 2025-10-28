
import sys

class TaskD:
    def solve(self, testNumber, in_reader, out_writer):
        S = in_reader.next()
        score = 0
        for i in range(len(S)):
            my = 'g' if i % 2 == 0 else 'p'
            his = S[i]
            if my != his:
                score += 1 if my == 'p' else -1
        out_writer.write(f"{score}\n")

class InputReader:
    def __init__(self, stream):
        self.reader = stream
        self.tokenizer = None
    
    def next(self):
        while self.tokenizer is None or not self.tokenizer:
            self.tokenizer = self.reader.readline().split()
        return self.tokenizer.pop(0)

if __name__ == "__main__":
    input_stream = sys.stdin
    output_stream = sys.stdout
    in_reader = InputReader(input_stream)
    out_writer = output_stream
    solver = TaskD()
    solver.solve(1, in_reader, out_writer)

