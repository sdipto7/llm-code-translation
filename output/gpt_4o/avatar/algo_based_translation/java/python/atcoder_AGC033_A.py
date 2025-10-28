
import sys
from collections import deque

def main():
    input = sys.stdin.read
    data = input().split()
    
    H = int(data[0])
    W = int(data[1])
    
    A = []
    queue = deque()
    
    index = 2
    for i in range(H):
        row = data[index]
        index += 1
        A.append(list(row))
        for j in range(W):
            if A[i][j] == '#':
                start = (i, j, 0)
                queue.append(start)
    
    flag = [[0] * W for _ in range(H)]
    ans = 0
    dx = [1, -1, 0, 0]
    dy = [0, 0, 1, -1]
    
    while queue:
        y, x, depth = queue.popleft()
        for i in range(4):
            ny, nx = y + dy[i], x + dx[i]
            if 0 <= ny < H and 0 <= nx < W:
                if flag[ny][nx] == 0 and A[ny][nx] == '.':
                    flag[ny][nx] = 1
                    queue_add = (ny, nx, depth + 1)
                    queue.append(queue_add)
                    ans = depth + 1
    
    print(ans)

if __name__ == "__main__":
    main()

