
import sys
import math

class Point2D:
    def __init__(self, x=0, y=0):
        self.x = x
        self.y = y
        self.EPS = 1e-10

    def __eq__(self, other):
        return abs(self.x - other.x) < self.EPS and abs(self.y - other.y) < self.EPS

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
    def __init__(self, x=0, y=0):
        super().__init__(x, y)

    def dot(self, a, b):
        return a.x * b.x + a.y * b.y

    def cross(self, a, b):
        return a.x * b.y - a.y * b.x

    def is_orthogonal(self, a, b):
        return abs(self.dot(a, b)) < self.EPS

    def is_parallel(self, a, b):
        return abs(self.cross(a, b)) < self.EPS

    def project(self, sp1, sp2, p):
        base = Vector(sp2.diff(sp1))
        r = self.dot(p.diff(sp1), base) / base.norm()
        return sp1.sum(base.multiple(r))

    def reflect(self, sp1, sp2, p):
        return p.sum(self.project(sp1, sp2, p).diff(p).multiple(2.0))

def main():
    p0 = Point2D()
    p1 = Point2D()
    p2 = Point2D()
    line = sys.stdin.readline().split()
    p0.x, p0.y = int(line[0]), int(line[1])
    p1.x, p1.y = int(line[2]), int(line[3])
    q = int(sys.stdin.readline())

    for _ in range(q):
        line = sys.stdin.readline().split()
        p2.x, p2.y = int(line[0]), int(line[1])
        print(judge_clockwise(p0, p1, p2))

def judge_clockwise(p0, p1, p2):
    v = Vector()
    a = p1.diff(p0)
    b = p2.diff(p0)

    cross = v.cross(a, b)
    if cross > v.EPS:
        return "COUNTER_CLOCKWISE"
    if cross < -v.EPS:
        return "CLOCKWISE"
    if v.dot(a, b) < -v.EPS:
        return "ONLINE_BACK"
    if a.norm() < b.norm():
        return "ONLINE_FRONT"
    return "ON_SEGMENT"

if __name__ == "__main__":
    main()

