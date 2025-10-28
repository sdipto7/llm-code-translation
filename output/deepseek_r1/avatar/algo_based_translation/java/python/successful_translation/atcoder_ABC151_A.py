
class RemRing:
    def __init__(self, module):
        self.module = module

    def sum(self, a, b):
        return (a + b + self.module) % self.module

    def sub(self, a, b):
        return (a - b + self.module) % self.module

    def prod(self, a, b):
        return (a * b) % self.module

    def div(self, a, b):
        return (a * self.inv(b)) % self.module

    def inv(self, a):
        b = self.module
        u, v = 1, 0
        while b > 0:
            t = a // b
            a, b = b, a - t * b
            u, v = v, u - t * v
        u %= self.module
        if u < 0:
            u += self.module
        return u

if __name__ == "__main__":
    s = input().strip()
    print('%c' % chr(ord(s[0]) + 1))

