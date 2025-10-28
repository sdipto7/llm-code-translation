
import sys

class AStationAndBus:
    def solve(self, test_number, in_stream, out):
        s = in_stream.readline().strip()
        if 'A' in s and 'B' in s:
            out.write("Yes\n")
        else:
            out.write("No\n")

if __name__ == "__main__":
    solver = AStationAndBus()
    solver.solve(1, sys.stdin, sys.stdout)

