
import sys

class Main:
    def __init__(self):
        self.high = 0
        self.low = 0
        self.sa = 0

    def solve(self):
        for _ in range(7):
            self.high = int(sys.stdin.readline().strip())
            self.low = int(sys.stdin.readline().strip())
            self.sa = self.high - self.low
            print(self.sa)

def main():
    obj = Main()
    obj.solve()

if __name__ == "__main__":
    main()

