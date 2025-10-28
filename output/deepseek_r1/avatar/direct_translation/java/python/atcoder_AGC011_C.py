
import sys
sys.setrecursionlimit(1 << 25)

def main():
    n, m = map(int, sys.stdin.readline().split())
    graph = [[] for _ in range(n)]
    for _ in range(m):
        u, v = map(int, sys.stdin.readline().split())
        u -= 1
        v -= 1
        graph[u].append(v)
        graph[v].append(u)
    visited = [False] * n
    color = [-1] * n
    one = 0
    bipartite = 0
    count = 0

    def dfs(a, c, mujun_flag):
        if visited[a]:
            if color[a] != -1 and color[a] != c:
                mujun_flag[0] = True
            return 0
        visited[a] = True
        color[a] = c
        total = 1
        for b in graph[a]:
            total += dfs(b, 1 - c, mujun_flag)
        return total

    for i in range(n):
        if visited[i]:
            continue
        count += 1
        mujun_flag = [False]
        kind = dfs(i, 0, mujun_flag)
        if kind == 1:
            one += 1
        elif not mujun_flag[0]:
            bipartite += 1

    total = one * (2 * n - one) + (count - one) * (count - one) + bipartite * bipartite
    print(total)

if __name__ == "__main__":
    main()

