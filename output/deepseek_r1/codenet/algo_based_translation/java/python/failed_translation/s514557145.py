
import sys
MOD2 = 998244353

def mod_pow(x, y):
    z = 1
    while y > 0:
        if y % 2 == 0:
            x = x * x % MOD2
            y //= 2
        else:
            z = z * x % MOD2
            y -= 1
    return z

def mod_inv(x):
    return mod_pow(x, MOD2 - 2)

class S:
    E = None
    def __init__(self, sum_, l, r):
        self.sum = sum_ % MOD2
        self.l = l
        self.r = r
    
    @staticmethod
    def op(s1, s2):
        new_sum = (s1.sum + s2.sum) % MOD2
        new_l = min(s1.l, s2.l)
        new_r = max(s1.r, s2.r)
        return S(new_sum, new_l, new_r)
    
    @staticmethod
    def map_(f, s, tenmod):
        a = f.N - s.l
        b = f.N - s.r - 1
        numerator = (tenmod[a] - tenmod[b]) % MOD2
        new_sum = (f.D * numerator) % MOD2
        new_sum = (new_sum * inv9) % MOD2
        return S(new_sum, s.l, s.r)

S.E = S(0, float('inf'), -float('inf'))

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
    def __init__(self, data, op, e, map_, comp, id_, tenmod):
        self.n = len(data)
        self.log = (self.n - 1).bit_length()
        self.size = 1 << self.log
        self.op = op
        self.e = e
        self.map = map_
        self.comp = comp
        self.id = id_
        self.tenmod = tenmod
        
        self.dat = [e()] * (2 * self.size)
        self.laz = [id_] * self.size
        
        for i in range(self.n):
            self.dat[self.size + i] = data[i]
        for i in range(self.size - 1, 0, -1):
            self.dat[i] = self.op(self.dat[2*i], self.dat[2*i+1])
    
    def _push(self, k):
        if self.laz[k] == self.id:
            return
        self.dat[2*k] = self.map(self.laz[k], self.dat[2*k], self.tenmod)
        self.dat[2*k+1] = self.map(self.laz[k], self.dat[2*k+1], self.tenmod)
        if 2*k < self.size:
            self.laz[2*k] = self.comp(self.laz[k], self.laz[2*k])
        if 2*k+1 < self.size:
            self.laz[2*k+1] = self.comp(self.laz[k], self.laz[2*k+1])
        self.laz[k] = self.id
    
    def _update(self, k):
        k >>= 1
        while k >= 1:
            self.dat[k] = self.op(self.dat[2*k], self.dat[2*k+1])
            k >>= 1
    
    def apply_range(self, l, r, f):
        l += self.size
        r += self.size
        for i in range(self.log, 0, -1):
            if ((l >> i) << i) != l:
                self._push(l >> i)
            if ((r >> i) << i) != r:
                self._push((r-1) >> i)
        
        L, R = l, r
        while L < R:
            if L & 1:
                self.dat[L] = self.map(f, self.dat[L], self.tenmod)
                if L < self.size:
                    self.laz[L] = self.comp(f, self.laz[L])
                L += 1
            if R & 1:
                R -= 1
                self.dat[R] = self.map(f, self.dat[R], self.tenmod)
                if R < self.size:
                    self.laz[R] = self.comp(f, self.laz[R])
            L >>= 1
            R >>= 1
        
        for i in range(1, self.log+1):
            if ((l >> i) << i) != l:
                self._update(l >> i)
            if ((r >> i) << i) != r:
                self._update((r-1) >> i)
    
    def all_prod(self):
        return self.dat[1]

def main():
    import sys
    input = sys.stdin.read().split()
    ptr = 0
    N = int(input[ptr])
    ptr +=1
    Q = int(input[ptr])
    ptr +=1
    
    tenmod = [1]*(N+1)
    for j in range(1, N+1):
        tenmod[j] = (tenmod[j-1] * 10) % MOD2
    global inv9
    inv9 = mod_inv(9)
    
    data = []
    for i in range(N):
        exponent = N - i -1
        val = tenmod[exponent] if exponent >=0 else 0
        data.append(S(val, i, i))
    
    lst = LazySegTree(
        data, 
        S.op, 
        lambda: S.E, 
        S.map_, 
        F.composite, 
        F.I,
        tenmod
    )
    
    for _ in range(Q):
        L = int(input[ptr])-1
        ptr +=1
        R = int(input[ptr])-1
        ptr +=1
        D = int(input[ptr])
        ptr +=1
        lst.apply_range(L, R+1, F(D, N))
        print(lst.all_prod().sum % MOD2)

if __name__ == '__main__':
    main()

