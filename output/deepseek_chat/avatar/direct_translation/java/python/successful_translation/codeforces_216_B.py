
from collections import defaultdict

def dfs(child, par, seen, graph, count):
    if seen[child]:
        return True
    seen[child] = True
    for i in graph[child]:
        if i != par:
            count[0] += 1
            if dfs(i, child, seen, graph, count):
                return True
    return False

def main():
    m, n = map(int, input().split())
    graph = defaultdict(list)
    seen = [False] * (m + 1)
    for _ in range(n):
        x, y = map(int, input().split())
        graph[x].append(y)
        graph[y].append(x)
    toremove = 0
    for i in range(1, m + 1):
        if not seen[i]:
            count = [0]
            if dfs(i, 0, seen, graph, count):
                if count[0] % 2 == 1:
                    toremove += 1
    if (m - toremove) % 2 == 1:
        toremove += 1
    print(toremove)

if __name__ == "__main__":
    main()

