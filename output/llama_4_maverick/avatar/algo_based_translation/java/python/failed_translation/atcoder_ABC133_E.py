
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

def main():
    N, K = map(int, input().split())
    nodes = [Node(i) for i in range(N)]
    for _ in range(N-1):
        a, b = map(int, input().split())
        a -= 1
        b -= 1
        nodes[a].children.append(b)
        nodes[b].children.append(a)
    nodes[0].set_parent(K, -1, 0, nodes)
    patterns = 1
    MOD = 1000000007
    for i in range(N):
        patterns = (patterns * nodes[i].pattern) % MOD
    print(patterns)

if __name__ == "__main__":
    main()

