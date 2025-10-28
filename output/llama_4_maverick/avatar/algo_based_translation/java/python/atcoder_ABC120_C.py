
import sys

class InputReader:
    def __init__(self, stream):
        self.stream = stream
        self.tokens = []

    def next(self):
        if not self.tokens:
            line = self.stream.readline().strip()
            self.tokens = line.split()
        return self.tokens.pop(0)

def main():
    input_stream = sys.stdin
    output_stream = sys.stdout
    in_reader = InputReader(input_stream)
    x = in_reader.next()
    s = []
    c = 0
    for char in x:
        s.append(char)
        while len(s) > 1:
            p = s.pop()
            q = s.pop()
            if (p == '1' and q == '0') or (p == '0' and q == '1'):
                c += 1
            else:
                s.append(q)
                s.append(p)
                break
    output_stream.write(str(c * 2) + '\n')

if __name__ == "__main__":
    main()

