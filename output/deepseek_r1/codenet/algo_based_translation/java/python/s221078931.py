
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
        self_diag = self.diagonal()
        other_diag = other.diagonal()
        if self_diag < other_diag:
            return True
        elif self_diag == other_diag:
            return self.height < other.height
        else:
            return False

rects = [IntegralRect(h, w) for h in range(1, 201) for w in range(1, 201)]
rects.sort()

for line in sys.stdin:
    line = line.strip()
    if not line:
        continue
    h, w = map(int, line.split())
    if h == 0 and w == 0:
        break
    tmp_rect = IntegralRect(h, w)
    for rect in rects:
        if tmp_rect < rect:
            print(f"{rect.height} {rect.width}")
            break

