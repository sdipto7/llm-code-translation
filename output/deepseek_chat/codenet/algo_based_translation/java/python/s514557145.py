
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

class S:
    E = None
    
    def __init__(self, sum_val, l_val, r_val):
        self.sum = sum_val
        self.l = l_val
        self.r = r_val
    
    @staticmethod
    def op(s1, s2):
        total_sum = (s1.sum + s2.sum) % MOD2
        min_l = min(s1.l, s2.l)
        max_r = max(s1.r, s2.r)
        return S(total_sum, min_l, max_r)
    
    @staticmethod
    def map_func(f, s, tenmod, inv9):
        c = (tenmod[f.N - s.l] - tenmod[f.N - s.r - 1]) % MOD2
        if c < 0:
            c += MOD2
        new_sum = ((f.D * c) % MOD2 * inv9) % MOD2
        return S(new_sum, s.l, s.r)

S.E = S(0, 10**9, -10**9)

class F:
    I = None
    
    def __init__(self, D_val, N_val):
        self.D = D_val
        self.N = N_val
    
    @staticmethod
    def composite(f, g):
        return F(f.D, f.N)

F.I = F(0, 0)

class LazySegTree:
    def __init__(self, n, op, e, mapping, composition, id_func, tenmod, inv9):
        self.MAX = n
        self.N = 1
        while self.N < n:
            self.N <<= 1
        self.Log = (self.N).bit_length() - 1
        self.Op = op
        self.E = e
        self.Mapping = mapping
        self.Composition = composition
        self.Id = id_func
        self.tenmod = tenmod
        self.inv9 = inv9
        self.Dat = [self.E] * (2 * self.N)
        self.Laz = [self.Id] * self.N
    
    def build(self, dat):
        for i in range(len(dat)):
            self.Dat[self.N + i] = dat[i]
        for i in range(self.N - 1, 0, -1):
            self.Dat[i] = self.Op(self.Dat[2*i], self.Dat[2*i+1])
    
    def push(self, k):
        if self.Laz[k] == self.Id:
            return
        lk = 2 * k
        rk = 2 * k + 1
        self.Dat[lk] = self.Mapping(self.Laz[k], self.Dat[lk], self.tenmod, self.inv9)
        self.Dat[rk] = self.Mapping(self.Laz[k], self.Dat[rk], self.tenmod, self.inv9)
        if lk < self.N:
            self.Laz[lk] = self.Composition(self.Laz[k], self.Laz[lk])
        if rk < self.N:
            self.Laz[rk] = self.Composition(self.Laz[k], self.Laz[rk])
        self.Laz[k] = self.Id
    
    def push_to(self, k):
        for i in range(self.Log, 0, -1):
            self.push(k >> i)
    
    def push_to_range(self, lk, rk):
        for i in range(self.Log, 0, -1):
            if ((lk >> i) << i) != lk:
                self.push(lk >> i)
            if ((rk >> i) << i) != rk:
                self.push(rk >> i)
    
    def update_from(self, k):
        k >>= 1
        while k > 0:
            self.Dat[k] = self.Op(self.Dat[2*k], self.Dat[2*k+1])
            k >>= 1
    
    def update_from_range(self, lk, rk):
        for i in range(1, self.Log + 1):
            if ((lk >> i) << i) != lk:
                lki = lk >> i
                self.Dat[lki] = self.Op(self.Dat[2*lki], self.Dat[2*lki+1])
            if ((rk >> i) << i) != rk:
                rki = (rk - 1) >> i
                self.Dat[rki] = self.Op(self.Dat[2*rki], self.Dat[2*rki+1])
    
    def all_prod(self):
        return self.Dat[1]
    
    def apply_range(self, l, r, f):
        if l >= r:
            return
        l += self.N
        r += self.N
        self.push_to_range(l, r)
        l2, r2 = l, r
        while l2 < r2:
            if l2 & 1:
                self.Dat[l2] = self.Mapping(f, self.Dat[l2], self.tenmod, self.inv9)
                if l2 < self.N:
                    self.Laz[l2] = self.Composition(f, self.Laz[l2])
                l2 += 1
            if r2 & 1:
                r2 -= 1
                self.Dat[r2] = self.Mapping(f, self.Dat[r2], self.tenmod, self.inv9)
                if r2 < self.N:
                    self.Laz[r2] = self.Composition(f, self.Laz[r2])
            l2 >>= 1
            r2 >>= 1
        self.update_from_range(l, r)

def main():
    import sys
    data = sys.stdin.read().split()
    it = iter(data)
    
    N = int(next(it))
    Q = int(next(it))
    
    tenmod = [1] * (N + 1)
    for j in range(1, N + 1):
        tenmod[j] = (tenmod[j-1] * 10) % MOD2
    
    inv9 = mod_inv(9)
    
    dat = []
    for i in range(N):
        dat.append(S(tenmod[N - i - 1], i, i))
    
    lazy_seg_tree = LazySegTree(N, S.op, S.E, S.map_func, F.composite, F.I, tenmod, inv9)
    lazy_seg_tree.build(dat)
    
    output_lines = []
    for j in range(Q):
        l = int(next(it)) - 1
        r = int(next(it)) - 1
        D = int(next(it))
        lazy_seg_tree.apply_range(l, r + 1, F(D, N))
        result = lazy_seg_tree.all_prod().sum
        output_lines.append(str(result))
    
    print("\n".join(output_lines))

if __name__ == "__main__":
    main()

