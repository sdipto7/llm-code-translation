import sys

class Atcoder_ABC149_B:
    def __init__(self, A, B, K):
        self.A = A
        self.B = B
        self.K = K
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

def main():
    import sys
    input = sys.stdin.read().split()
    A = int(input[0])
    B = int(input[1])
    K = int(input[2])
    ins = Atcoder_ABC149_B(A, B, K)
    ins.calc()
    ins.showResult()

if __name__ == "__main__":
    main()
