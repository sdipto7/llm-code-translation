
class Main:
    def __init__(self):
        self.high = 0
        self.low = 0
        self.sa = 0

    def solve(self):
        import sys
        input = sys.stdin.read().split()
        index = 0
        for _ in range(7):
            self.high = int(input[index])
            self.low = int(input[index + 1])
            self.sa = self.high - self.low
            print(self.sa)
            index += 2

if __name__ == "__main__":
    obj = Main()
    obj.solve()

