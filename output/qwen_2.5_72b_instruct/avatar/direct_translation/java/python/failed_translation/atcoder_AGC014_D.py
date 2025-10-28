
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
    input = sys.stdin.read().split()
    idx = 0
    
    n = int(input[idx])
    idx += 1
    g = defaultdict(list)
    for i in range(n - 1):
        a = int(input[idx]) - 1
        b = int(input[idx + 1]) - 1
        idx += 2
        g[a].append(b)
        g[b].append(a)
    m = maxMatching(0, -1) // 2
    print("Second" if 2 * m == n else "First")

if __name__ == "__main__":
    main()

