
import sys

class FastReader:
    def __init__(self):
        self.it = iter(sys.stdin.read().split())

    def next(self):
        return next(self.it)

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return int(self.next())

    def nextDouble(self):
        return float(self.next())

    def nextLine(self):
        return sys.stdin.readline().strip()

def reverse(n):
    if n < 10:
        return n * 10
    t, r = n, 0
    while t > 0:
        r = r * 10 + t % 10
        t //= 10
    return r

def main():
    sc = FastReader()
    n = sc.nextInt()
    m = sc.nextInt()
    t = reverse(m)
    print(t + n)

if __name__ == "__main__":
    main()

