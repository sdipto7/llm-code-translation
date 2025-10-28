
import sys
from collections import defaultdict
import bisect

class atcoder_AGC029_C:
    def __init__(self):
        self.n = 0
        self.a = []
        self.s = defaultdict(int)

    def set(self):
        self.n = int(sys.stdin.readline())
        self.a = list(map(int, sys.stdin.readline().split()))
        self.s = defaultdict(int)

    def solve(self):
        self.set()
        ng = 0
        ok = self.n
        while ok - ng > 1:
            k = (ng + ok) // 2
            if self.is_possible(k):
                ok = k
            else:
                ng = k
        print(ok)

    def is_possible(self, k):
        self.s.clear()
        current = 0
        for ai in self.a:
            if ai <= current:
                if k == 1:
                    return False
                while self.s and max(self.s.keys()) >= ai:
                    self.s.pop(max(self.s.keys()))
                p = ai - 1
                while True:
                    if p < 0:
                        return False
                    self.s[p] += 1
                    if self.s[p] == k:
                        self.s.pop(p)
                        p -= 1
                    else:
                        break
            current = ai
        return True

if __name__ == "__main__":
    m = atcoder_AGC029_C()
    m.solve()

