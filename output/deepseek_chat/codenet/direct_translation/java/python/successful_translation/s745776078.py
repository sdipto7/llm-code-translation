
n, m = map(int, input().split())
A = [list(map(int, input().split())) for _ in range(n)]
b = [int(input()) for _ in range(m)]
for i in range(n):
    c = 0
    for j in range(m):
        c += A[i][j] * b[j]
    print(c)

