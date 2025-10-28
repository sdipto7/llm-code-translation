
from collections import deque

def main():
    import sys
    data = sys.stdin.read().splitlines()
    H, W = map(int, data[0].split())
    A = [['' for _ in range(W)] for _ in range(H)]
    queue = deque()
    
    for i in range(H):
        row = data[i+1]
        for j in range(W):
            A[i][j] = row[j]
            if A[i][j] == '#':
                queue.append([i, j, 0])
    
    flag = [[0 for _ in range(W)] for _ in range(H)]
    ans = 0
    dx = [1, -1, 0, 0]
    dy = [0, 0, 1, -1]
    
    while queue:
        temp = queue.popleft()
        y, x, depth = temp
        for i in range(4):
            newY = y + dy[i]
            newX = x + dx[i]
            if 0 <= newY < H and 0 <= newX < W:
                if flag[newY][newX] == 0 and A[newY][newX] == '.':
                    flag[newY][newX] = 1
                    queue.append([newY, newX, depth + 1])
                    ans = depth + 1
    
    print(ans)

if __name__ == "__main__":
    main()

