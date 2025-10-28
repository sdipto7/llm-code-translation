
import sys

class AtcoderABC149B:
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
            self.y += self.x
            self.x = 0
            if self.y < 0:
                self.y = 0
    
    def show_result(self):
        print(f"{self.x} {self.y}")

if __name__ == "__main__":
    A, B, K = map(int, sys.stdin.readline().split())
    obj = AtcoderABC149B(A, B, K)
    obj.calc()
    obj.show_result()

