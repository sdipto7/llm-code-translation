
class Main:
    def __init__(self):
        self.high = 0
        self.low = 0
        self.sa = 0

    def solve(self):
        for _ in range(7):
            self.high = int(input())
            self.low = int(input())
            self.sa = self.high - self.low
            print(self.sa)

if __name__ == "__main__":
    obj = Main()
    obj.solve()

