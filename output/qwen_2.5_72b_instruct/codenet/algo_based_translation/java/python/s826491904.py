
import sys

class Main:
    def __init__(self):
        self.sc = sys.stdin

    def solve(self):
        N = int(self.sc.readline().strip())
        values = list(map(int, self.sc.readline().strip().split()))
        max_val = min_val = values[0]
        for i in range(1, N):
            in_val = values[i]
            max_val = max(max_val, in_val)
            min_val = min(min_val, in_val)
        print(max_val - min_val)

if __name__ == "__main__":
    main = Main()
    main.solve()

