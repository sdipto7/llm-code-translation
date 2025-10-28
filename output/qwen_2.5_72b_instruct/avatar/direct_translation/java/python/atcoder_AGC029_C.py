
import sys
import bisect
from collections import defaultdict

class atcoder_AGC029_C:
    def __init__(self):
        self.n = 0
        self.a = []
        self.s = None

    def main(self):
        self.solve()

    def set(self):
        input = sys.stdin.read().split()
        self.n = int(input[0])
        self.a = list(map(int, input[1:]))
        self.s = defaultdict(int)

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
                keys = sorted(self.s.keys())
                index = bisect.bisect_right(keys, ai)
                while index > 0:
                    p = keys[index - 1]
                    if p < ai:
                        break
                    self.s[p] += 1
                    if self.s[p] == k:
                        del self.s[p]
                    index -= 1
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
    m = atcoder_AGC029_C()
    m.main()

