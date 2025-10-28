
import sys
from collections import defaultdict, deque

def max_matching(v, p):
    a = 0
    o = 0
    for w in g[v]:
        if w == p:
            continue
        r = max_matching(w, v)
        a += r // 2
        o += r % 2
    return 2 * a + min(1, o) + 1

class MyScanner:
    def __init__(self):
        self.buffer = deque()
        
    def next(self):
        while not self.buffer:
            line = sys.stdin.readline()
            if not line:
                return None
            self.buffer.extend(line.split())
        return self.buffer.popleft()
    
    def nextInt(self):
        return int(self.next())

sys.setrecursionlimit(200000)
sc = MyScanner()
n = sc.nextInt()
g = defaultdict(list)
for _ in range(n - 1):
    a = sc.nextInt() - 1
    b = sc.nextInt() - 1
    g[a].append(b)
    g[b].append(a)

m = max_matching(0, -1) // 2
print("Second" if 2 * m == n else "First")

