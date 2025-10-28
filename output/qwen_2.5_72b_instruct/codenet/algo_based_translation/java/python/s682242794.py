import sys

class Main:
    def solve(self):
        for _ in range(7):
            high = int(sys.stdin.readline().strip())
            low = int(sys.stdin.readline().strip())
            sa = high - low
            print(sa)

if __name__ == "__main__":
    obj = Main()
    obj.solve()
