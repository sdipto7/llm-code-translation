
import sys
from collections import defaultdict, deque

class MyScanner:
    def __init__(self):
        self.br = sys.stdin

    def next(self):
        if not hasattr(self, 'st') or not self.st:
            self.st = self.br.readline().split()
        return self.st.pop(0)

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return int(self.next())

    def next_double(self):
        return float(self.next())

    def next_line(self):
        return self.br.readline().strip()

def max_matching(v, p, g):
    a = o = 0
    for w in g[v]:
        if w == p:
            continue
        r = max_matching(w, v, g)
        a += r // 2
        o += r % 2
    return 2 * a + min(1, o) + 1

def main():
    sc = MyScanner()
    n = sc.next_int()
    g = [[] for _ in range(n)]
    for _ in range(n - 1):
        a = sc.next_int() - 1
        b = sc.next_int() - 1
        g[a].append(b)
        g[b].append(a)
    m = max_matching(0, -1, g) // 2
    print('Second' if 2 * m == n else 'First')

if __name__ == "__main__":
    main()

