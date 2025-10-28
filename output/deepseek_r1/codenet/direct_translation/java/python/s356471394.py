
N, M, D = map(int, input().split())
grid = [input().strip() for _ in range(N)]
num = 0

if M >= D:
    for row in grid:
        for j in range(M - D + 1):
            if all(c == '.' for c in row[j:j+D]):
                num += 1

if N >= D:
    for j in range(M):
        for i in range(N - D + 1):
            valid = True
            for k in range(D):
                if grid[i + k][j] != '.':
                    valid = False
                    break
            if valid:
                num += 1

print(num)

