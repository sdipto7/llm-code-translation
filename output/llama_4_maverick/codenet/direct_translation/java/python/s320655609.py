
import sys

class Main:
    def __init__(self):
        self.constraints = []
        self.N = int(sys.stdin.readline().strip())
        for _ in range(5):
            self.constraints.append(int(sys.stdin.readline().strip()))
        self.calc()

    def calc(self):
        min_val = min(self.constraints)
        time = self.N // min_val
        if self.N % min_val != 0:
            time += 1
        time += 4
        self.result = time

    def get_result(self):
        return self.result

def main():
    ins = Main()
    print(ins.get_result())

if __name__ == "__main__":
    main()

