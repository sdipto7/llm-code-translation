import sys
from collections import defaultdict

class Atcoder_AGC029_C:
    def __init__(self):
        self.n = 0
        self.a = []
        self.s = defaultdict(int)

    def set(self):
        import sys
        input = sys.stdin.read().split()
        self.n = int(input[0])
        self.a = list(map(int, input[1:]))

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
        self.s = defaultdict(int)
        current = 0
        for ai in self.a:
            if ai <= current:
                if k == 1:
                    return False
                while self.s and max(self.s.keys()) >= ai:
                    del self.s[max(self.s.keys())]
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
    m = Atcoder_AGC029_C()
    m.solve()
