
import sys

class FastReader:
    def __init__(self):
        self.br = sys.stdin

    def next(self):
        while True:
            try:
                line = self.br.readline().strip()
                if not line:
                    continue
                self.st = iter(line.split())
                return next(self.st)
            except StopIteration:
                pass

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return int(self.next())

    def nextDouble(self):
        return float(self.next())

    def nextLine(self):
        return self.br.readline().strip()

def modPower(x, y, mod):
    res = 1
    x %= mod
    if x == 0:
        return 0
    while y > 0:
        if y % 2 == 1:
            res = (res * x) % mod
        y >>= 1
        x = (x * x) % mod
    return res

class Pair:
    def __init__(self, first, second):
        self.first = first
        self.second = second

def main():
    in_ = FastReader()
    a = [0] * 4
    for i in range(4):
        a[i] = in_.nextLong()
    print(max(a[0] * a[2], max(a[1] * a[3], max(a[0] * a[3], a[1] * a[2]))))

if __name__ == "__main__":
    main()

