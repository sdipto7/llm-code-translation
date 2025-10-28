
import sys
from bisect import bisect_left

class LightScanner:
    def __init__(self, file):
        self.file = file
        self.buff = None
        self.index = 0

    def string(self):
        if self.buff is None or self.index == len(self.buff):
            self.buff = self.file.readline().split()
            self.index = 0
        self.index += 1
        return self.buff[self.index - 1]

    def ints(self):
        return int(self.string())

    def longs(self):
        return int(self.string())

class LightWriter:
    def __init__(self, file):
        self.file = file

    def print(self, s):
        self.file.write(str(s))

    def ans(self, s):
        self.print(s)

    def ansln(self, *n):
        for n1 in n:
            self.ans(n1)
            self.ln()

    def ln(self):
        self.print('\n')

    def close(self):
        pass

def min_val(*v):
    return min(v)

def lower_bound(a, t, min_val=0):
    max_val = len(a)
    while min_val < max_val:
        mid = (min_val + max_val) // 2
        if t <= a[mid]:
            max_val = mid
        else:
            min_val = mid + 1
    return min_val

def main():
    in_file = sys.stdin
    out_file = sys.stdout
    in_scanner = LightScanner(in_file)
    out_writer = LightWriter(out_file)
    a = in_scanner.ints()
    b = in_scanner.ints()
    q = in_scanner.ints()
    s = [-10**10] + [in_scanner.longs() for _ in range(a)] + [10**10 + 10]
    t = [-10**10] + [in_scanner.longs() for _ in range(b)] + [10**10 + 10]
    for _ in range(q):
        x = in_scanner.longs()
        sl = x - s[max(0, lower_bound(s, x + 1) - 1)]
        tl = x - t[max(0, lower_bound(t, x + 1) - 1)]
        sr = s[lower_bound(s, x)] - x
        tr = t[lower_bound(t, x)] - x
        out_writer.ansln(min_val(
            max(sl, tl),
            max(sr, tr),
            2 * sl + tr,
            2 * tl + sr,
            sl + 2 * tr,
            tl + 2 * sr
        ))
    out_writer.close()

if __name__ == "__main__":
    main()

