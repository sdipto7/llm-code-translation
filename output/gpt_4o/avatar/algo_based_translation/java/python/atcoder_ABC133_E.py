
from sys import stdin
from collections import deque

class AtcoderABC133E:

    class Node:
        def __init__(self, i):
            self.pattern = 0
            self.index = i
            self.children = []
            self.parent = -1

        def set_parent(self, K, parent, use, nodes):
            self.pattern = K - use
            self.parent = parent
            count = 1
            if parent != -1:
                count += 1
            for n in self.children:
                if n == self.parent:
                    continue
                nodes[n].set_parent(K, self.index, count, nodes)
                count += 1

    def solve(self):
        input = stdin.read
        data = input().split()
        idx = 0
        N = int(data[idx])
        idx += 1
        K = int(data[idx])
        idx += 1
        
        nodes = [self.Node(i) for i in range(N)]

        for _ in range(N - 1):
            a = int(data[idx]) - 1
            idx += 1
            b = int(data[idx]) - 1
            idx += 1
            nodes[a].children.append(b)
            nodes[b].children.append(a)

        nodes[0].set_parent(K, -1, 0, nodes)

        patterns = 1
        mod = 1_000_000_007
        for i in range(N):
            patterns = (patterns * nodes[i].pattern) % mod

        print(patterns)

if __name__ == '__main__':
    main = AtcoderABC133E()
    main.solve()

