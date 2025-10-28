import sys
from collections import defaultdict

class Main:
    def __init__(self):
        self.graph = defaultdict(list)
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
        import sys
        input = sys.stdin.read().split()
        index = 0
        n = int(input[index])
        m = int(input[index + 1])
        index += 2
        for _ in range(m):
            u = int(input[index]) - 1
            v = int(input[index + 1]) - 1
            index += 2
            self.graph[u].append(v)
            self.graph[v].append(u)
        self.visited = [False] * n
        self.color = [-1] * n
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

if __name__ == "__main__":
    main_instance = Main()
    main_instance.run()
