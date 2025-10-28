
import sys
from functools import reduce

MOD1 = 1000000007
MOD2 = 998244353

class S:
    E = None  # Will be initialized after class definition
    def __init__(self, sum, l, r):
        self.sum = sum
        self.l = l
        self.r = r
    
    @staticmethod
    def op(s1, s2):
        sum_val = s1.sum + s2.sum
        if sum_val >= MOD2:
            sum_val -= MOD2
        return S(sum_val, min(s1.l, s2.l), max(s1.r, s2.r))
    
    @staticmethod
    def map(f, s):
        c = (tenmod[f.N - s.l] - tenmod[f.N - s.r - 1])
        if c < 0:
            c += MOD2
        return S(((f.D * c) % MOD2 * inv9) % MOD2, s.l, s.r)

S.E = S(0, float('inf'), -float('inf'))  # Initialize static member

class F:
    I = None  # Will be initialized after class definition
    def __init__(self, D, N):
        self.D = D
        self.N = N
        
    @staticmethod
    def composite(f, g):
        return F(f.D, f.N)

F.I = F(0, 0)  # Initialize static member

def modInv(x):
    return modPow(x, MOD2 - 2)

def modPow(x, y):
    z = 1
    while y > 0:
        if y % 2 == 0:
            x = (x * x) % MOD2
            y //= 2
        else:
            z = (z * x) % MOD2
            y -= 1
    return z

class LazySegTree:
    def __init__(self, n, op, e, mapping, composition, id):
        self.MAX = n
        k = 1
        while k < n:
            k <<= 1
        self.N = k
        self.Log = (self.N).bit_length() - 1
        self.Op = op
        self.E = e
        self.Mapping = mapping
        self.Composition = composition
        self.Id = id
        self.Dat = [e] * (2 * self.N)
        self.Laz = [id] * self.N
    
    def build(self, dat):
        l = len(dat)
        self.Dat[self.N:self.N + l] = dat
        for i in range(self.N - 1, 0, -1):
            self.Dat[i] = self.Op(self.Dat[i << 1], self.Dat[i << 1 | 1])
    
    def push(self, k):
        if self.Laz[k] == self.Id:
            return
        lk, rk = k << 1, k << 1 | 1
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
            if ((lk >> i) << i) != lk:
                self.push(lk >> i)
            if ((rk >> i) << i) != rk:
                self.push(rk >> i)
    
    def updateFrom(self, k):
        k >>= 1
        while k > 0:
            self.Dat[k] = self.Op(self.Dat[k << 1], self.Dat[k << 1 | 1])
            k >>= 1
    
    def updateFromRange(self, lk, rk):
        for i in range(1, self.Log + 1):
            if ((lk >> i) << i) != lk:
                lki = lk >> i
                self.Dat[lki] = self.Op(self.Dat[lki << 1], self.Dat[lki << 1 | 1])
            if ((rk >> i) << i) != rk:
                rki = (rk - 1) >> i
                self.Dat[rki] = self.Op(self.Dat[rki << 1], self.Dat[rki << 1 | 1])
    
    def set(self, p, x):
        self.exclusiveRangeCheck(p)
        p += self.N
        self.pushTo(p)
        self.Dat[p] = x
        self.updateFrom(p)
    
    def get(self, p):
        self.exclusiveRangeCheck(p)
        p += self.N
        self.pushTo(p)
        return self.Dat[p]
    
    def allProd(self):
        return self.Dat[1]
    
    def apply(self, p, f):
        self.exclusiveRangeCheck(p)
        p += self.N
        self.pushTo(p)
        self.Dat[p] = self.Mapping(f, self.Dat[p])
        self.updateFrom(p)
    
    def applyRange(self, l, r, f):
        if l > r:
            raise ValueError(f"Invalid range: [{l}, {r})")
        self.inclusiveRangeCheck(l)
        self.inclusiveRangeCheck(r)
        if l == r:
            return
        l += self.N
        r += self.N
        self.pushToRange(l, r)
        l2, r2 = l, r
        while l2 < r2:
            if (l2 & 1) == 1:
                self.Dat[l2] = self.Mapping(f, self.Dat[l2])
                if l2 < self.N:
                    self.Laz[l2] = self.Composition(f, self.Laz[l2])
                l2 += 1
            if (r2 & 1) == 1:
                r2 -= 1
                self.Dat[r2] = self.Mapping(f, self.Dat[r2])
                if r2 < self.N:
                    self.Laz[r2] = self.Composition(f, self.Laz[r2])
            l2 >>= 1
            r2 >>= 1
        self.updateFromRange(l, r)
    
    def maxRight(self, l, g):
        self.inclusiveRangeCheck(l)
        if not g(self.E):
            raise ValueError("Identity element must satisfy the condition.")
        if l == self.MAX:
            return self.MAX
        l += self.N
        self.pushTo(l)
        sum_val = self.E
        while True:
            l >>= (l & -l).bit_length() - 1
            if not g(self.Op(sum_val, self.Dat[l])):
                while l < self.N:
                    self.push(l)
                    l <<= 1
                    if g(self.Op(sum_val, self.Dat[l])):
                        sum_val = self.Op(sum_val, self.Dat[l])
                        l += 1
                return l - self.N
            sum_val = self.Op(sum_val, self.Dat[l])
            l += 1
            if (l & -l) == l:
                break
        return self.MAX
    
    def minLeft(self, r, g):
        self.inclusiveRangeCheck(r)
        if not g(self.E):
            raise ValueError("Identity element must satisfy the condition.")
        if r == 0:
            return 0
        r += self.N
        self.pushTo(r - 1)
        sum_val = self.E
        while True:
            r -= 1
            while r > 1 and (r & 1) == 1:
                r >>= 1
            if not g(self.Op(self.Dat[r], sum_val)):
                while r < self.N:
                    self.push(r)
                    r = r << 1 | 1
                    if g(self.Op(self.Dat[r], sum_val)):
                        sum_val = self.Op(self.Dat[r], sum_val)
                        r -= 1
                return r + 1 - self.N
            sum_val = self.Op(self.Dat[r], sum_val)
            if (r & -r) == r:
                break
        return 0
    
    def exclusiveRangeCheck(self, p):
        if p < 0 or p >= self.MAX:
            raise IndexError(f"Index {p} is not in [0, {self.MAX}).")
    
    def inclusiveRangeCheck(self, p):
        if p < 0 or p > self.MAX:
            raise IndexError(f"Index {p} is not in [0, {self.MAX}].")

class InputReader:
    def __init__(self, in_stream):
        self.in_stream = in_stream
        self.buffer = bytearray(1024)
        self.curbuf = 0
        self.lenbuf = 0
    
    def hasNextByte(self):
        if self.curbuf >= self.lenbuf:
            self.curbuf = 0
            self.lenbuf = self.in_stream.readinto(self.buffer)
            if self.lenbuf <= 0:
                return False
        return True
    
    def readByte(self):
        if self.hasNextByte():
            byte = self.buffer[self.curbuf]
            self.curbuf += 1
            return byte
        else:
            return -1
    
    def isSpaceChar(self, c):
        return not (33 <= c <= 126)
    
    def skip(self):
        while self.hasNextByte() and self.isSpaceChar(self.buffer[self.curbuf]):
            self.curbuf += 1
    
    def hasNext(self):
        self.skip()
        return self.hasNextByte()
    
    def next(self):
        if not self.hasNext():
            raise Exception("No more elements")
        sb = []
        b = self.readByte()
        while not self.isSpaceChar(b):
            sb.append(b)
            b = self.readByte()
        return bytes(sb).decode()
    
    def nextInt(self):
        if not self.hasNext():
            raise Exception("No more elements")
        c = self.readByte()
        while self.isSpaceChar(c):
            c = self.readByte()
        minus = False
        if c == ord('-'):
            minus = True
            c = self.readByte()
        res = 0
        while not self.isSpaceChar(c):
            if c < ord('0') or c > ord('9'):
                raise ValueError("Invalid input")
            res = res * 10 + (c - ord('0'))
            c = self.readByte()
        return -res if minus else res
    
    def nextLong(self):
        if not self.hasNext():
            raise Exception("No more elements")
        c = self.readByte()
        while self.isSpaceChar(c):
            c = self.readByte()
        minus = False
        if c == ord('-'):
            minus = True
            c = self.readByte()
        res = 0
        while not self.isSpaceChar(c):
            if c < ord('0') or c > ord('9'):
                raise ValueError("Invalid input")
            res = res * 10 + (c - ord('0'))
            c = self.readByte()
        return -res if minus else res
    
    def nextDouble(self):
        return float(self.next())
    
    def nextIntArray(self, n):
        return [self.nextInt() for _ in range(n)]
    
    def nextLongArray(self, n):
        return [self.nextLong() for _ in range(n)]
    
    def nextCharMap(self, n, m):
        return [list(self.next()) for _ in range(n)]

def main():
    global tenmod, inv9
    inv9 = modInv(9)
    sc = InputReader(sys.stdin)
    out = sys.stdout
    N = sc.nextInt()
    Q = sc.nextInt()
    tenmod = [1] * (N + 1)
    for j in range(1, N + 1):
        tenmod[j] = (tenmod[j - 1] * 10) % MOD2
    dat = [S(tenmod[N - i - 1], i, i) for i in range(N)]
    lazySegTree = LazySegTree(len(dat), S.op, S.E, S.map, F.composite, F.I)
    lazySegTree.build(dat)
    for _ in range(Q):
        l = sc.nextInt() - 1
        r = sc.nextInt() - 1
        D = sc.nextLong()
        lazySegTree.applyRange(l, r + 1, F(D, N))
        out.write(f"{lazySegTree.allProd().sum}\n")
    out.flush()

if __name__ == "__main__":
    main()

