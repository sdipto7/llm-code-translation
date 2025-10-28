
from collections import deque

class Node:
    def __init__(self, i):
        self.pattern = 0
        self.index = i
        self.children = deque()
        self.parent = -1

    def setParent(self, K, parent, use, nodes):
        self.pattern = K - use
        self.parent = parent
        count = 1
        if parent != -1:
            count += 1
        for n in self.children:
            if n == self.parent:
                continue
            nodes[n].setParent(K, self.index, count, nodes)
            count += 1

class atcoder_ABC133_E:
    def solve(self):
        import sys
        input = sys.stdin.read().split()
        N = int(input[0])
        K = int(input[1])
        nodes = [Node(i) for i in range(N)]
        index = 2
        for i in range(N - 1):
            a = int(input[index]) - 1
            b = int(input[index + 1]) - 1
            nodes[a].children.append(b)
            nodes[b].children.append(a)
            index += 2
        nodes[0].setParent(K, -1, 0, nodes)
        patterns = 1
        for i in range(N):
            patterns = (patterns * nodes[i].pattern) % 1_000_000_007
        print(patterns)

if __name__ == "__main__":
    main = atcoder_ABC133_E()
    main.solve()

