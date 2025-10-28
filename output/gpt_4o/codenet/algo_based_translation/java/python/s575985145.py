
import sys

def main():
    scan = sys.stdin
    size = int(scan.readline().strip())
    graph = [[0] * size for _ in range(size)]

    for _ in range(size):
        inputs = list(map(int, scan.readline().strip().split()))
        id = inputs[0]
        cols = inputs[1]
        row = [0] * size
        for j in range(2, 2 + cols):
            row[inputs[j] - 1] = 1
        graph[id - 1] = row

    for i in range(len(graph)):
        for j in range(len(graph[i])):
            print(graph[i][j], end=" ")
        print()

if __name__ == "__main__":
    main()

