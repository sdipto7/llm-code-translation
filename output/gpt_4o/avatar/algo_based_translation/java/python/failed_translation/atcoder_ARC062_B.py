
import sys

class InputReader:
    def __init__(self, stream):
        self.reader = stream
        self.tokenizer = None

    def next(self):
        while self.tokenizer is None or not self.tokenizer:
            line = self.reader.readline()
            if not line:
                raise RuntimeError("No more input")
            self.tokenizer = line.split()
        return self.tokenizer.pop(0)

class TaskD:
    def solve(self, test_number, in_reader, out_writer):
        S = in_reader.next()
        score = 0
        for i in range(len(S)):
            my = 'g' if i % 2 == 0 else 'p'
            his = S[i]
            if my != his:
                score += 1 if my == 'p' else -1
        out_writer.write(f"{score}\n")

def main():
    input_stream = sys.stdin
    output_stream = sys.stdout
    in_reader = InputReader(input_stream)
    out_writer = output_stream
    solver = TaskD()
    solver.solve(1, in_reader, out_writer)

if __name__ == "__main__":
    main()

