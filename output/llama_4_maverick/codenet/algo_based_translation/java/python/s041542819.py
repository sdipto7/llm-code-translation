
import sys
from bisect import bisect_left

class LightScanner:
    def __init__(self, stream):
        self.stream = stream
        self.tokens = []

    def next_token(self):
        if not self.tokens:
            self.tokens = self.stream.readline().split()
        return self.tokens.pop(0)

    def next_int(self):
        return int(self.next_token())

    def next_long(self):
        return int(self.next_token())

class LightWriter:
    def __init__(self, stream):
        self.stream = stream

    def print(self, value):
        self.stream.write(str(value))

    def println(self, value):
        self.stream.write(str(value) + '\n')

    def close(self):
        pass

class IntMath:
    @staticmethod
    def min(*values):
        return min(values)

class ArrayUtil:
    @staticmethod
    def lower_bound(array, target):
        return bisect_left(array, target)

class DLazyFaith:
    def solve(self, test_number, scanner, writer):
        a, b, q = scanner.next_int(), scanner.next_int(), scanner.next_int()
        s = [-10**10] + [scanner.next_long() for _ in range(a)] + [10**10]
        t = [-10**10] + [scanner.next_long() for _ in range(b)] + [10**10]
        for _ in range(q):
            x = scanner.next_long()
            sl = x - s[max(0, ArrayUtil.lower_bound(s, x + 1) - 1)]
            tl = x - t[max(0, ArrayUtil.lower_bound(t, x + 1) - 1)]
            sr = s[ArrayUtil.lower_bound(s, x)] - x
            tr = t[ArrayUtil.lower_bound(t, x)] - x
            result = IntMath.min(max(sl, tl), max(sr, tr), 2 * sl + tr, 2 * tl + sr, sl + 2 * tr, tl + 2 * sr)
            writer.println(result)

def main():
    scanner = LightScanner(sys.stdin)
    writer = LightWriter(sys.stdout)
    solver = DLazyFaith()
    solver.solve(1, scanner, writer)
    writer.close()

if __name__ == "__main__":
    main()

