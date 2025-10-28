
import sys
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

def main():
    data = sys.stdin.read().split()
    idx = 0
    N = int(data[idx]); idx += 1
    K = int(data[idx]); idx += 1
    
    nodes = [None] * N
    for i in range(N):
        nodes[i] = Node(i)
    
    for i in range(N - 1):
        a = int(data[idx]) - 1; idx += 1
        b = int(data[idx]) - 1; idx += 1
        nodes[a].children.append(b)
        nodes[b].children.append(a)
    
    nodes[0].setParent(K, -1, 0, nodes)
    
    patterns = 1
    MOD = 1000000007
    for i in range(N):
        patterns = (patterns * nodes[i].pattern) % MOD
    
    print(patterns)

if __name__ == "__main__":
    main()

