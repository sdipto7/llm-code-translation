
import sys

class InputReader:
    def __init__(self, stream):
        self.reader = stream
        self.tokenizer = None

    def next(self):
        while self.tokenizer is None or not self.tokenizer:
            self.tokenizer = self.reader.readline().strip().split()
        return self.tokenizer.pop(0)

class CColoringColorfully:
    def solve(self, test_number, in_reader, out):
        x = in_reader.next()
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
        
        out.write(f"{min(a1, a2)}\n")

def main():
    input_stream = sys.stdin
    output_stream = sys.stdout
    in_reader = InputReader(input_stream)
    out = output_stream
    solver = CColoringColorfully()
    solver.solve(1, in_reader, out)

if __name__ == "__main__":
    main()

