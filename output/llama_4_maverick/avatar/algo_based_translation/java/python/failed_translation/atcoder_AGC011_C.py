
from collections import defaultdict

def dfs(graph, visited, color, node, c):
    if visited[node]:
        if color[node] != c:
            return float('inf'), False
        return 0, True
    visited[node] = True
    color[node] = c
    count = 1
    is_bipartite = True
    for neighbor in graph[node]:
        count_neighbor, is_bipartite_neighbor = dfs(graph, visited, color, neighbor, 1 - c)
        if count_neighbor == float('inf'):
            return float('inf'), False
        count += count_neighbor
        is_bipartite = is_bipartite and is_bipartite_neighbor
    return count, is_bipartite

def main():
    n, m = map(int, input().split())
    graph = defaultdict(list)
    for _ in range(m):
        u, v = map(int, input().split())
        graph[u - 1].append(v - 1)
        graph[v - 1].append(u - 1)
    visited = [False] * n
    color = [-1] * n
    one = 0
    bipartite = 0
    count = 0
    for i in range(n):
        if visited[i]:
            continue
        count += 1
        total, is_bipartite = dfs(graph, visited, color, i, 0)
        if total == 1:
            one += 1
        elif is_bipartite:
            bipartite += 1
    total_result = one * (2 * n - one)
    total_result += (count - one) ** 2
    total_result += bipartite ** 2
    print(total_result)

if __name__ == "__main__":
    main()

