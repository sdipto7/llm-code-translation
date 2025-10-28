
def dfs(u, d, edges):
    for nu in edges[u]:
        if d[nu] == float('inf'):
            d[nu] = d[u] + 1
            dfs(nu, d, edges)

N, u, v = map(int, input().split())
u -= 1
v -= 1
edges = [[] for _ in range(N)]
for _ in range(N - 1):
    a, b = map(int, input().split())
    a -= 1
    b -= 1
    edges[a].append(b)
    edges[b].append(a)

d = [float('inf')] * N
d[u] = 0
dfs(u, d, edges)

e = [float('inf')] * N
e[v] = 0
dfs(v, e, edges)

max_e = -1
for i in range(N):
    if d[i] < e[i] and e[i] > max_e:
        max_e = e[i]

print(max_e - 1 if max_e > 0 else 0)

