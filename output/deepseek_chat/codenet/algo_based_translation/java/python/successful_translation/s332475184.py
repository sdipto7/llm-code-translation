
import sys
from collections import deque

counter = []
graph = []

def main():
    global counter, graph
    data = sys.stdin.read().split()
    it = iter(data)
    n = int(next(it))
    q = int(next(it))
    
    graph = [[] for _ in range(n)]
    counter = [0] * n
    
    for _ in range(n - 1):
        a = int(next(it)) - 1
        b = int(next(it)) - 1
        graph[a].append(b)
        graph[b].append(a)
    
    for _ in range(q):
        p = int(next(it)) - 1
        v = int(next(it))
        counter[p] += v
    
    dfs(0, -1, 0)
    
    result = []
    for i in range(n):
        result.append(str(counter[i]))
    
    print(" ".join(result))

def dfs(v, par, val):
    global counter, graph
    for i in graph[v]:
        if i != par:
            dfs(i, v, val + counter[v])
    counter[v] += val

if __name__ == "__main__":
    main()

