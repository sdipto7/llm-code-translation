import sys

def main():
    size = int(input().strip())
    graph = [[0] * size for _ in range(size)]
    
    for _ in range(size):
        data = list(map(int, input().split()))
        id_val = data[0]
        cols = data[1]
        row = [0] * size
        
        for j in range(2, 2 + cols):
            index = data[j] - 1
            row[index] = 1
            
        graph[id_val - 1] = row
    
    for i in range(len(graph)):
        for j in range(len(graph[i])):
            print(graph[i][j], end="")
            if j < len(graph[i]) - 1:
                print(" ", end="")
        print()

if __name__ == "__main__":
    main()
