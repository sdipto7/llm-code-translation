
import sys
from collections import deque

def main():
    n, q = map(int, sys.stdin.readline().split())
    graph = [[] for _ in range(n)]
    for _ in range(n - 1):
        a, b = map(int, sys.stdin.readline().split())
        a -= 1
        b -= 1
        graph[a].append(b)
        graph[b].append(a)
    
    counter = [0] * n
    for _ in range(q):
        p, x = map(int, sys.stdin.readline().split())
        counter[p - 1] += x
    
    def dfs(v, parent, val):
        for neighbor in graph[v]:
            if neighbor != parent:
                dfs(neighbor, v, val + counter[v])
        counter[v] += val
    
    dfs(0, -1, 0)
    print(' '.join(map(str, counter)))

if __name__ == "__main__":
    main()

