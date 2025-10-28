
import sys

class AStationAndBus:
    def solve(self, testNumber, inputStream, outputStream):
        s = inputStream.readline().strip()
        if 'A' in s and 'B' in s:
            outputStream.write('Yes\n')
        else:
            outputStream.write('No\n')

def main():
    inputStream = sys.stdin
    outputStream = sys.stdout
    solver = AStationAndBus()
    solver.solve(1, inputStream, outputStream)

if __name__ == "__main__":
    main()

