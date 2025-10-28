
from collections import defaultdict, deque
import sys

class FastIO:
    newlines = 0

    def __init__(self, file):
        self._fd = file.fileno()
        self.buffer = bytearray()
        self.writable = 'x' in file.mode or 'r' not in file.mode
        self.write = self.buffer.extend if self.writable else None

    def read(self):
        while True:
            b = os.read(self._fd, max(os.fstat(self._fd).st_size, 8192))
            if not b:
                break
            ptr = self.buffer.tell()
            self.buffer.seek(0, 2), self.buffer.write(b), self.buffer.seek(ptr)
        self.newlines = 0
        return self.buffer.read()

    def readline(self):
        while self.newlines == 0:
            b = os.read(self._fd, max(os.fstat(self._fd).st_size, 8192))
            self.newlines = b.count(b'\n') + (not b)
            ptr = self.buffer.tell()
            self.buffer.seek(0, 2), self.buffer.write(b), self.buffer.seek(ptr)
        self.newlines -= 1
        return self.buffer.readline()

    def flush(self):
        if self.writable:
            os.write(self._fd, self.buffer)
            self.buffer.truncate(0), self.buffer.seek(0)

class IOWrapper:
    def __init__(self, file):
        self.buffer = FastIO(file)
        self.flush = self.buffer.flush
        self.writable = self.buffer.writable
        self.write = lambda s: self.buffer.write(s.encode('ascii'))
        self.read = lambda: self.buffer.read().decode('ascii')
        self.readline = lambda: self.buffer.readline().decode('ascii')

sys.stdin, sys.stdout = IOWrapper(sys.stdin), IOWrapper(sys.stdout)
input = lambda: sys.stdin.readline().rstrip('\r\n')

mod = 10**9 + 7

def modpow(x, y):
    if y == 0:
        return 1
    if y % 2 != 0:
        return x * modpow(x, y-1) % mod
    tmp = modpow(x, y//2)
    return tmp * tmp % mod

def rec(v, parent, to, dp):
    res = 1
    for next in to[v]:
        if next == parent:
            continue
        res += rec(next, v, to, dp)
    dp[v] = res
    return res

def main():
    N = int(input())
    to = [[] for _ in range(N)]
    edges = []
    for _ in range(N-1):
        A, B = map(int, input().split())
        A -= 1
        B -= 1
        to[A].append(B)
        to[B].append(A)
        edges.append((A, B))

    dp = [0]*N
    rec(0, -1, to, dp)

    mulsum = 0
    for e in edges:
        candidate1, candidate2 = e
        child = candidate1 if dp[candidate1] < dp[candidate2] else candidate2
        a = dp[child]
        b = N - a
        mul = (modpow(2, a) - 1)*(modpow(2, b) - 1)%mod
        mulsum += mul
        mulsum %= mod

    cases = modpow(2, N)
    PN = (mulsum + (cases - 1))%mod
    BN = N * modpow(2, N-1) % mod
    WN = (PN - BN)%mod
    ans = WN * modpow(cases, mod-2)
    ans %= mod
    print(ans)

if __name__ == "__main__":
    main()

