
import sys
from collections import deque

def max_matching(v, p, g):
    a = 0
    o = 0
    for w in g[v]:
        if w == p:
            continue
        r = max_matching(w, v, g)
        a += r // 2
        o += r % 2
    return 2 * a + min(1, o) + 1

def main():
    data = sys.stdin.read().split()
    if not data:
        return
    
    n = int(data[0])
    g = [[] for _ in range(n)]
    index = 1
    
    for i in range(n - 1):
        a = int(data[index]) - 1
        b = int(data[index + 1]) - 1
        index += 2
        g[a].append(b)
        g[b].append(a)
    
    m = max_matching(0, -1, g) // 2
    if 2 * m == n:
        print("Second")
    else:
        print("First")

if __name__ == "__main__":
    main()

