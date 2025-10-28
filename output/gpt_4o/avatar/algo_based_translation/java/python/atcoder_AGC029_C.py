
import sys
from collections import defaultdict

class AtcoderAGC029C:
    def __init__(self):
        self.n = 0
        self.a = []
        self.s = defaultdict(int)

    def set(self):
        try:
            input_data = sys.stdin.read().splitlines()
            self.n = int(input_data[0])
            self.a = list(map(int, input_data[1].split()))
            self.s.clear()
        except Exception as e:
            print(e)

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
                while self.s and max(self.s) >= ai:
                    del self.s[max(self.s)]
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
    m = AtcoderAGC029C()
    m.solve()

