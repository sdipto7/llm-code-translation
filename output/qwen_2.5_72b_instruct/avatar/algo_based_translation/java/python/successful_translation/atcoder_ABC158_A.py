
import sys

class AStationAndBus:
    def solve(self, testNumber, in_stream, out_stream):
        s = in_stream.readline().strip()
        if "A" in s and "B" in s:
            out_stream.write("Yes\n")
        else:
            out_stream.write("No\n")

def main():
    in_stream = sys.stdin
    out_stream = sys.stdout
    solver = AStationAndBus()
    solver.solve(1, in_stream, out_stream)

if __name__ == "__main__":
    main()

