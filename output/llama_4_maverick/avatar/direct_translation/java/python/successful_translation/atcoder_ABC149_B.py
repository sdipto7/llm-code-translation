
import sys
class AtcoderABC149B:
    def __init__(self, line):
        A, B, K = map(int, line.split())
        self.A = A
        self.B = B
        self.K = K

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
        print(self.x, self.y)

def main():
    line = sys.stdin.readline().strip()
    ins = AtcoderABC149B(line)
    ins.calc()
    ins.show_result()

if __name__ == "__main__":
    main()

