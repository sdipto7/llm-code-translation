
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
        if d1 == d2:
            return self.height < other.height
        return d1 < d2

def main():
    rects = []
    for i in range(200):
        for j in range(200):
            rects.append(IntegralRect(i + 1, j + 1))
    
    rects.sort()
    
    for line in sys.stdin:
        tmpArray = line.split()
        h = int(tmpArray[0])
        w = int(tmpArray[1])
        
        if h == 0 and w == 0:
            break
        
        tmpRect = IntegralRect(h, w)
        
        for rect in rects:
            if rect.diagonal() > tmpRect.diagonal():
                print(f"{rect.height} {rect.width}")
                break
            elif rect.diagonal() == tmpRect.diagonal() and rect.height > tmpRect.height:
                print(f"{rect.height} {rect.width}")
                break

if __name__ == "__main__":
    main()

