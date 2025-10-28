class Box:
    def __init__(self, num, red):
        self.num = num
        self.red = red

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
B = [Box(1, True)] + [Box(1, False) for _ in range(N-1)]

for _ in range(M):
    x, y = map(int, input().split())
    x -= 1
    y -= 1
    B[x].moveTo(B[y])

count = 0
for box in B:
    if box.red:
        count += 1
print(count)
