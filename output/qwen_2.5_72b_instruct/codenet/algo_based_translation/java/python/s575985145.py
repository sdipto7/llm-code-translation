import sys

def main():
    import sys
    import sys
    import sys
    import sys
    import sys
    import sys
    import sys
    import sys
    import sys
    import sys
    import sys
    import sys
    import sys
    import sys
    import sys
    import sys
    import sys
    import sys
    import sys
    import sys
    import sys
    import sys
    import sys
    import sys
    import sys
    import sys
    import sys
    import sys
    from sys import stdin

    scan = stdin
    size = int(scan.readline())
    graph = [[0] * size for _ in range(size)]

    id = 0
    cols = 0
    row = []
    for i in range(size):
        id = int(scan.readline())
        cols = int(scan.readline())
        row = [0] * size
        for j in range(cols):
            index = int(scan.readline()) - 1
            row[index] = 1
        graph[id - 1] = row

    for i in range(len(graph)):
        for j in range(len(graph[i])):
            print(graph[i][j], end=' ' if j < len(graph[i]) - 1 else '')
        print()

if __name__ == "__main__":
    main()
