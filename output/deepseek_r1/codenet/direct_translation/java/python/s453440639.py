H, W = map(int, input().split())
S = [list(input().strip()) for _ in range(H)]

for i in range(H):
    for j in range(W):
        if S[i][j] == '.':
            count = 0
            for a in (-1, 0, 1):
                for b in (-1, 0, 1):
                    ni = i + a
                    nj = j + b
                    if 0 <= ni < H and 0 <= nj < W and S[ni][nj] == '#':
                        count += 1
            S[i][j] = str(count)
        print(S[i][j], end='')
    print()
