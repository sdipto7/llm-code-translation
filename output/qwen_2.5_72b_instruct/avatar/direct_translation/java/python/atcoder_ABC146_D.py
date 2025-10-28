
import sys
from collections import defaultdict

n = int(input().strip())
g = defaultdict(list)
ans = [0] * (n - 1)

for _ in range(n - 1):
    a, b = map(int, input().strip().split())
    g[a - 1].append((b - 1, _))
    g[b - 1].append((a - 1, _))

def dfs(to, color, parents):
    k = 1
    for nei, edge_id in g[to]:
        if nei == parents:
            continue
        if k == color:
            k += 1
        ans[edge_id] = k
        dfs(nei, k, to)
        k += 1

dfs(0, -1, -1)
print(max(ans))
for c in ans:
    print(c)

