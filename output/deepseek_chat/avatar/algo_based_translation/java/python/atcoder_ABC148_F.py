
import sys
from collections import deque

def dfs(u, d, edges):
    for nu in edges[u]:
        if d[nu] == float('inf'):
            d[nu] = d[u] + 1
            dfs(nu, d, edges)

def main():
    data = sys.stdin.read().split()
    it = iter(data)
    N = int(next(it))
    u = int(next(it)) - 1
    v = int(next(it)) - 1
    
    edges = [[] for _ in range(N)]
    
    for i in range(N - 1):
        a = int(next(it)) - 1
        b = int(next(it)) - 1
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
        if d[i] < e[i]:
            if e[i] > q:
                q = e[i]
    
    if q <= 0:
        print(0)
    else:
        print(q - 1)

if __name__ == '__main__':
    main()

