
import sys
from collections import deque

sys.setrecursionlimit(300000)

class Main:
    def __init__(self):
        self.graph = []
        self.visited = []
        self.color = []
        self.one = 0
        self.bipartite = 0
        self.count = 0
        self.mujun = False

    def dfs(self, a, c):
        if self.visited[a]:
            if self.color[a] >= 0 and self.color[a] != c:
                self.mujun = True
            return 0
        self.visited[a] = True
        self.color[a] = c
        total = 1
        for b in self.graph[a]:
            total += self.dfs(b, 1 - c)
        return total

    def run(self):
        data = sys.stdin.read().split()
        it = iter(data)
        n = int(next(it)); m = int(next(it))
        self.graph = [[] for _ in range(n)]
        for _ in range(m):
            u = int(next(it)) - 1
            v = int(next(it)) - 1
            self.graph[u].append(v)
            self.graph[v].append(u)
        self.visited = [False] * n
        self.color = [-1] * n
        self.one = 0
        self.bipartite = 0
        self.count = 0
        for i in range(n):
            if self.visited[i]:
                continue
            self.count += 1
            self.mujun = False
            kind = self.dfs(i, 0)
            if kind == 1:
                self.one += 1
            elif not self.mujun:
                self.bipartite += 1
        total = self.one * (2 * n - self.one)
        total += (self.count - self.one) * (self.count - self.one)
        total += self.bipartite * self.bipartite
        print(total)

if __name__ == '__main__':
    main_obj = Main()
    main_obj.run()

