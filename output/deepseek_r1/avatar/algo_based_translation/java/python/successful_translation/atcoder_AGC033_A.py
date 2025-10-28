
import sys
from collections import deque

H, W = map(int, sys.stdin.readline().split())
A = []
queue = deque()

for i in range(H):
    row = sys.stdin.readline().strip()
    A.append(list(row))
    for j in range(W):
        if A[i][j] == '#':
            queue.append((i, j, 0))

flag = [[0] * W for _ in range(H)]
ans = 0
dx = [1, -1, 0, 0]
dy = [0, 0, 1, -1]

while queue:
    y, x, depth = queue.popleft()
    for i in range(4):
        ny = y + dy[i]
        nx = x + dx[i]
        if 0 <= ny < H and 0 <= nx < W:
            if flag[ny][nx] == 0 and A[ny][nx] == '.':
                flag[ny][nx] = 1
                queue.append((ny, nx, depth + 1))
                ans = depth + 1

print(ans)

