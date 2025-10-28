
import sys

class Main:
    MOD = 1000000007

    def solve(self, input_stream):
        xx = list(map(int, input_stream.readline().strip().split()))
        min_val = min(xx[0], xx[1])
        max_val = max(xx[0], xx[1])
        if min_val == max_val:
            f = self.f(min_val)
            res = (2 * f * f) % self.MOD
        elif min_val + 1 == max_val:
            f = self.f(min_val)
            res = (f * ((f * max_val) % self.MOD)) % self.MOD
        else:
            res = 0
        print(res)

    def f(self, n):
        res = 1
        for i in range(2, n + 1):
            res = (res * i) % self.MOD
        return res

    def main(self):
        self.solve(sys.stdin)

if __name__ == "__main__":
    Main().main()

