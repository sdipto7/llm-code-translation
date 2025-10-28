
import sys

input = sys.stdin.read().split()
N = int(input[0])
M = int(input[1])
black = [[0] * (N + 2) for _ in range(N + 2)]
index = 2
for m in range(1, M + 1):
    x = int(input[index])
    y = int(input[index + 1])
    index += 2
    for xx in range(x - 1, x + 2):
        for yy in range(y - 1, y + 2):
            black[xx][yy] += 1
            if black[xx][yy] == 9:
                print(m)
                sys.exit()
print("-1")

