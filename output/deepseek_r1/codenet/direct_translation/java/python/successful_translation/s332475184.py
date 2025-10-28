
import sys
sys.setrecursionlimit(1 << 25)

def main():
    data = list(map(int, sys.stdin.read().split()))
    ptr = 0
    n = data[ptr]
    ptr += 1
    q = data[ptr]
    ptr += 1
    graph = [[] for _ in range(n)]
    for _ in range(n-1):
        a = data[ptr] - 1
        ptr += 1
        b = data[ptr] - 1
        ptr += 1
        graph[a].append(b)
        graph[b].append(a)
    counter = [0] * n
    for _ in range(q):
        p = data[ptr] - 1
        ptr += 1
        x = data[ptr]
        ptr += 1
        counter[p] += x
    def dfs(v, parent, val):
        for u in graph[v]:
            if u != parent:
                dfs(u, v, val + counter[v])
        counter[v] += val
    dfs(0, -1, 0)
    print(' '.join(map(str, counter)))

if __name__ == '__main__':
    main()

