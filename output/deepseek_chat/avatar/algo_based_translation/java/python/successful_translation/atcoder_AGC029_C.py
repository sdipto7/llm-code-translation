
import sys
from collections import OrderedDict

class atcoder_AGC029_C:
    def __init__(self):
        self.n = 0
        self.a = []
        self.s = OrderedDict()
    
    def set_input(self):
        self.n = int(sys.stdin.readline())
        self.a = list(map(int, sys.stdin.readline().split()))
        self.s = OrderedDict()
    
    def solve(self):
        self.set_input()
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
                while self.s and next(reversed(self.s)) >= ai:
                    self.s.popitem()
                p = ai - 1
                while True:
                    if p < 0:
                        return False
                    sp = self.s.get(p, 0) + 1
                    self.s[p] = sp
                    if sp == k:
                        del self.s[p]
                        p -= 1
                    else:
                        break
            current = ai
        return True

if __name__ == "__main__":
    m = atcoder_AGC029_C()
    m.solve()

