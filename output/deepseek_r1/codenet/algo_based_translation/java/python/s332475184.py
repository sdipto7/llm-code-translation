
import sys
sys.setrecursionlimit(1 << 25)

def main():
    data = list(map(int, sys.stdin.read().split()))
    ptr = 0
    n = data[ptr]
    ptr += 1
    q = data[ptr]
    ptr += 1

    global graph, counter
    graph = [[] for _ in range(n)]
    counter = [0] * n

    for _ in range(n - 1):
        a = data[ptr] - 1
        ptr += 1
        b = data[ptr] - 1
        ptr += 1
        graph[a].append(b)
        graph[b].append(a)

    for _ in range(q):
        p = data[ptr] - 1
        ptr += 1
        x = data[ptr]
        ptr += 1
        counter[p] += x

    dfs(0, -1, 0)

    print(' '.join(map(str, counter)))

def dfs(v, par, val):
    global graph, counter
    for u in graph[v]:
        if u != par:
            dfs(u, v, val + counter[v])
    counter[v] += val

if __name__ == '__main__':
    main()

