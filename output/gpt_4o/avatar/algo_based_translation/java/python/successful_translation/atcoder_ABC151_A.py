
class RemRing:
    def __init__(self, module: int):
        self.module = module

    def sum(self, a: int, b: int) -> int:
        return (a + b + self.module) % self.module

    def sub(self, a: int, b: int) -> int:
        return (a - b + self.module) % self.module

    def prod(self, a: int, b: int) -> int:
        return (a * b) % self.module

    def div(self, a: int, b: int) -> int:
        return (a * self.inv(b)) % self.module

    def inv(self, a: int) -> int:
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

def main():
    import sys
    input = sys.stdin.read
    s = input().strip()
    print(chr(ord(s[0]) + 1))

if __name__ == "__main__":
    main()

