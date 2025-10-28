
def main():
    size = int(input())
    graph = [[0] * size for _ in range(size)]
    
    for _ in range(size):
        id = int(input())
        cols = int(input())
        row = [0] * size
        for _ in range(cols):
            index = int(input()) - 1
            row[index] = 1
        graph[id - 1] = row
    
    for row in graph:
        print(' '.join(map(str, row)))

if __name__ == "__main__":
    main()

