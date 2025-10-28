
import sys
from collections import deque

H, W = map(int, sys.stdin.readline().split())
grid = [list(sys.stdin.readline().strip()) for _ in range(H)]
visited = [[0] * W for _ in range(H)]
q = deque()
ans = 0

for i in range(H):
    for j in range(W):
        if grid[i][j] == '#':
            q.append((i, j, 0))

dx = [1, -1, 0, 0]
dy = [0, 0, 1, -1]

while q:
    y, x, depth = q.popleft()
    for i in range(4):
        ny = y + dy[i]
        nx = x + dx[i]
        if 0 <= ny < H and 0 <= nx < W:
            if not visited[ny][nx] and grid[ny][nx] == '.':
                visited[ny][nx] = 1
                q.append((ny, nx, depth + 1))
                ans = depth + 1

print(ans)

