
import sys

class atcoder_ABC149_B:
    def __init__(self):
        self.A, self.B, self.K = map(int, sys.stdin.readline().split())
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

    def showResult(self):
        print(self.x, self.y)

if __name__ == "__main__":
    ins = atcoder_ABC149_B()
    ins.calc()
    ins.showResult()

