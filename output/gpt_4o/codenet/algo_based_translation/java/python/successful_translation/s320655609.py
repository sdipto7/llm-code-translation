
import sys

class Main:
    def __init__(self):
        self.constraints = []
        self.N = 0
        self.result = 0

        self.read_input()
        self.calc()

    def read_input(self):
        input = sys.stdin.read().strip().split()
        self.N = int(input[0])
        for i in range(1, 6):
            self.constraints.append(int(input[i]))

    def calc(self):
        min_constraint = min(self.constraints)
        time = self.N // min_constraint
        if self.N % min_constraint != 0:
            time += 1
        time += 4
        self.result = time

if __name__ == "__main__":
    instance = Main()
    print(instance.result)

