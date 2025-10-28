
from collections import deque

n = int(input())
g = [[0] * (n + 1) for _ in range(n + 1)]

for _ in range(n):
    data = list(map(int, input().split()))
    u = data[0]
    k = data[1]
    vs = data[2:2 + k]
    for v in vs:
        g[u][v] = 1

d = [-1] * (n + 1)
q = deque([1])
d[1] = 0

while q:
    top = q.popleft()
    for j in range(1, n + 1):
        if g[top][j] == 1 and d[j] == -1:
            d[j] = d[top] + 1
            q.append(j)

for i in range(1, n + 1):
    print(i, d[i])

