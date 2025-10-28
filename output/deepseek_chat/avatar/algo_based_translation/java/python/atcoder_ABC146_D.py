
import sys
from collections import deque

sys.setrecursionlimit(300000)

class Edge:
    def __init__(self, id, to):
        self.id = id
        self.to = to

def main():
    data = sys.stdin.read().split()
    if not data:
        return
    
    n = int(data[0])
    g = [[] for _ in range(n)]
    index = 1
    
    for i in range(n - 1):
        a = int(data[index]) - 1
        b = int(data[index + 1]) - 1
        index += 2
        g[a].append(Edge(i, b))
        g[b].append(Edge(i, a))
    
    ans = [0] * (n - 1)
    
    def dfs(to, color, parents):
        k = 1
        for e in g[to]:
            if e.to == parents:
                continue
            if k == color:
                k += 1
            ans[e.id] = k
            dfs(e.to, k, to)
            k += 1
    
    dfs(0, -1, -1)
    
    max_val = 0
    for temp in ans:
        if temp > max_val:
            max_val = temp
    
    print(max_val)
    for c in ans:
        print(c)

if __name__ == "__main__":
    main()

