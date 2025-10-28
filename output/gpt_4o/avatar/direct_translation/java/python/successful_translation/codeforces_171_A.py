
class FastReader:
    def __init__(self):
        import sys
        self.input = sys.stdin.read
        self.data = self.input().split()
        self.index = 0

    def next(self):
        result = self.data[self.index]
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

def reverse(n):
    if n < 10:
        return n * 10
    t = n
    r = 0
    while t > 0:
        r = (r * 10) + t % 10
        t = t // 10
    return r

def main():
    sc = FastReader()
    n = sc.nextInt()
    m = sc.nextInt()
    t = reverse(m)
    print(t + n)

if __name__ == "__main__":
    main()

