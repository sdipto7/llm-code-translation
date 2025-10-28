
import sys
import bisect

def main():
    input_stream = sys.stdin
    output_stream = sys.stdout
    in = LightScanner(input_stream)
    out = LightWriter(output_stream)
    solver = DLazyFaith()
    solver.solve(1, in, out)
    out.close()

class DLazyFaith:
    def solve(self, testNumber, in, out):
        a = in.ints()
        b = in.ints()
        q = in.ints()
        s = [-10**18] + [in.longs() for _ in range(a)] + [2 * 10**18]
        t = [-10**18] + [in.longs() for _ in range(b)] + [2 * 10**18]
        for _ in range(q):
            x = in.longs()
            sl = x - s[max(0, bisect.bisect_left(s, x + 1) - 1)]
            tl = x - t[max(0, bisect.bisect_left(t, x + 1) - 1)]
            sr = s[bisect.bisect_left(s, x)] - x
            tr = t[bisect.bisect_left(t, x)] - x
            out.ansln(min(
                max(sl, tl),
                max(sr, tr),
                2 * sl + tr,
                2 * tl + sr,
                sl + 2 * tr,
                tl + 2 * sr
            ))

class LightScanner:
    def __init__(self, in_stream):
        self.reader = in_stream

    def string(self):
        return sys.stdin.readline().strip()

    def ints(self):
        return int(self.string())

    def longs(self):
        return int(self.string())

class LightWriter:
    def __init__(self, out_stream):
        self.out = out_stream
        self.autoflush = False
        self.breaked = True

    def print(self, c):
        self.out.write(c)
        self.breaked = False
        return self

    def ans(self, s):
        if not self.breaked:
            self.print(' ')
        return self.print(s)

    def ansln(self, *n):
        for n1 in n:
            self.ans(str(n1)).ln()
        return self

    def ln(self):
        self.print('\n')
        self.breaked = True
        if self.autoflush:
            self.out.flush()
        return self

    def close(self):
        self.out.close()

if __name__ == "__main__":
    main()

