
import sys
from collections import deque

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
    
    def bfs(start, dist):
        q = deque()
        q.append(start)
        dist[start] = 0
        while q:
            node = q.popleft()
            for neighbor in edges[node]:
                if dist[neighbor] == float('inf'):
                    dist[neighbor] = dist[node] + 1
                    q.append(neighbor)
    
    dist_u = [float('inf')] * N
    dist_v = [float('inf')] * N
    bfs(u, dist_u)
    bfs(v, dist_v)
    
    max_dist = 0
    for i in range(N):
        if dist_u[i] < dist_v[i]:
            max_dist = max(max_dist, dist_v[i])
    
    print(max_dist - 1 if max_dist > 0 else 0)

if __name__ == "__main__":
    main()

