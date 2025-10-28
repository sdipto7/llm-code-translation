
import sys
from collections import defaultdict
from io import StringIO

class MyScanner:
    def __init__(self):
        self.input = sys.stdin.read
        self.data = None
        self.index = 0
    
    def next(self):
        if self.data is None or self.index >= len(self.data):
            self.data = self.input().split()
            self.index = 0
        result = self.data[self.index]
        self.index += 1
        return result
    
    def nextInt(self):
        return int(self.next())
    
    def nextLong(self):
        return int(self.next())
    
    def nextDouble(self):
        return float(self.next())
    
    def nextLine(self):
        return self.input().strip()

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
    sc = MyScanner()
    sys.stdout = StringIO()
    out = sys.stdout

    n = sc.nextInt()
    g = defaultdict(list)
    
    for _ in range(n - 1):
        a = sc.nextInt() - 1
        b = sc.nextInt() - 1
        g[a].append(b)
        g[b].append(a)

    m = maxMatching(0, -1, g) // 2
    if 2 * m == n:
        print("Second", file=out)
    else:
        print("First", file=out)
    
    sys.stdout = sys.__stdout__
    print(out.getvalue().strip())

if __name__ == "__main__":
    main()

