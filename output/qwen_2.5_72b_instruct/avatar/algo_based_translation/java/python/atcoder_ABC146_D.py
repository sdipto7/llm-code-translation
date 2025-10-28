
from collections import defaultdict

class Edge:
    def __init__(self, id, to):
        self.id = id
        self.to = to

def dfs(to, color, parents, g, ans):
    k = 1
    for e in g[to]:
        if e.to == parents:
            continue
        if k == color:
            k += 1
        ans[e.id] = k
        dfs(e.to, k, to, g, ans)
        k += 1

def main():
    import sys
    input = sys.stdin.read().split()
    n = int(input[0])
    g = defaultdict(list)
    index = 1
    for _ in range(n - 1):
        a = int(input[index]) - 1
        b = int(input[index + 1]) - 1
        g[a].append(Edge(index // 2, b))
        g[b].append(Edge(index // 2, a))
        index += 2
    ans = [0] * (n - 1)
    dfs(0, -1, -1, g, ans)
    max_value = max(ans)
    print(max_value)
    for c in ans:
        print(c)

if __name__ == "__main__":
    main()

