
import sys

N, M = map(int, input().split())
black = [[0] * (N + 2) for _ in range(N + 2)]

for m in range(1, M + 1):
    x, y = map(int, input().split())
    for dx in (-1, 0, 1):
        for dy in (-1, 0, 1):
            xx = x + dx
            yy = y + dy
            black[xx][yy] += 1
            if black[xx][yy] == 9:
                print(m)
                sys.exit()

print(-1)

