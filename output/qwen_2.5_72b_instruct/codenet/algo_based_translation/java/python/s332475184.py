
import sys
from collections import defaultdict, deque

class FastScanner:
    def __init__(self):
        self.buffer = []
        self.input = sys.stdin.read().split()

    def hasNext(self):
        return len(self.input) > 0

    def next(self):
        return self.input.pop(0)

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return int(self.next())

    def nextDouble(self):
        return float(self.next())

def dfs(v, par, val, graph, counter):
    for i in graph[v]:
        if i != par:
            dfs(i, v, val + counter[v], graph, counter)
    counter[v] += val

def main():
    fs = FastScanner()
    n = fs.nextInt()
    q = fs.nextInt()
    graph = defaultdict(list)
    counter = [0] * n

    for _ in range(n - 1):
        a = fs.nextInt() - 1
        b = fs.nextInt() - 1
        graph[a].append(b)
        graph[b].append(a)

    for _ in range(q):
        node_index = fs.nextInt() - 1
        value = fs.nextInt()
        counter[node_index] += value

    dfs(0, -1, 0, graph, counter)
    print(" ".join(map(str, counter)))

if __name__ == "__main__":
    main()

