
import sys

class Main:
    def main(self):
        size = int(sys.stdin.readline().strip())
        graph = [[0] * size for _ in range(size)]
        for _ in range(size):
            id, cols = map(int, sys.stdin.readline().strip().split())
            row = [0] * size
            values = list(map(int, sys.stdin.readline().strip().split()))
            for value in values:
                row[value - 1] = 1
            graph[id - 1] = row
        for row in graph:
            print(' '.join(map(str, row)))

if __name__ == "__main__":
    Main().main()

