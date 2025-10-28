
import sys

class IntegralRect:
    def __init__(self, h, w):
        self.height = h
        self.width = w

    def diagonal(self):
        if self.height >= self.width:
            return float('inf')
        return self.height**2 + self.width**2

    def __lt__(self, other):
        d1 = self.diagonal()
        d2 = other.diagonal()
        return d1 < d2 if d1 != d2 else self.height < other.height

def main():
    rects = []
    for i in range(1, 201):
        for j in range(1, 201):
            rects.append(IntegralRect(i, j))
    rects.sort()

    while True:
        h, w = map(int, sys.stdin.readline().split())
        if h == 0 and w == 0:
            break
        tmp_rect = IntegralRect(h, w)
        for rect in rects:
            if rect > tmp_rect:
                print(rect.height, rect.width)
                break

if __name__ == "__main__":
    main()

