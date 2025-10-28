
import sys

class AStationAndBus:
    def solve(self, testNumber, inp, out):
        s = inp.readline().strip()
        if 'A' in s and 'B' in s:
            out.write("Yes\n")
        else:
            out.write("No\n")

def main():
    inputStream = sys.stdin
    outputStream = sys.stdout
    inp = inputStream
    out = outputStream
    solver = AStationAndBus()
    solver.solve(1, inp, out)
    out.close()

if __name__ == "__main__":
    main()

