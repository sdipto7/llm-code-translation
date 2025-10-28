
class Main:
    def __init__(self):
        self.N = int(input().strip())
        self.constraints = [int(input().strip()) for _ in range(5)]
        self.result = 0
        self.calc()

    def calc(self):
        min_constraint = min(self.constraints)
        time = self.N // min_constraint
        if self.N % min_constraint != 0:
            time += 1
        time += 4
        self.result = time

if __name__ == "__main__":
    ins = Main()
    print(ins.result)

