
class LightScanner:
    def __init__(self, in_stream):
        self.reader = in_stream
        self.tokenizer = None

    def string(self):
        if self.tokenizer is None or not self.tokenizer:
            self.tokenizer = self.reader.readline().strip().split()
        return self.tokenizer.pop(0)

class BUnhappyHackingABCEdit:
    def solve(self, testNumber, in_stream, out_stream):
        s = in_stream.string()
        d = []
        for c in s:
            if c == '0':
                d.append("0")
            elif c == '1':
                d.append("1")
            elif c == 'B':
                if d:
                    d.pop()
        out_stream.write(''.join(d) + '\n')

import sys
input_stream = sys.stdin
output_stream = sys.stdout
in_stream = LightScanner(input_stream)
out_stream = output_stream
solver = BUnhappyHackingABCEdit()
solver.solve(1, in_stream, out_stream)

