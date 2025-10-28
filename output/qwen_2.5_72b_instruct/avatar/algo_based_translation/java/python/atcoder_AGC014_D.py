
import sys
from collections import defaultdict

def maxMatching(v, p):
    a = 0
    o = 0
    for w in g[v]:
        if w == p:
            continue
        r = maxMatching(w, v)
        a += r // 2
        o += r % 2
    return 2 * a + min(1, o) + 1

def main():
    import sys
    import sys
    from sys import stdin
    import sys
    import sys
    
    input = sys.stdin.read().split()
    index = 0
    
    def next():
        nonlocal index
        result = input[index]
        index += 1
        return result
    
    def nextInt():
        return int(next())
    
    n = nextInt()
    g = defaultdict(list)
    for _ in range(n - 1):
        a = nextInt() - 1
        b = nextInt() - 1
        g[a].append(b)
        g[b].append(a)
    
    m = maxMatching(0, -1) // 2
    if 2 * m == n:
        print("Second")
    else:
        print("First")

if __name__ == "__main__":
    main()

