
import sys

n, m_total = map(int, input().split())
black = [[0] * (n + 2) for _ in range(n + 2)]

for m in range(1, m_total + 1):
    x, y = map(int, input().split())
    for xx in range(x-1, x+2):
        for yy in range(y-1, y+2):
            black[xx][yy] += 1
            if black[xx][yy] == 9:
                print(m)
                sys.exit()

print(-1)

