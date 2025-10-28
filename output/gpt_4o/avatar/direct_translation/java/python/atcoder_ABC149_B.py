
import sys

class AtcoderABC149B:
    def __init__(self, input_line):
        tokens = input_line.split()
        self.A = int(tokens[0])
        self.B = int(tokens[1])
        self.K = int(tokens[2])
        self.x = 0
        self.y = 0

    def calc(self):
        self.x = self.A
        self.y = self.B
        self.x = self.A - self.K
        if self.x < 0:
            self.y = self.B + self.x
            self.x = 0
            if self.y < 0:
                self.y = 0

    def show_result(self):
        print(f"{self.x} {self.y}")

if __name__ == "__main__":
    input_line = sys.stdin.read().strip()
    ins = AtcoderABC149B(input_line)
    ins.calc()
    ins.show_result()

