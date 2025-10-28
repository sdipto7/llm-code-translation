
import sys

class Edge:
    def __init__(self, id, to):
        self.id = id
        self.to = to

def main():
    input = sys.stdin.read().split()
    ptr = 0
    n = int(input[ptr])
    ptr += 1
    
    g = [[] for _ in range(n)]
    for i in range(n-1):
        a = int(input[ptr])-1
        ptr += 1
        b = int(input[ptr])-1
        ptr += 1
        g[a].append(Edge(i, b))
        g[b].append(Edge(i, a))
    
    ans = [0] * (n-1)
    
    def dfs(to, color, parent):
        k = 1
        for e in g[to]:
            if e.to == parent:
                continue
            if k == color:
                k += 1
            ans[e.id] = k
            dfs(e.to, k, to)
            k += 1
    
    dfs(0, -1, -1)
    
    print(max(ans))
    for c in ans:
        print(c)

if __name__ == "__main__":
    main()

