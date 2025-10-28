
import sys

def main():
    input = sys.stdin.read().strip().split()
    solver = AStationAndBus()
    solver.solve(1, input, sys.stdout)

class AStationAndBus:
    def solve(self, testNumber, input, output):
        s = input[0]
        if 'A' in s and 'B' in s:
            output.write("Yes\n")
        else:
            output.write("No\n")

if __name__ == "__main__":
    main()

