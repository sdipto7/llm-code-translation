
import sys

class FastReader:
    def __init__(self):
        self.buffer = sys.stdin.read().split()
        self.index = 0

    def next(self):
        result = self.buffer[self.index]
        self.index += 1
        return result

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return int(self.next())

    def nextDouble(self):
        return float(self.next())

    def nextLine(self):
        return self.next()

def modPower(x, y, mod):
    res = 1
    x %= mod
    if x == 0:
        return 0
    while y > 0:
        if y % 2 == 1:
            res = (res * x) % mod
        y = y >> 1
        x = (x * x) % mod
    return res

class Pair:
    def __init__(self, first, second):
        self.first = first
        self.second = second

if __name__ == "__main__":
    in_reader = FastReader()
    a = [0] * 4
    for i in range(4):
        a[i] = in_reader.nextLong()
    result = max(a[0] * a[2], a[1] * a[3], a[0] * a[3], a[1] * a[2])
    print(result)

