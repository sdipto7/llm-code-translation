
import sys

class atcoder_ABC149_B:
    def __init__(self):
        self.A = 0
        self.B = 0
        self.K = 0
        self.x = 0
        self.y = 0
    
    def read_input(self):
        line = sys.stdin.readline().strip()
        tokens = line.split()
        self.A = int(tokens[0])
        self.B = int(tokens[1])
        self.K = int(tokens[2])
    
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
        print(f"{self.x} {self.y}")

def main():
    ins = atcoder_ABC149_B()
    ins.read_input()
    ins.calc()
    ins.show_result()

if __name__ == "__main__":
    main()

