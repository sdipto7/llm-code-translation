
class UnionFindTree:
    def __init__(self, n):
        self.par = list(range(n))
        self.rank = [0] * n

    def find(self, x):
        root = x
        while self.par[root] != root:
            root = self.par[root]
        while self.par[x] != root:
            next_par = self.par[x]
            self.par[x] = root
            x = next_par
        return root

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

import sys
def main():
    input = sys.stdin.read().split()
    ptr = 0
    n = int(input[ptr])
    ptr += 1
    m = int(input[ptr])
    ptr += 1
    utf = UnionFindTree(n)
    for _ in range(m):
        x = int(input[ptr]) - 1
        y = int(input[ptr+1]) - 1
        z = int(input[ptr+2])
        ptr +=3
        utf.unite(x, y)
    cnt = 0
    for i in range(n):
        if utf.par[i] == i:
            cnt +=1
    print(cnt)

if __name__ == "__main__":
    main()

