
class Node:
    def __init__(self, index):
        self.index = index
        self.children = []
        self.parent = -1
        self.pattern = 0

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

def main():
    import sys
    input = sys.stdin.read().split()
    ptr = 0
    N = int(input[ptr])
    ptr += 1
    K = int(input[ptr])
    ptr += 1
    nodes = [Node(i) for i in range(N)]
    for _ in range
