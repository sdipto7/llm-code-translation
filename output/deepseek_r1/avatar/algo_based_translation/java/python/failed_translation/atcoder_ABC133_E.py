
class Node:
    def __init__(self, index):
        self.pattern = 0
        self.index = index
        self.children = []
        self.parent = -1

    def set_parent(self, K, parent, use, nodes):
        self.pattern = K - use
        self.parent = parent
        count = 1
        if parent != -1:
            count += 1
        for n in self.children:
            if n == parent:
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
    for _ in range(N-1):
        a = int(input[ptr])-1
        ptr += 1
        b = int(input[ptr])-1
        ptr += 1
        nodes[a].children.append(b)
        nodes[b].children.append(a)
    nodes[0].set_parent(K, -1, 0, nodes)
    MOD = 10**9 + 7
    result = 1
    for node in nodes:
        result = (result * node.pattern) % MOD
    print(result)

if __name__ == "__main__":
    main()

