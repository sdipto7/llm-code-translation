
import math
import sys

class Point2D:
    EPS = 1e-10

    def __init__(self, x=0, y=0):
        self.x = x
        self.y = y

    def __eq__(self, other):
        return abs(self.x - other.x) < self.EPS and abs(self.y - other.y) < self.EPS

    def sum(self, other):
        return Point2D(self.x + other.x, self.y + other.y)

    def diff(self, other):
        return Point2D(self.x - other.x, self.y - other.y)

    def multiple(self, k):
        return Point2D(self.x * k, self.y * k)

    def norm(self):
        return self.x ** 2 + self.y ** 2

    def abs(self):
        return math.sqrt(self.norm())

class Vector(Point2D):
    def dot(self, a, b):
        return a.x * b.x + a.y * b.y

    def cross(self, a, b):
        return a.x * b.y - a.y * b.x

    def is_orthogonal(self, a, b):
        return abs(self.dot(a, b)) < self.EPS

    def is_orthogonal_segments(self, a1, a2, b1, b2):
        return self.is_orthogonal(a1.diff(a2), b1.diff(b2))

    def is_parallel(self, a, b):
        return abs(self.cross(a, b)) < self.EPS

    def is_parallel_segments(self, a1, a2, b1, b2):
        return self.is_parallel(a1.diff(a2), b1.diff(b2))

    def project(self, sp1, sp2, p):
        base = sp2.diff(sp1)
        r = self.dot(p.diff(sp1), base) / base.norm()
        return sp1.sum(base.multiple(r))

    def reflect(self, sp1, sp2, p):
        return p.sum(self.project(sp1, sp2, p).diff(p).multiple(2.0))

def jadge_clockwise(p0, p1, p2):
    v = Vector()
    a = p1.diff(p0)
    b = p2.diff(p0)
    if v.cross(a, b) > v.EPS:
        return "COUNTER_CLOCKWISE"
    if v.cross(a, b) < -v.EPS:
        return "CLOCKWISE"
    if v.dot(a, b) < -v.EPS:
        return "ONLINE_BACK"
    if a.norm() < b.norm():
        return "ONLINE_FRONT"
    return "ON_SEGMENT"

def main():
    lines = sys.stdin.readlines()
    line = list(map(int, lines[0].split()))
    p0 = Point2D(line[0], line[1])
    p1 = Point2D(line[2], line[3])
    q = int(lines[1])
    output = []
    for i in range(q):
        line = list(map(int, lines[i + 2].split()))
        p2 = Point2D(line[0], line[1])
        output.append(jadge_clockwise(p0, p1, p2))
    print("\n".join(output))

if __name__ == "__main__":
    main()

