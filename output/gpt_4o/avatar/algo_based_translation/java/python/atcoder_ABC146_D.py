
from typing import List
import sys
sys.setrecursionlimit(10**6)

class Edge:
    def __init__(self, id: int, to: int):
        self.id = id
        self.to = to

class AtcoderABC146D:
    def __init__(self):
        self.n = 0
        self.g = []
        self.ans = []

    def main(self):
        import sys
        input = sys.stdin.read
        data = input().split()
        index = 0

        self.n = int(data[index])
        index += 1
        self.g = [[] for _ in range(self.n)]

        for i in range(self.n - 1):
            a = int(data[index]) - 1
            b = int(data[index + 1]) - 1
            index += 2
            self.g[a].append(Edge(i, b))
            self.g[b].append(Edge(i, a))

        self.ans = [0] * (self.n - 1)
        self.dfs(0, -1, -1)

        max_color = max(self.ans)
        print(max_color)
        for c in self.ans:
            print(c)

    def dfs(self, to: int, color: int, parents: int):
        k = 1
        for e in self.g[to]:
            if e.to == parents:
                continue
            if k == color:
                k += 1
            self.ans[e.id] = k
            self.dfs(e.to, k, to)
            k += 1

if __name__ == "__main__":
    solution = AtcoderABC146D()
    solution.main()

