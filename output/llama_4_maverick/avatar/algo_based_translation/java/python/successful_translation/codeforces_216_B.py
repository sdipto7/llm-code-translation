
from collections import defaultdict

def dfs(graph, seen, node, parent, count):
    if seen[node]:
        return 1
    seen[node] = True
    for neighbor in graph[node]:
        if neighbor != parent:
            count[0] += 1
            if dfs(graph, seen, neighbor, node, count) == 1:
                return 1
    return 0

def main():
    m, n = map(int, input().split())
    graph = defaultdict(list)
    for _ in range(n):
        x, y = map(int, input().split())
        graph[x].append(y)
        graph[y].append(x)

    seen = [False] * (m + 1)
    toremove = 0
    for i in range(1, m + 1):
        if not seen[i]:
            count = [0]
            if dfs(graph, seen, i, 0, count) == 1:
                if count[0] % 2 == 1:
                    toremove += 1
    if (m - toremove) % 2 == 1:
        toremove += 1
    print(toremove)

if __name__ == "__main__":
    main()

