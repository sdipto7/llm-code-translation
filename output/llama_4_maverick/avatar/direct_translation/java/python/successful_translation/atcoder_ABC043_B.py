
import sys

class LightScanner:
    def __init__(self, stream):
        self.stream = stream
        self.tokens = []

    def string(self):
        if not self.tokens:
            self.tokens = self.stream.readline().split()
        return self.tokens.pop(0)

class BUnhappyHackingABCEdit:
    def solve(self, test_number, scanner, output_stream):
        s = scanner.string()
        d = []
        for c in s:
            if c == '0':
                d.append('0')
            elif c == '1':
                d.append('1')
            elif c == 'B' and d:
                d.pop()
        output_stream.write(''.join(d) + '\n')

def main():
    scanner = LightScanner(sys.stdin)
    output_stream = sys.stdout
    solver = BUnhappyHackingABCEdit()
    solver.solve(1, scanner, output_stream)

if __name__ == "__main__":
    main()

