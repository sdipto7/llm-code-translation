
import sys

class LightScanner:
    def __init__(self, in_stream):
        self.reader = in_stream
        self.tokenizer = None

    def string(self):
        if self.tokenizer is None or not self.tokenizer.hasMoreTokens():
            line = self.reader.readline()
            if line == '':
                raise Exception("EOF")
            self.tokenizer = StringTokenizer(line)
        return self.tokenizer.nextToken()

    def ints(self):
        return int(self.string())

    def longs(self):
        return int(self.string())  # Python int can handle long integers

class StringTokenizer:
    def __init__(self, line):
        self.tokens = line.split()
        self.index = 0

    def hasMoreTokens(self):
        return self.index < len(self.tokens)

    def nextToken(self):
        if not self.hasMoreTokens():
            raise Exception("No more tokens")
        token = self.tokens[self.index]
        self.index += 1
        return token

class LightWriter:
    def __init__(self, out_stream):
        self.out = out_stream

    def print(self, obj):
        self.out.write(str(obj))

    def ans(self, obj):
        self.print(f" {obj}" if not self.broke else str(obj))
        self.broke = False

    def ansln(self, *n):
        for num in n:
            self.ans(num)
        self.ln()

    def ln(self):
        self.print('\n')
        self.broke = True
        self.out.flush()

    def close(self):
        self.out.close()

    broke = True

class IntMath:
    @staticmethod
    def min(*v):
        return min(v)

class ArrayUtil:
    @staticmethod
    def lower_bound(a, t, min_index=0):
        max_index = len(a)
        while min_index < max_index:
            mid = (min_index + max_index) // 2
            if t <= a[mid]:
                max_index = mid
            else:
                min_index = mid + 1
        return min_index

class DLazyFaith:
    def solve(self, test_number, in_stream, out_stream):
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

