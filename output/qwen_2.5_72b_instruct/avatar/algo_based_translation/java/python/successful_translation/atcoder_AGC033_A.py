
import sys
from collections import deque

def main():
    import sys
    input = sys.stdin.read
    data = input().split()
    
    H = int(data[0])
    W = int(data[1])
    A = []
    index = 2
    
    for i in range(H):
        row = data[index]
        A.append(list(row))
        index += 1
    
    queue = deque()
    flag = [[0] * W for _ in range(H)]
    ans = 0
    dx = [1, -1, 0, 0]
    dy = [0, 0, 1, -1]
    
    for i in range(H):
        for j in range(W):
            if A[i][j] == '#':
                queue.append((i, j, 0))
    
    while queue:
        temp = queue.popleft()
        y, x, depth = temp
        
        for i in range(4):
            if 0 <= y + dy[i] <= H - 1 and 0 <= x + dx[i] <= W - 1:
                if flag[y + dy[i]][x + dx[i]] == 0 and A[y + dy[i]][x + dx[i]] == '.':
                    flag[y + dy[i]][x + dx[i]] = 1
                    queue.append((y + dy[i], x + dx[i], depth + 1))
                    ans = depth + 1
    
    print(ans)

if __name__ == "__main__":
    main()

