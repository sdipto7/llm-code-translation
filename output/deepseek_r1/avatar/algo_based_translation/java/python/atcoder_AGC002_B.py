
class Box:
    def __init__(self, n, r):
        self.num = n
        self.red = r

    def moveTo(self, other):
        if self.num == 0:
            return
        elif self.num == 1:
            self.num = 0
            other.num += 1
            if self.red:
                other.red = True
                self.red = False
        else:
            self.num -= 1
            other.num += 1
            if self.red:
                other.red = True

N, M = map(int, input().split())
B = [Box(1, i == 0) for i in range(N)]
for _ in range(M):
    x, y = map(int, input().split())
    B[x-1].moveTo(B[y-1])
print(sum(b.red for b in B))

