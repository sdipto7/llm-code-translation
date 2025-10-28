
import sys

class Point2D:
    def __init__(self, x, y):
        self.x = x
        self.y = y
    
    def diff(self, other):
        return Point2D(self.x - other.x, self.y - other.y)
    
    def norm(self):
        return self.x ** 2 + self.y ** 2

def cross(a, b):
    return a.x * b.y - a.y * b.x

def dot(a, b):
    return a.x * b.x + a.y * b.y

def jadge_clockwise(p0, p1, p2):
    EPS = 1e-10
    a = p1.diff(p0)
    b = p2.diff(p0)
    cross_val = cross(a, b)
    
    if cross_val > EPS:
        return "COUNTER_CLOCKWISE"
    elif cross_val < -EPS:
        return "CLOCKWISE"
    
    dot_val = dot(a, b)
    if dot_val < -EPS:
        return "ONLINE_BACK"
    elif a.norm() < b.norm():
        return "ONLINE_FRONT"
    else:
        return "ON_SEGMENT"

def main():
    input_lines = [line.strip() for line in sys.stdin if line.strip()]
    ptr = 0
    
    x0, y0, x1, y1 = map(int, input_lines[ptr].split())
    ptr += 1
    p0 = Point2D(x0, y0)
    p1 = Point2D(x1, y1)
    
    q = int(input_lines[ptr])
    ptr += 1
    
    results = []
    for _ in range(q):
        x2, y2 = map(int, input_lines[ptr].split())
        ptr += 1
        p2 = Point2D(x2, y2)
        results.append(jadge_clockwise(p0, p1, p2))
    
    print('\n'.join(results))

if __name__ == "__main__":
    main()

