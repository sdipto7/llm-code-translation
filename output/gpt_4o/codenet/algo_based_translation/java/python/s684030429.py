
import sys

class Main:
    def __init__(self):
        self.sc = sys.stdin
        self.max = 0
        self.cur = 0

    def solve(self):
        a = self.ni()
        b = self.ni()
        print(max(0, a - 2 * b))

    def ni(self):
        return int(self.sc.readline().strip())

if __name__ == "__main__":
    Main().solve()

