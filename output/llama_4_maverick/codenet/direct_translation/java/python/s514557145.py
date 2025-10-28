
import sys
from collections import defaultdict
from math import gcd

MOD1 = 1000000007
MOD2 = 998244353

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

    def build(self, arr):
        for i in range(self.n):
            self.data[self.size + i] = arr[i]
        for i in range(self.size - 1, 0, -1):
            self.data[i] = self.op(self.data[2 * i], self.data[2 * i + 1])

    def update(self, k):
        self.data[k] = self.op(self.data[2 * k], self.data[2 * k + 1])

    def all_apply(self, k, f):
        self.data[k] = self.mapping(f, self.data[k])
        if k < self.size:
            self.lazy[k] = self.composition(f, self.lazy[k])

    def push(self, k):
        self.all_apply(2 * k, self.lazy[k])
        self.all_apply(2 * k + 1, self.lazy[k])
        self.lazy[k] = self.id

    def push_to(self, k):
        for i in range(k.bit_length() - 1, 0, -1):
            self.push(k >> i)

    def push_to_range(self, l, r):
        for i in range((l | r).bit_length() - 1, 0, -1):
            if (l >> i) << i != l:
                self.push(l >> i)
            if (r >> i) << i != r:
                self.push((r - 1) >> i)

    def update_from(self, k):
        k >>= 1
        while k:
            self.update(k)
            k >>= 1

    def update_from_range(self, l, r):
        for i in range(1, (l | r).bit_length()):
            if (l >> i) << i != l:
                self.update(l >> i)
            if (r >> i) << i != r:
                self.update((r - 1) >> i)

    def set(self, p, x):
        p += self.size
        self.push_to(p)
        self.data[p] = x
        self.update_from(p)

    def get(self, p):
        p += self.size
        self.push_to(p)
        return self.data[p]

    def prod(self, l, r):
        l += self.size
        r += self.size
        self.push_to_range(l, r)
        sl = sr = self.e
        while l < r:
            if l & 1:
                sl = self.op(sl, self.data[l])
                l += 1
            if r & 1:
                r -= 1
                sr = self.op(self.data[r], sr)
            l >>= 1
            r >>= 1
        return self.op(sl, sr)

    def all_prod(self):
        return self.data[1]

    def apply(self, p, f):
        p += self.size
        self.push_to(p)
        self.data[p] = self.mapping(f, self.data[p])
        self.update_from(p)

    def apply_range(self, l, r, f):
        l += self.size
        r += self.size
        self.push_to_range(l, r)
        for i in range(l.bit_length() - 1, 0, -1):
            if (l >> i) << i != l:
                self.lazy[l >> i] = self.composition(f, self.lazy[l >> i])
        for i in range(r.bit_length() - 1, 0, -1):
            if (r >> i) << i != r:
                self.lazy[(r - 1) >> i] = self.composition(f, self.lazy[(r - 1) >> i])
        l2 = l
        r2 = r
        while l2 < r2:
            if l2 & 1:
                self.data[l2] = self.mapping(f, self.data[l2])
                if l2 < self.size:
                    self.lazy[l2] = self.composition(f, self.lazy[l2])
                l2 += 1
            if r2 & 1:
                r2 -= 1
                self.data[r2] = self.mapping(f, self.data[r2])
                if r2 < self.size:
                    self.lazy[r2] = self.composition(f, self.lazy[r2])
            l2 >>= 1
            r2 >>= 1
        self.update_from_range(l, r)

    def max_right(self, l, g):
        if not g(self.e):
            raise ValueError("Identity element must satisfy the condition.")
        if l == self.n:
            return self.n
        l += self.size
        self.push_to(l)
        sm = self.e
        while True:
            while l & 1 == 0:
                l >>= 1
            if not g(self.op(sm, self.data[l])):
                while l < self.size:
                    self.push(l)
                    l <<= 1
                    if g(self.op(sm, self.data[l])):
                        sm = self.op(sm, self.data[l])
                        l += 1
                return l - self.size
            sm = self.op(sm, self.data[l])
            l += 1
            if l & -l == l:
                break
        return self.n

    def min_left(self, r, g):
        if not g(self.e):
            raise ValueError("Identity element must satisfy the condition.")
        if r == 0:
            return 0
        r += self.size
        self.push_to(r - 1)
        sm = self.e
        while True:
            r -= 1
            while r > 1 and r & 1:
                r >>= 1
            if not g(self.op(self.data[r], sm)):
                while r < self.size:
                    self.push(r)
                    r = 2 * r + 1
                    if g(self.op(self.data[r], sm)):
                        sm = self.op(self.data[r], sm)
                        r -= 1
                return r + 1 - self.size
            sm = self.op(self.data[r], sm)
            if r & -r == r:
                break
        return 0

def mod_inv(x, mod):
    return pow(x, mod - 2, mod)

def main():
    input = sys.stdin.buffer.readline
    n, q = map(int, input().split())
    tenmod = [1] * (n + 1)
    for i in range(1, n + 1):
        tenmod[i] = (tenmod[i - 1] * 10) % MOD2
    inv9 = mod_inv(9, MOD2)

    class S:
        def __init__(self, sum, l, r):
            self.sum = sum
            self.l = l
            self.r = r

        def __add__(self, other):
            sum = (self.sum + other.sum) % MOD2
            return S(sum, min(self.l, other.l), max(self.r, other.r))

    class F:
        def __init__(self, d, n):
            self.d = d
            self.n = n

        def __call__(self, other):
            return self.composite(other)

        def composite(self, other):
            return F(self.d, self.n)

    def op(s1, s2):
        return s1 + s2

    def mapping(f, s):
        c = (tenmod[f.n - s.l] - tenmod[f.n - s.r - 1]) % MOD2
        return S(((f.d * c) % MOD2 * inv9) % MOD2, s.l, s.r)

    e = S(0, float('inf'), float('-inf'))
    id = F(0, 0)
    dat = [S((tenmod[n - i - 1]), i, i) for i in range(n)]
    lazy_segtree = LazySegTree(n, op, e, mapping, F.composite, id)
    lazy_segtree.build(dat)

    for _ in range(q):
        l, r, d = map(int, input().split())
        l -= 1
        r -= 1
        lazy_segtree.apply_range(l, r + 1, F(d, n))
        print(lazy_segtree.all_prod().sum)

if __name__ == "__main__":
    main()

