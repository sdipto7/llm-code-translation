
import sys

class IntegralRect:
    def __init__(self, h, w):
        self.height = h
        self.width = w

    def diagonal(self):
        if self.height >= self.width:
            return sys.maxsize
        return self.height**2 + self.width**2

    def __lt__(self, other):
        d1 = self.diagonal()
        d2 = other.diagonal()
        if d1 == d2:
            return self.height < other.height
        return d1 < d2

def main():
    rects = [IntegralRect(i + 1, j + 1) for i in range(200) for j in range(200)]
    rects.sort()

    for line in sys.stdin:
        tmp_array = line.strip().split()
        if len(tmp_array) != 2:
            continue
        h, w = map(int, tmp_array)
        if h == 0 and w == 0:
            break

        tmp_rect = IntegralRect(h, w)
        for rect in rects:
            if rect > tmp_rect:
                print(rect.height, rect.width)
                break

if __name__ == "__main__":
    main()

