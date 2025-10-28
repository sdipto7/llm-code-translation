
import sys
import math

EPS = 1e-10

class Point2D:
    def __init__(self, x=0.0, y=0.0):
        self.x = x
        self.y = y

    def sum(self, b):
        return Point2D(self.x + b.x, self.y + b.y)

    def diff(self, b):
        return Point2D(self.x - b.x, self.y - b.y)

    def multiple(self, k):
        return Point2D(self.x * k, self.y * k)

    def norm(self):
        return self.x * self.x + self.y * self.y

    def abs(self, a):
        return math.sqrt(a.norm())

    def equals(self, a, b):
        return math.isclose(a, b, abs_tol=EPS)

    def __str__(self):
        return f"{self.x:.10f} {self.y:.10f}"

class Vector(Point2D):
    def __init__(self, x=0.0, y=0.0):
        super().__init__(x, y)

    def dot(self, a, b):
        return a.x * b.x + a.y * b.y

    def cross(self, a, b):
        return a.x * b.y - a.y * b.x

    def isOrthogonal(self, a, b):
        return self.equals(self.dot(a, b), 0.0)

    def isOrthogonal(self, a1, a2, b1, b2):
        return self.isOrthogonal(a1.diff(a2), b1.diff(b2))

    def isParallel(self, a, b):
        return self.equals(self.cross(a, b), 0.0)

    def isParallel(self, a1, a2, b1, b2):
        return self.isParallel(a1.diff(a2), b1.diff(b2))

    def project(self, sp1, sp2, p):
        base = Vector(sp2.diff(sp1))
        r = self.dot(p.diff(sp1), base) / base.norm()
        return sp1.sum(base.multiple(r))

    def reflect(self, sp1, sp2, p):
        return p.sum(self.project(sp1, sp2, p).diff(p).multiple(2.0))

def judgeClockwise(p0, p1, p2):
    v = Vector()
    a = p1.diff(p0)
    b = p2.diff(p0)

    if v.cross(a, b) > EPS:
        return "COUNTER_CLOCKWISE"
    if v.cross(a, b) < -EPS:
        return "CLOCKWISE"
    if v.dot(a, b) < -EPS:
        return "ONLINE_BACK"
    if a.norm() < b.norm():
        return "ONLINE_FRONT"

    return "ON_SEGMENT"

def main():
    input = sys.stdin.read
    data = input().split()
    index = 0

    p0 = Point2D(int(data[index]), int(data[index+1]))
    index += 2
    p1 = Point2D(int(data[index]), int(data[index+1]))
    index += 2
    q = int(data[index])
    index += 1

    results = []
    for _ in range(q):
        p2 = Point2D(int(data[index]), int(data[index+1]))
        index += 2
        results.append(judgeClockwise(p0, p1, p2))

    for result in results:
        print(result)

if __name__ == "__main__":
    main()

