
import sys

class InputReader:
    def __init__(self, stream):
        self.stream = stream

    def next(self):
        return self.stream.readline().strip()

class TaskD:
    def solve(self, test_number, in_reader, out_stream):
        S = in_reader.next()
        score = 0
        for i in range(len(S)):
            my = 'g' if i % 2 == 0 else 'p'
            his = S[i]
            if my != his:
                score += 1 if my == 'p' else -1
        out_stream.write(str(score) + '\n')

def main():
    input_stream = sys.stdin
    output_stream = sys.stdout
    in_reader = InputReader(input_stream)
    task_solver = TaskD()
    task_solver.solve(1, in_reader, output_stream)
    output_stream.flush()

if __name__ == "__main__":
    main()

