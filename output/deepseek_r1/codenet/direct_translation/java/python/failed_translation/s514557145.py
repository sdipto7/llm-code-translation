
MOD2 = 998244353

class S:
    def __init__(self, sum_, l, r):
        self.sum = sum_ % MOD2
        self.l = l
        self.r = r

    @staticmethod
    def e():
        return S(0, float('inf'), -float('inf'))

    @staticmethod
    def op(a, b):
        sum_ = (a.sum + b.sum) % MOD2
        l = min(a.l, b.l)
        r = max(a.r, b.r)
        return S(sum_, l, r)

    @staticmethod
    def mapping(f, s):
        a = f.N - s.l
        b = f.N - s.r - 1
        term1 = tenmod[a]
        term2 = tenmod[b]
        c = (term1 - term2) % MOD2
        sum_ = (f.D * c) % MOD2
        sum_ = (sum_ * inv9) % MOD2
        return S(sum_, s.l, s.r)

class F:
    def __init__(self, D, N):
        self.D = D
        self.N = N

    @staticmethod
    def id():
        return F(0, 0)

    @staticmethod
    def composition(f, g):
        return F(f.D, f.N)

class LazySegTree:
    def __init__(self, data, op, e, mapping, composition, id_func):
        self.n = len(data)
        self.N = 1
        while self.N < self.n:
            self.N <<= 1
        self.Log = (self.N).bit_length() - 1
        self.op = op
        self.e = e
        self.mapping = mapping
        self.composition = composition
        self.id_func = id_func

        self.Dat = [e() for _ in range(2 * self.N)]
        self.Laz = [id_func() for _ in range(self.N)]

        for i in range(self.n):
            self.Dat[self.N + i] = data[i]
        for i in range(self.N -1, 0, -1):
            self.Dat[i] = self.op(self.Dat[2*i], self.Dat[2*i +1])

    def push(self, k):
        if self.Laz[k] == self.id_func():
            return
        l = 2*k
        r = 2*k +1
        self.Dat[l] = self.mapping(self.Laz[k], self.Dat[l])
        self.Dat[r] = self.mapping(self.Laz[k], self.Dat[r])
        if l < self.N:
            self.Laz[l] = self.composition(self.Laz[k], self.Laz[l])
        if r < self.N:
            self.Laz[r] = self.composition(self.Laz[k], self.Laz[r])
        self.Laz[k] = self.id_func()

    def push_to(self, k):
        for i in range(self.Log, 0, -1):
            self.push(k >> i)

    def push_to_range(self, l, r):
        for i in range(self.Log, 0, -1):
            if (l >> i) << i != l:
                self.push(l >> i)
            if (r >> i) << i != r:
                self.push(r >> i)

    def update_from(self, k):
        while k > 1:
            k >>= 1
            self.Dat[k] = self.op(self.Dat[2*k], self.Dat[2*k +1])

    def apply(self, l, r, f):
        if l >= r:
            return
        l += self.N
        r += self.N
        l0 = l
        r0 = r
        self.push_to_range(l0, r0)
        while l < r:
            if l & 1:
                self.Dat[l] = self.mapping(f, self.Dat[l])
                if l < self.N:
                    self.Laz[l] = self.composition(f, self.Laz[l])
                l +=1
            if r & 1:
                r -=1
                self.Dat[r] = self.mapping(f, self.Dat[r])
                if r < self.N:
                    self.Laz[r] = self.composition(f, self.Laz[r])
            l >>=1
            r >>=1
        self.update_from(l0 >> 1)
        self.update_from((r0 -1) >> 1)

    def all_prod(self):
        return self.Dat[1]

def main():
    import sys
    input = sys.stdin.read().split()
    ptr = 0
    N = int(input[ptr])
    ptr += 1
    Q = int(input[ptr])
    ptr += 1

    global tenmod, inv9
    tenmod = [1] * (N+1)
    for j in range(1, N+1):
        tenmod[j] = (tenmod[j-1] * 10) % MOD2
    inv9 = pow(9, MOD2-2, MOD2)

    dat = []
    for i in range(N):
        dat.append(S(tenmod[N-1 -i], i, i))

    lazy_seg = LazySegTree(dat, S.op, S.e, S.mapping, F.composition, F.id)

    for _ in range(Q):
        l = int(input[ptr])-1
        ptr +=1
        r = int(input[ptr])-1
        ptr +=1
        D = int(input[ptr])
        ptr +=1
        lazy_seg.apply(l, r+1, F(D, N))
        print(lazy_seg.all_prod().sum % MOD2)

if __name__ == '__main__':
    main()

