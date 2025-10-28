
import sys
from collections import deque

tokens = list(map(int, sys.stdin.read().split()))
n = tokens[0]
ptr = 1

g = [[0] * (n + 1) for _ in range(n + 1)]

for _ in range(n):
    u = tokens[ptr]
    k = tokens[ptr + 1]
    ptr += 2
    for __ in range(k):
        v = tokens[ptr]
        ptr += 1
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

