
import sys

class IntegralRect:
    def __init__(self, h, w):
        self.height = h
        self.width = w

    def diagonal(self):
        if self.height >= self.width:
            return float('inf')
        return self.height * self.height + self.width * self.width

    def __lt__(self, other):
        d1 = self.diagonal()
        d2 = other.diagonal()
        return (d1 < d2) or (d1 == d2 and self.height < other.height)

def main():
    import sys
    from bisect import bisect_left

    rects = [IntegralRect(i + 1, j + 1) for i in range(200) for j in range(200)]
    rects.sort()

    for line in sys.stdin:
        tmpArray = line.split()
        h = int(tmpArray[0])
        w = int(tmpArray[1])

        if h == 0 and w == 0:
            break

        tmpRect = IntegralRect(h, w)
        index = bisect_left(rects, tmpRect)
        if index < len(rects):
            print(f"{rects[index].height} {rects[index].width}")

if __name__ == "__main__":
    main()

