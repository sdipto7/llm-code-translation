import sys
import math

MOD = 10**9 + 7

class FastScanner:
    def __init__(self, f):
        self.input = f
        self.buffer = []
        self.ptr = 0

    def next(self):
        while self.ptr < len(self.buffer):
            t = self.buffer[self.ptr]
            self.ptr += 1
            return t
        try:
            self.buffer = self.input.readline().split()
            self.ptr = 0
            return self.buffer[0]
        except ValueError:
            return None
        except Exception as e:
            print(e)
            return None

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return int(self.next())

    def nextDouble(self):
        return float(self.next())

    def nextChar(self):
        return self.next()[0]

    def nextStr(self):
        return self.next()

    def nextLine(self):
        return self.input.readline().strip()

    def nextIntArray(self, n):
        return [self.nextInt() for _ in range(n)]

    def nextLongArray(self, n):
        return [self.nextLong() for _ in range(n)]

    def nextDoubleArray(self, n):
        return [self.nextDouble() for _ in range(n)]

def solve():
    in_ = FastScanner(sys.stdin)
    out = sys.stdout
    N = in_.nextInt()
    A = in_.nextIntArray(N)
    ans = 0
    sum_ = A[N - 1]
    for i in range(N - 2, -1, -1):
        ans += (sum_ * A[i]) % MOD
        ans %= MOD
        sum_ += A[i]
        sum_ %= MOD
    out.write(str(ans) + '\n')

if __name__ == "__main__":
    solve()
