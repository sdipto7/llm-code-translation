
import sys
sys.setrecursionlimit(1 << 25)

def main():
    N, u, v = map(int, sys.stdin.readline().split())
    u -= 1
    v -= 1
    edges = [[] for _ in range(N)]
    for _ in range(N-1):
        a, b = map(int, sys.stdin.readline().split())
        a -= 1
        b -= 1
        edges[a].append(b)
        edges[b].append(a)
    
    def dfs(node, dist, edges):
        for neighbor in edges[node]:
            if dist[neighbor] == float('inf'):
                dist[neighbor] = dist[node] + 1
                dfs(neighbor, dist, edges)
    
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
    
    print(0 if max_e <= 0 else max_e - 1)

if __name__ == "__main__":
    main()

