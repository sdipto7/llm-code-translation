
import sys
from collections import deque, defaultdict

sys.setrecursionlimit(10**6)
input = sys.stdin.read
data = input().split()

n = int(data[0])
q = int(data[1])
graph = defaultdict(list)
counter = [0] * n
index = 2

for _ in range(n - 1):
    a = int(data[index]) - 1
    b = int(data[index + 1]) - 1
    graph[a].append(b)
    graph[b].append(a)
    index += 2

for _ in range(q):
    p = int(data[index]) - 1
    x = int(data[index + 1])
    counter[p] += x
    index += 2

def dfs(v, par, val):
    for i in graph[v]:
        if i != par:
            dfs(i, v, val + counter[v])
    counter[v] += val

dfs(0, -1, 0)
print(' '.join(map(str, counter)))

