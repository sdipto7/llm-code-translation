
from collections import defaultdict, deque

def dfs(u, d, edges):
    stack = deque([u])
    while stack:
        node = stack.pop()
        for nu in edges[node]:
            if d[nu] == float('inf'):
                d[nu] = d[node] + 1
                stack.append(nu)

def main():
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
    q = -1
    for i in range(N):
        if d[i] < e[i] and e[i] > q:
            q = e[i]
    if q <= 0:
        print(0)
    else:
        print(q - 1)

if __name__ == "__main__":
    main()

