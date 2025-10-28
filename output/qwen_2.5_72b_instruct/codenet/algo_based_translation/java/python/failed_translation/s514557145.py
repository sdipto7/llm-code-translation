
import sys
import math

MOD1 = 1000000007
MOD2 = 998244353
tenmod = []
inv9 = pow(9, MOD2 - 2, MOD2)

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
        c = (tenmod[(f.N - s.l)] - tenmod[(f.N - s.r - 1)])
        if c < 0:
            c += MOD2
        return S(((f.D * c) % MOD2 * inv9) % MOD2, s.l, s.r)

S.E = S(0, sys.maxsize // 2, -sys.maxsize // 2)

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
        self.Dat = [self.E] * (self.N << 1)
        self.Laz = [self.Id] * self.N

    def build(self, dat):
        l = len(dat)
        self.Dat[self.N:self.N + l] = dat
        for i in range(self.N - 1, 0, -1):
            self.Dat[i] = self.Op(self.Dat[i << 1], self.Dat[(i << 1) + 1])

    def push(self, k):
        if self.Laz[k] == self.Id:
            return
        lk = k << 1
        rk = lk + 1
        self.Dat[lk] = self.Mapping(self.Laz[k], self.Dat[lk])
        self.Dat[rk] = self.Mapping(self.Laz[k], self.Dat[rk])
        if lk < self.N:
            self.Laz[lk] = self.Composition(self.Laz[k], self.Laz[lk])
        if rk < self.N:
            self.Laz[rk] = self.Composition(self.Laz[k], self.Laz[rk])
        self.Laz[k] = self.Id

    def push_to(self, k):
        for i in range(self.Log, 0, -1):
            self.push(k >> i)

    def push_to_lr(self, lk, rk):
        for i in range(self.Log, 0, -1):
            if ((lk >> i) << i) != lk:
                self.push(lk >> i)
            if ((rk >> i) << i) != rk:
                self.push((rk - 1) >> i)

    def update_from(self, k):
        k >>= 1
        while k > 0:
            self.Dat[k] = self.Op(self.Dat[k << 1], self.Dat[(k << 1) + 1])
            k >>= 1

    def update_from_lr(self, lk, rk):
        for i in range(1, self.Log + 1):
            if ((lk >> i) << i) != lk:
                lki = lk >> i
                self.Dat[lki] = self.Op(self.Dat[lki << 1], self.Dat[(lki << 1) + 1])
            if ((rk >> i) << i) != rk:
                rki = (rk - 1) >> i
                self.Dat[rki] = self.Op(self.Dat[rki << 1], self.Dat[(rki << 1) + 1])

    def set(self, p, x):
        self.exclusive_range_check(p)
        p += self.N
        self.push_to(p)
        self.Dat[p] = x
        self.update_from(p)

    def get(self, p):
        self.exclusive_range_check(p)
        p += self.N
        self.push_to(p)
        return self.Dat[p]

    def all_prod(self):
        return self.Dat[1]

    def apply(self, p, f):
        self.exclusive_range_check(p)
        p += self.N
        self.push_to(p)
        self.Dat[p] = self.Mapping(f, self.Dat[p])
        self.update_from(p)

    def apply_lr(self, l, r, f):
        if l > r:
            raise ValueError(f"Invalid range: [{l}, {r})")
        self.inclusive_range_check(l)
        self.inclusive_range_check(r)
        if l == r:
            return
        l += self.N
        r += self.N
        self.push_to_lr(l, r)
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
        self.update_from_lr(l, r)

    def max_right(self, l, g):
        self.inclusive_range_check(l)
        if not g(self.E):
            raise ValueError("Identity element must satisfy the condition.")
        if l == self.MAX:
            return self.MAX
        l += self.N
        self.push_to(l)
        sum = self.E
        while True:
            l >>= l.bit_length() - (self.Log + 1)
            if not g(self.Op(sum, self.Dat[l])):
                while l < self.N:
                    self.push(l)
                    l <<= 1
                    if g(self.Op(sum, self.Dat[l])):
                        sum = self.Op(sum, self.Dat[l])
                        l += 1
                return l - self.N
            sum = self.Op(sum, self.Dat[l])
            l += 1
            if (l & -l) == l:
                break
        return self.MAX

    def min_left(self, r, g):
        self.inclusive_range_check(r)
        if not g(self.E):
            raise ValueError("Identity element must satisfy the condition.")
        if r == 0:
            return 0
        r += self.N
        self.push_to(r - 1)
        sum = self.E
        while True:
            r -= 1
            while r > 1 and (r & 1):
                r >>= 1
            if not g(self.Op(self.Dat[r], sum)):
                while r < self.N:
                    self.push(r)
                    r = (r << 1) + 1
                    if g(self.Op(self.Dat[r], sum)):
                        sum = self.Op(self.Dat[r], sum)
                        r -= 1
                return r + 1 - self.N
            sum = self.Op(self.Dat[r], sum)
            if (r & -r) == r:
                break
        return 0

    def exclusive_range_check(self, p):
        if not (0 <= p < self.MAX):
            raise IndexError(f"Index {p} is not in [0, {self.MAX}).")

    def inclusive_range_check(self, p):
        if not (0 <= p <= self.MAX):
            raise IndexError(f"Index {p} is not in [0, {self.MAX}].")

class InputReader:
    def __init__(self, stream):
        self.in = stream
        self.buf = []
        self.cur = 0

    def read(self):
        while not self.buf:
            self.buf = self.in.readline().split()
        return self.buf.pop(0)

    def next_int(self):
        return int(self.read())

    def next_long(self):
        return int(self.read())

    def next_double(self):
        return float(self.read())

def main():
    import sys
    out = sys.stdout
    sc = InputReader(sys.stdin)
    N = sc.next_int()
    Q = sc.next_int()
    global tenmod
    tenmod = [0] * (N + 1)
    tenmod[0] = 1
    for j in range(1, N + 1):
        tenmod[j] = (tenmod[j - 1] * 10) % MOD2
    dat = [S(tenmod[N - i - 1], i, i) for i in range(N)]
    lazySegTree = LazySegTree(N, S.op, S.E, S.map, F.composite, F.I)
    for _ in range(Q):
        l = sc.next_int() - 1
        r = sc.next_int() - 1
        D = sc.next_long()
        lazySegTree.apply_lr(l, r + 1, F(D, N))
        out.write(f"{lazySegTree.all_prod().sum}\n")
    out.flush()

if __name__ == "__main__":
    main()

