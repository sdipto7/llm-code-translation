import sys

in = sys.stdin
out = sys.stdout

n, m = map(int, in.readline().split())
A = [list(map(int, in.readline().split())) for _ in range(n)]
b = list(map(int, in.readline().split()))

for i in range(n):
    c = 0
    for j in range(m):
        c += A[i][j] * b[j]
    out.write(f"{c}\n")

out.flush()
