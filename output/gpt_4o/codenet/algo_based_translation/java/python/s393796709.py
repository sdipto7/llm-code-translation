
import sys

MOD = 1000000007

class Main:
    def solve(self, in_stream):
        xx = self.toInts(in_stream.readline().strip())
        min_val = min(xx[0], xx[1])
        max_val = max(xx[0], xx[1])
        res = 0

        if min_val == max_val:
            f = self.f(min_val)
            res = (2 * f * f) % MOD
        elif min_val + 1 == max_val:
            f = self.f(min_val)
            res = (f * ((f * max_val) % MOD)) % MOD

        print(res)

    def f(self, n):
        res = 1
        for i in range(2, n + 1):
            res = (res * i) % MOD
        return res

    def toInt(self, s):
        return int(s)

    def toInts(self, s):
        a = s.split(" ")
        o = [self.toInt(x) for x in a]
        return o

    def e(self, o):
        print(o, file=sys.stderr)

if __name__ == "__main__":
    in_stream = sys.stdin
    Main().solve(in_stream)

