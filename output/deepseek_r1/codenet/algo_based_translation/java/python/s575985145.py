
import sys

def main():
    size = int(sys.stdin.readline())
    graph = [[0] * size for _ in range(size)]
    
    for _ in range(size):
        parts = list(map(int, sys.stdin.readline().split()))
        current_id = parts[0]
        cols = parts[1]
        indices = parts[2:2+cols]
        row = [0] * size
        
        for idx in indices:
            row[idx - 1] = 1
        
        graph[current_id - 1] = row
    
    for row in graph:
        print(' '.join(map(str, row)))

if __name__ == "__main__":
    main()

