
class UnionFindTree:
    def __init__(self, n):
        self.n = n
        self.par = list(range(n))
        self.rank = [0] * n

    def find(self, x):
        if self.par[x] == x:
            return x
        else:
            self.par[x] = self.find(self.par[x])
            return self.par[x]

    def unite(self, x, y):
        x = self.find(x)
        y = self.find(y)
        if x == y:
            return
        if self.rank[x] < self.rank[y]:
            self.par[x] = y
        else:
            self.par[y] = x
            if self.rank[x] == self.rank[y]:
                self.rank[x] += 1

    def same(self, x, y):
        return self.find(x) == self.find(y)

MOD = 1000000007

def main():
    import sys
    sc = sys.stdin.read().split()
    n = int(sc[0])
    utf = UnionFindTree(n)
    m = int(sc[1])
    idx = 2
    for _ in range(m):
        x = int(sc[idx]) - 1
        y = int(sc[idx + 1]) - 1
        z = int(sc[idx + 2])
        utf.unite(x, y)
        idx += 3
    cnt = 0
    for i in range(n):
        if utf.par[i] == i:
            cnt += 1
    print(cnt)

if __name__ == "__main__":
    main()

