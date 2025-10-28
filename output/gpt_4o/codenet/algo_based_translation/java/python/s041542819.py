
import sys
from bisect import bisect_left

class DLazyFaith:
    def solve(self, test_number, in_stream, out_stream):
        a = in_stream.ints()
        b = in_stream.ints()
        q = in_stream.ints()
        s = [-10_000_000_000] + [in_stream.longs() for _ in range(a)] + [20_000_000_000]
        t = [-10_000_000_000] + [in_stream.longs() for _ in range(b)] + [20_000_000_000]
        
        for _ in range(q):
            x = in_stream.longs()
            sl = x - s[max(0, ArrayUtil.lower_bound(s, x + 1) - 1)]
            tl = x - t[max(0, ArrayUtil.lower_bound(t, x + 1) - 1)]
            sr = s[ArrayUtil.lower_bound(s, x)] - x
            tr = t[ArrayUtil.lower_bound(t, x)] - x
            result = IntMath.min(
                max(sl, tl),
                max(sr, tr),
                2 * sl + tr,
                2 * tl + sr,
                sl + 2 * tr,
                tl + 2 * sr
            )
            out_stream.ansln(result)

class LightScanner:
    def __init__(self, in_stream):
        self.reader = in_stream
        self.tokenizer = None

    def string(self):
        if self.tokenizer is None or not self.tokenizer:
            self.tokenizer = self.reader.readline().strip().split()
        return self.tokenizer.pop(0)

    def ints(self):
        return int(self.string())

    def longs(self):
        return int(self.string())

class LightWriter:
    def __init__(self, out_stream):
        self.out = out_stream
        self.breaked = True

    def print(self, s):
        self.out.write(s)
        self.breaked = False
        return self

    def ans(self, s):
        if not self.breaked:
            self.print(' ')
        return self.print(str(s))

    def ansln(self, *n):
        for n1 in n:
            self.ans(n1).ln()
        return self

    def ln(self):
        self.print('\n')
        self.breaked = True
        return self

    def close(self):
        self.out.flush()

class IntMath:
    @staticmethod
    def min(*v):
        return min(v)

class ArrayUtil:
    @staticmethod
    def lower_bound(a, t, min=0):
        max = len(a)
        while min < max:
            mid = (min + max) // 2
            if t <= a[mid]:
                max = mid
            else:
                min = mid + 1
        return min

def main():
    input_stream = sys.stdin
    output_stream = sys.stdout
    in_stream = LightScanner(input_stream)
    out_stream = LightWriter(output_stream)
    solver = DLazyFaith()
    solver.solve(1, in_stream, out_stream)
    out_stream.close()

if __name__ == "__main__":
    main()

