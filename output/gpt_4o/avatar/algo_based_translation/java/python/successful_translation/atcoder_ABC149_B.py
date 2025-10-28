
import sys

class AtcoderABC149B:
    def __init__(self, input_data):
        tokens = input_data.strip().split()
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
    input_data = sys.stdin.read()
    instance = AtcoderABC149B(input_data)
    instance.calc()
    instance.show_result()

