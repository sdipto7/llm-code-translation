
import sys
import bisect

class LightScanner:
    def __init__(self, in_stream):
        self.in_stream = in_stream
        self.buffer = []
        self.index = 0

    def string(self):
        if self.index == len(self.buffer):
            line = self.in_stream.readline().strip()
            self.buffer = line.split()
            self.index = 0
        result = self.buffer[self.index]
        self.index += 1
        return result

    def ints(self):
        return int(self.string())

    def longs(self):
        return int(self.string())

class LightWriter:
    def __init__(self, out_stream):
        self.out_stream = out_stream

    def print(self, s):
        self.out_stream.write(s)

    def ans(self, s):
        self.print(s)

    def ansln(self, *n):
        for i, n1 in enumerate(n):
            if i > 0:
                self.print(' ')
            self.ans(str(n1))
        self.ln()

    def ln(self):
        self.print('\n')

    def close(self):
        self.out_stream.close()

class IntMath:
    @staticmethod
    def min(*v):
        return min(v)

class ArrayUtil:
    @staticmethod
    def lower_bound(a, t):
        return bisect.bisect_left(a, t)

class DLazyFaith:
    def solve(self, testNumber, in_stream, out_stream):
        a = in_stream.ints()
        b = in_stream.ints()
        q = in_stream.ints()
        s = [0] * (a + 2)
        t = [0] * (b + 2)
        s[0] = t[0] = -10_000_000_000
        for i in range(a):
            s[i + 1] = in_stream.longs()
        for i in range(b):
            t[i + 1] = in_stream.longs()
        s[a + 1] = t[b + 1] = 20_000_000_000
        for _ in range(q):
            x = in_stream.longs()
            sl = x - s[max(0, ArrayUtil.lower_bound(s, x + 1) - 1)]
            tl = x - t[max(0, ArrayUtil.lower_bound(t, x + 1) - 1)]
            sr = s[ArrayUtil.lower_bound(s, x)] - x
            tr = t[ArrayUtil.lower_bound(t, x)] - x
            out_stream.ansln(IntMath.min(
                max(sl, tl),
                max(sr, tr),
                2 * sl + tr,
                2 * tl + sr,
                sl + 2 * tr,
                tl + 2 * sr
            ))

def main():
    in_stream = LightScanner(sys.stdin)
    out_stream = LightWriter(sys.stdout)
    solver = DLazyFaith()
    solver.solve(1, in_stream, out_stream)
    out_stream.close()

if __name__ == "__main__":
    main()

