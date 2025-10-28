
import sys
import math

class Point2D:
    EPS = 1e-10
    
    def __init__(self, x=0.0, y=0.0):
        self.x = x
        self.y = y
    
    def equals(self, a, b):
        return abs(a - b) < self.EPS
    
    def sum(self, b):
        return Point2D(self.x + b.x, self.y + b.y)
    
    def diff(self, b):
        return Point2D(self.x - b.x, self.y - b.y)
    
    def multiple(self, k):
        return Point2D(self.x * k, self.y * k)
    
    def norm(self):
        return self.x * self.x + self.y * self.y
    
    def abs(self):
        return math.sqrt(self.norm())
    
    def __str__(self):
        return f"{self.x:.10f} {self.y:.10f}"

class Vector(Point2D):
    def __init__(self, x=0.0, y=0.0):
        super().__init__(x, y)
    
    def from_point(self, p):
        return Vector(p.x, p.y)
    
    def dot(self, a, b):
        return a.x * b.x + a.y * b.y
    
    def cross(self, a, b):
        return a.x * b.y - a.y * b.x
    
    def is_orthogonal(self, a, b):
        return self.equals(self.dot(a, b), 0.0)
    
    def is_orthogonal_points(self, a1, a2, b1, b2):
        return self.is_orthogonal(a1.diff(a2), b1.diff(b2))
    
    def is_parallel(self, a, b):
        return self.equals(self.cross(a, b), 0.0)
    
    def is_parallel_points(self, a1, a2, b1, b2):
        return self.is_parallel(a1.diff(a2), b1.diff(b2))
    
    def project(self, sp1, sp2, p):
        base = Vector(sp2.x - sp1.x, sp2.y - sp1.y)
        r = self.dot(p.diff(sp1), base) / base.norm()
        return sp1.sum(base.multiple(r))
    
    def reflect(self, sp1, sp2, p):
        proj = self.project(sp1, sp2, p)
        return p.sum(proj.diff(p).multiple(2.0))

def jadge_clockwise(p0, p1, p2):
    v = Vector()
    a = p1.diff(p0)
    b = p2.diff(p0)
    
    cross_val = v.cross(a, b)
    if cross_val > v.EPS:
        return "COUNTER_CLOCKWISE"
    if cross_val < -v.EPS:
        return "CLOCKWISE"
    
    dot_val = v.dot(a, b)
    if dot_val < -v.EPS:
        return "ONLINE_BACK"
    
    if a.norm() < b.norm():
        return "ONLINE_FRONT"
    
    return "ON_SEGMENT"

def main():
    data = sys.stdin.read().split()
    if not data:
        return
    
    idx = 0
    x0 = int(data[idx]); y0 = int(data[idx+1]); idx += 2
    x1 = int(data[idx]); y1 = int(data[idx+1]); idx += 2
    q = int(data[idx]); idx += 1
    
    p0 = Point2D(x0, y0)
    p1 = Point2D(x1, y1)
    
    results = []
    for i in range(q):
        x2 = int(data[idx]); y2 = int(data[idx+1]); idx += 2
        p2 = Point2D(x2, y2)
        result = jadge_clockwise(p0, p1, p2)
        results.append(result)
    
    for res in results:
        print(res)

if __name__ == "__main__":
    main()

