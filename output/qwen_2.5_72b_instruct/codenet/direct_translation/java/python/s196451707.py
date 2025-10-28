
import queue
import sys

n = int(input().strip())
g = [[0] * (n + 1) for _ in range(n + 1)]

for _ in range(n):
    u, k = map(int, input().strip().split())
    for _ in range(k):
        v = int(input().strip())
        g[u][v] = 1

d = [-1] * (n + 1)
d[1] = 0
que = queue.Queue()
que.put(1)

while not que.empty():
    top = que.get()
    for j in range(1, n + 1):
        if g[top][j] == 1 and d[j] == -1:
            que.put(j)
            d[j] = d[top] + 1

for i in range(1, n + 1):
    print(i, d[i])

