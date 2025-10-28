
MOD1 = 1000000007
MOD2 = 998244353
tenmod = []
inv9 = pow(9, -1, MOD2)

def modPow(x, y):
    z = 1
    while y > 0:
        if y % 2 == 0:
            x = x * x % MOD2
            y //= 2
        else:
            z = z * x % MOD2
            y -= 1
    return z

class S:
    E = None

    def __init__(self, sum, l, r):
        self.sum = sum
        self.l = l
        self.r = r

    @staticmethod
    def op(s1, s2):
        sum = s1.sum + s2.sum
        if sum >= MOD2:
            sum -= MOD2
        return S(sum, min(s1.l, s2.l), max(s1.r, s2.r))

    @staticmethod
    def map(f, s):
        c = (tenmod[f.N - s.l] - tenmod[f.N - s.r - 1]) % MOD2
        return S(((f.D * c) % MOD2 * inv9) % MOD2, s.l, s.r)

S.E = S(0, float('inf') // 2, float('-inf') // 2)

class F:
    I = None

    def __init__(self, D, N):
        self.D = D
        self.N = N

    @staticmethod
    def composite(f, g):
        return F(f.D, f.N)

F.I = F(0, 0)

class LazySegTree:
    def __init__(self, n, op, e, mapping, composition, id):
        self.MAX = n
        k = 1
        while k < n:
            k <<= 1
        self.N = k
        self.Log = k.bit_length() - 1
        self.Op = op
        self.E = e
        self.Mapping = mapping
        self.Composition = composition
        self.Id = id
        self.Dat = [e] * (self.N * 2)
        self.Laz = [id] * self.N

    def build(self, dat):
        l = len(dat)
        self.Dat[self.N:self.N + l] = dat
        for i in range(self.N - 1, 0, -1):
            self.Dat[i] = self.Op(self.Dat[i << 1 | 0], self.Dat[i << 1 | 1])

    def push(self, k):
        if self.Laz[k] == self.Id:
            return
        lk = k << 1 | 0
        rk = k << 1 | 1
        self.Dat[lk] = self.Mapping(self.Laz[k], self.Dat[lk])
        self.Dat[rk] = self.Mapping(self.Laz[k], self.Dat[rk])
        if lk < self.N:
            self.Laz[lk] = self.Composition(self.Laz[k], self.Laz[lk])
        if rk < self.N:
            self.Laz[rk] = self.Composition(self.Laz[k], self.Laz[rk])
        self.Laz[k] = self.Id

    def pushTo(self, k):
        for i in range(self.Log, 0, -1):
            self.push(k >> i)

    def pushToRange(self, lk, rk):
        for i in range(self.Log, 0, -1):
            if (lk >> i) << i != lk:
                self.push(lk >> i)
            if (rk >> i) << i != rk:
                self.push((rk - 1) >> i)

    def updateFrom(self, k):
        k >>= 1
        while k > 0:
            self.Dat[k] = self.Op(self.Dat[k << 1 | 0], self.Dat[k << 1 | 1])
            k >>= 1

    def updateFromRange(self, lk, rk):
        for i in range(1, self.Log + 1):
            if (lk >> i) << i != lk:
                lki = lk >> i
                self.Dat[lki] = self.Op(self.Dat[lki << 1 | 0], self.Dat[lki << 1 | 1])
            if (rk >> i) << i != rk:
                rki = (rk - 1) >> i
                self.Dat[rki] = self.Op(self.Dat[rki << 1 | 0], self.Dat[rki << 1 | 1])

    def set(self, p, x):
        if p < 0 or p >= self.MAX:
            raise IndexError(f"Index {p} is not in [0, {self.MAX}).")
        p += self.N
        self.pushTo(p)
        self.Dat[p] = x
        self.updateFrom(p)

    def get(self, p):
        if p < 0 or p >= self.MAX:
            raise IndexError(f"Index {p} is not in [0, {self.MAX}).")
        p += self.N
        self.pushTo(p)
        return self.Dat[p]

    def allProd(self):
        return self.Dat[1]

    def apply(self, p, f):
        if p < 0 or p >= self.MAX:
            raise IndexError(f"Index {p} is not in [0, {self.MAX}).")
        p += self.N
        self.pushTo(p)
        self.Dat[p] = self.Mapping(f, self.Dat[p])
        self.updateFrom(p)

    def applyRange(self, l, r, f):
        if l > r:
            raise ValueError(f"Invalid range: [{l}, {r}).")
        if l < 0 or l > self.MAX or r < 0 or r > self.MAX:
            raise IndexError(f"Range [{l}, {r}) is not in [0, {self.MAX}].")
        if l == r:
            return
        l += self.N
        r += self.N
        self.pushToRange(l, r)
        l2, r2 = l, r
        while l2 < r2:
            if l2 & 1:
                self.Dat[l2] = self.Mapping(f, self.Dat[l2])
                if l2 < self.N:
                    self.Laz[l2] = self.Composition(f, self.Laz[l2])
                l2 += 1
            if r2 & 1:
                r2 -= 1
                self.Dat[r2] = self.Mapping(f, self.Dat[r2])
                if r2 < self.N:
                    self.Laz[r2] = self.Composition(f, self.Laz[r2])
            l2 >>= 1
            r2 >>= 1
        self.updateFromRange(l, r)

class InputReader:
    def __init__(self, stream):
        self.stream = stream
        self.buffer = []
        self.preload()

    def preload(self):
        for line in self.stream:
            self.buffer.extend(line.split())
        self.stream = None

    def next(self):
        if not self.buffer:
            raise StopIteration
        return self.buffer.pop(0)

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return int(self.next())

import sys
import sys
import sys
import sys

N = InputReader(sys.stdin).nextInt()
Q = InputReader(sys.stdin).nextInt()
tenmod = [1] * (N + 1)
for j in range(1, N + 1):
    tenmod[j] = (tenmod[j - 1] * 10) % MOD2
dat = [S(tenmod[N - i - 1], i, i) for i in range(N)]
lazySegTree = LazySegTree(N, S.op, S.E, S.map, F.composite, F.I)
out = []
for _ in range(Q):
    l = InputReader(sys.stdin).nextInt() - 1
    r = InputReader(sys.stdin).nextInt() - 1
    D = InputReader(sys.stdin).nextLong()
    lazySegTree.applyRange(l, r + 1, F(D, N))
    out.append(str(lazySegTree.allProd().sum))
print('\n'.join(out))

