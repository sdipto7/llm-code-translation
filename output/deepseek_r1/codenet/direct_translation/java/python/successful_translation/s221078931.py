class IntegralRect:
    def __init__(self, h, w):
        self.height = h
        self.width = w

    def __lt__(self, other):
        d1 = self.diagonal()
        d2 = other.diagonal()
        if d1 == d2:
            return self.height < other.height
        return d1 < d2

    def diagonal(self):
        if self.height < self.width:
            return self.height ** 2 + self.width ** 2
        else:
            return float('inf')

rects = []
for h in range(1, 201):
    for w in range(1, 201):
        rects.append(IntegralRect(h, w))

rects.sort()

while True:
    h, w = map(int, input().split())
    if h == 0 and w == 0:
        break
    tmp_rect = IntegralRect(h, w)
    for rect in rects:
        if rect > tmp_rect:
            print(rect.height, rect.width)
            break
