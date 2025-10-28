
import sys

H, W = map(int, sys.stdin.readline().split())
S = [list(sys.stdin.readline().strip()) for _ in range(H)]

for i in range(H):
    for j in range(W):
        if S[i][j] == '.':
            count = 0
            for a in (-1, 0, 1):
                for b in (-1, 0, 1):
                    ni = i + a
                    nj = j + b
                    if 0 <= ni < H and 0 <= nj < W:
                        if S[ni][nj] == '#':
                            count += 1
            S[i][j] = str(count)
        print(S[i][j], end='')
    print()

