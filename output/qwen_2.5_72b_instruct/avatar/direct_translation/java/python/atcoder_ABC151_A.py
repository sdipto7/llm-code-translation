
import sys

class atcoder_ABC151_A:
    @staticmethod
    def main():
        r = sys.stdin.readline().strip()
        print(chr(ord(r[0]) + 1))

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
        u = 1
        v = 0
        while b > 0:
            t = a // b
            a -= t * b
            u -= t * v
            a, b = b, a
            u, v = v, u
        u %= self.module
        if u < 0:
            u += self.module
        return u

if __name__ == "__main__":
    atcoder_ABC151_A.main()

