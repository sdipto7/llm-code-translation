import sys

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

    def dot(self, a, b):
        return a.x * b.x + a.y * b.y

    def cross(self, a, b):
        return a.x * b.y - a.y * b.x

    def isOrthogonal(self, a, b):
        return self.equals(self.dot(a, b), 0.0)

    def isOrthogonalPoints(self, a1, a2, b1, b2):
        return self.isOrthogonal(a1.diff(a2), b1.diff(b2))

    def isParallel(self, a, b):
        return self.equals(self.cross(a, b), 0.0)

    def isParallelPoints(self, a1, a2, b1, b2):
        return self.isParallel(a1.diff(a2), b1.diff(b2))

    def project(self, sp1, sp2, p):
        base = Vector(sp2.diff(sp1))
        r = self.dot(p.diff(sp1), base) / base.norm()
        return sp1.sum(base.multiple(r))

    def reflect(self, sp1, sp2, p):
        return p.sum(self.project(sp1, sp2, p).diff(p).multiple(2.0))

class Main:

    def run(self):
        import sys
        import math

        try:
            input = sys.stdin.read().split()
            iter_input = iter(input)

            p0 = Point2D(float(next(iter_input)), float(next(iter_input)))
            p1 = Point2D(float(next(iter_input)), float(next(iter_input)))
            q = int(next(iter_input))

            buf = []
            for _ in range(q):
                p2 = Point2D(float(next(iter_input)), float(next(iter_input)))
                buf.append(self.jadgeClockwise(p0, p1, p2) + "\n")

            sys.stdout.write(''.join(buf))

        except Exception as e:
            print(e)

    def jadgeClockwise(self, p0, p1, p2):
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

if __name__ == "__main__":
    main = Main()
    main.run()
