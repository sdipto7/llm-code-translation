
from collections import defaultdict, deque

class Edge:
    def __init__(self, id, to):
        self.id = id
        self.to = to

def dfs(g, to, color, parents, ans):
    k = 1
    for e in g[to]:
        if e.to == parents:
            continue
        if k == color:
            k += 1
        ans[e.id] = k
        dfs(g, e.to, k, to, ans)
        k += 1

def main():
    n = int(input())
    g = [[] for _ in range(n)]
    for i in range(n - 1):
        a, b = map(int, input().split())
        a -= 1
        b -= 1
        g[a].append(Edge(i, b))
        g[b].append(Edge(i, a))
    ans = [0] * (n - 1)
    dfs(g, 0, -1, -1, ans)
    max_val = max(ans)
    print(max_val)
    for c in ans:
        print(c)

if __name__ == "__main__":
    main()

