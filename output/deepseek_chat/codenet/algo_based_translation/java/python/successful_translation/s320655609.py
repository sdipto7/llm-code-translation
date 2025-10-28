
import sys

class Main:
    def __init__(self):
        self.constraints = []
        self.N = 0
        self.result = 0
        
        lines = sys.stdin.read().splitlines()
        self.N = int(lines[0])
        for i in range(1, 6):
            self.constraints.append(int(lines[i]))
        
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

