
import sys
from collections import defaultdict

class AtcoderAGC029C:
    def __init__(self):
        self.n = 0
        self.a = []
        self.s = defaultdict(int)

    def set(self):
        self.n = int(sys.stdin.readline().strip())
        self.a = list(map(int, sys.stdin.readline().strip().split()))
        self.s.clear()

    def solve(self):
        self.set()
        ng = 0
        ok = self.n
        while ok - ng > 1:
            k = (ng + ok) // 2
            if self.isPossible(k):
                ok = k
            else:
                ng = k
        print(ok)

    def isPossible(self, k):
        self.s.clear()
        current = 0
        for ai in self.a:
            if ai <= current:
                if k == 1:
                    return False
                while self.s and max(self.s) >= ai:
                    self.s.pop(max(self.s))
                p = ai - 1
                while True:
                    if p < 0:
                        return False
                    self.s[p] += 1
                    if self.s[p] == k:
                        del self.s[p]
                        p -= 1
                    else:
                        break
            current = ai
        return True

if __name__ == "__main__":
    m = AtcoderAGC029C()
    m.solve()

