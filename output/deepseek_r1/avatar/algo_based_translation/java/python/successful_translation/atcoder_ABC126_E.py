
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

def main():
    import sys
    input = sys.stdin.read().split()
    ptr = 0
    n = int(input[ptr])
    ptr += 1
    m = int(input[ptr])
    ptr += 1
    uft = UnionFindTree(n)
    for _ in range(m):
        x = int(input[ptr]) - 1
        y = int(input[ptr+1]) - 1
        z = int(input[ptr+2])
        ptr += 3
        uft.unite(x, y)
    cnt = 0
    for i in range(n):
        if uft.par[i] == i:
            cnt += 1
    print(cnt)

if __name__ == "__main__":
    main()

