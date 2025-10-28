
h, w, k = map(int, input().split())
grid = [input().strip() for _ in range(h)]

ans = 0

for h_pat in range(1 << h):
    for w_pat in range(1 << w):
        cnt = 0
        for i in range(h):
            if (h_pat >> i) & 1:
                continue
            for j in range(w):
                if (w_pat >> j) & 1:
                    continue
                if grid[i][j] == '#':
                    cnt += 1
        if cnt == k:
            ans += 1

print(ans)

