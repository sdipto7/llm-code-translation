
import sys

class InputReader:
    def __init__(self, stream):
        self.reader = stream
        self.tokenizer = None
    
    def next(self):
        while not self.tokenizer or not self.tokenizer:
            line = self.reader.readline()
            if not line:
                break
            self.tokenizer = line.strip().split()
        return self.tokenizer.pop(0)

def solve(test_number, in_reader, out):
    s = in_reader.next()
    score = 0
    for i in range(len(s)):
        my = 'g' if i % 2 == 0 else 'p'
        his = s[i]
        if my != his:
            score += 1 if my == 'p' else -1
    out.write(str(score) + '\n')

def main():
    in_reader = InputReader(sys.stdin)
    out = sys.stdout
    solve(1, in_reader, out)

if __name__ == "__main__":
    main()

