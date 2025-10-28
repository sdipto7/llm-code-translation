
from sys import stdin, stdout
from collections import defaultdict

def maxMatching(v, p, g):
    a = 0
    o = 0
    for w in g[v]:
        if w == p:
            continue
        r = maxMatching(w, v, g)
        a += r // 2
        o += r % 2
    return 2 * a + min(1, o) + 1

def main():
    n = int(stdin.readline().strip())
    g = defaultdict(list)
    for _ in range(n - 1):
        a, b = map(int, stdin.readline().strip().split())
        a -= 1
        b -= 1
        g[a].append(b)
        g[b].append(a)
    m = maxMatching(0, -1, g) // 2
    if 2 * m == n:
        stdout.write("Second\n")
    else:
        stdout.write("First\n")

if __name__ == "__main__":
    main()

