
import sys
import math

class S:
    E = None

    def __init__(self, sum, l, r):
        self.sum = sum
        self.l = l
        self.r = r

    @staticmethod
    def op(s1, s2):
        sum_val = (s1.sum + s2.sum) % MOD2
        return S(sum_val, min(s1.l, s2.l), max(s1.r, s2.r))

    @staticmethod
    def map(f, s):
        c = (tenmod[f.N - s.l] - tenmod[f.N - s.r - 1]) % MOD2
        return S(((f.D * c) % MOD2 * inv9) % MOD2, s.l, s.r)

S.E = S(0, float('inf'), float('-inf'))

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
        self.n = n
        self.op = op
        self.e = e
        self.mapping = mapping
        self.composition = composition
        self.id = id
        self.size = 1 << (n - 1).bit_length()
        self.data = [e] * (2 * self.size)
        self.lazy = [id] * self.size

    def build(self, dat):
        for i in range(self.n):
            self.data[self.size + i] = dat[i]
        for i in range(self.size - 1, 0, -1):
            self.data[i] = self.op(self.data[2 * i], self.data[2 * i + 1])

    def _push(self, k):
        if self.lazy[k] == self.id:
            return
        self.data[2 * k] = self.mapping(self.lazy[k], self.data[2 * k])
        self.data[2 * k + 1] = self.mapping(self.lazy[k], self.data[2 * k + 1])
        if 2 * k < self.size:
            self.lazy[2 * k] = self.composition(self.lazy[k], self.lazy[2 * k])
        if 2 * k + 1 < self.size:
            self.lazy[2 * k + 1] = self.composition(self.lazy[k], self.lazy[2 * k + 1])
        self.lazy[k] = self.id

    def _update(self, k):
        self.data[k] = self.op(self.data[2 * k], self.data[2 * k + 1])

    def apply(self, l, r, f):
        l += self.size
        r += self.size
        for i in range(self.size.bit_length() - 1, 0, -1):
            if (l >> i) << i != l:
                self._push(l >> i)
            if (r >> i) << i != r:
                self._push((r - 1) >> i)
        while l < r:
            if l & 1:
                self.data[l] = self.mapping(f, self.data[l])
                if l < self.size:
                    self.lazy[l] = self.composition(f, self.lazy[l])
                l += 1
            if r & 1:
                r -= 1
                self.data[r] = self.mapping(f, self.data[r])
                if r < self.size:
                    self.lazy[r] = self.composition(f, self.lazy[r])
            l >>= 1
            r >>= 1
        for i in range(1, self.size.bit_length()):
            if (l >> i) << i != l:
                self._update(l >> i)
            if (r >> i) << i != r:
                self._update((r - 1) >> i)

    def all_prod(self):
        return self.data[1]

MOD1 = 10**9 + 7
MOD2 = 998244353

def mod_inv(x):
    return mod_pow(x, MOD2 - 2)

def mod_pow(x, y):
    z = 1
    while y > 0:
        if y % 2 == 0:
            x = (x * x) % MOD2
            y //= 2
        else:
            z = (z * x) % MOD2
            y -= 1
    return z

def main():
    input = sys.stdin.readline
    N = int(input())
    Q = int(input())
    global tenmod
    tenmod = [1] * (N + 1)
    for i in range(1, N + 1):
        tenmod[i] = (tenmod[i - 1] * 10) % MOD2
    global inv9
    inv9 = mod_inv(9)
    dat = [S(tenmod[N - i - 1], i, i) for i in range(N)]
    lazy_seg_tree = LazySegTree(N, S.op, S.E, S.map, F.composite, F.I)
    lazy_seg_tree.build(dat)
    for _ in range(Q):
        l, r, D = map(int, input().split())
        l -= 1
        r in range(l, r + 1):
            lazy_seg_tree.apply(r, r + 1, F(D, N))
        print(lazy_seg_tree.all_prod().sum)

if __name__ == "__main__":
    main()

