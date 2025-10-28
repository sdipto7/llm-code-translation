
import sys
from collections import defaultdict, deque

class AtCoderAGC035B:
    def __init__(self):
        self.connect = []
        self.visited = []
        self.odd = []
        self.print = []

    def main(self):
        sc = sys.stdin
        numNode, numEdge = map(int, sc.readline().split())
        
        self.connect = [list() for _ in range(numNode)]

        for _ in range(numEdge):
            a, b = map(int, sc.readline().split())
            a -= 1
            b -= 1
            self.connect[a].append(b)
            self.connect[b].append(a)

        if numEdge % 2 != 0:
            print(-1)
            return

        self.visited = [0] * numNode
        self.odd = [False] * numNode
        self.print = []

        self.dfs(0, -1)

        for line in self.print:
            print(line)

    def dfs(self, crt, parent):
        self.visited[crt] = 1
        crtConnect = self.connect[crt]

        for child in crtConnect:
            if child == parent or self.visited[child] == 1:
                continue
            elif self.visited[child] == 2:
                self.print.append(f"{crt + 1} {child + 1}")
                self.odd[crt] = not self.odd[crt]
            else:
                self.dfs(child, crt)
                if self.odd[child]:
                    self.print.append(f"{child + 1} {crt + 1}")
                    self.odd[child] = not self.odd[child]
                else:
                    self.print.append(f"{crt + 1} {child + 1}")
                    self.odd[crt] = not self.odd[crt]

        self.visited[crt] = 2

if __name__ == "__main__":
    solution = AtCoderAGC035B()
    solution.main()

