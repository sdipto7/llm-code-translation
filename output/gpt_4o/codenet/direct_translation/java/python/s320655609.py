
import sys

class Main:
    def __init__(self):
        self.constraints = []
        self.N = int(sys.stdin.readline().strip())
        for _ in range(5):
            self.constraints.append(int(sys.stdin.readline().strip()))
        self.calc()

    def calc(self):
        min_constraint = min(self.constraints)
        time = self.N // min_constraint
        if self.N % min_constraint != 0:
            time += 1
        time += 4
        self.result = time

if __name__ == '__main__':
    ins = Main()
    print(ins.result)

