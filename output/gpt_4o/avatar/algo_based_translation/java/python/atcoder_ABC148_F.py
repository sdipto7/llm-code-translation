
import sys
from collections import deque

def dfs(u, d, edges):
    for nu in edges[u]:
        if d[nu] == float('inf'):
            d[nu] = d[u] + 1
            dfs(nu, d, edges)

def main():
    input = sys.stdin.read
    data = input().split()
    
    N = int(data[0])
    u = int(data[1]) - 1
    v = int(data[2]) - 1
    
    edges = [[] for _ in range(N)]
    index = 3
    for _ in range(N - 1):
        a = int(data[index]) - 1
        b = int(data[index + 1]) - 1
        index += 2
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

if __name__ == "__main__":
    main()

