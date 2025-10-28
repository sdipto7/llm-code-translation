import sys

class Main:
    def __init__(self):
        import sys
        input = sys.stdin.read().splitlines()
        self.N = int(input[0])
        self.constraints = [int(line) for line in input[1:6]]
        self.calc()

    def calc(self):
        min_val = float('inf')
        for c in self.constraints:
            min_val = min(min_val, c)
        time = self.N // min_val
        if self.N % min_val != 0:
            time += 1
        time += 4
        self.result = time

if __name__ == "__main__":
    ins = Main()
    print(ins.result)
