
import sys
from collections import defaultdict, deque

class FastScanner:
    def __init__(self):
        self.input = sys.stdin.read
        self.data = self.input().split()
        self.index = 0

    def next(self):
        result = self.data[self.index]
        self.index += 1
        return result

    def next_int(self):
        return int(self.next())

def dfs(v, par, val, graph, counter):
    for i in graph[v]:
        if i != par:
            dfs(i, v, val + counter[v], graph, counter)
    counter[v] += val

def main():
    fs = FastScanner()
    n = fs.next_int()
    q = fs.next_int()
    
    graph = defaultdict(list)
    counter = [0] * n

    for _ in range(n-1):
        a = fs.next_int() - 1
        b = fs.next_int() - 1
        graph[a].append(b)
        graph[b].append(a)

    for _ in range(q):
        p = fs.next_int() - 1
        x = fs.next_int()
        counter[p] += x

    dfs(0, -1, 0, graph, counter)

    print(" ".join(map(str, counter)))

if __name__ == "__main__":
    main()

