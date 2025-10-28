
class FastReader:
    def __init__(self):
        import sys
        self.reader = sys.stdin
        self.buffer = None

    def next(self):
        while self.buffer is None or not self.buffer:
            self.buffer = self.reader.readline().strip().split()
        return self.buffer.pop(0)

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return int(self.next())

    def nextDouble(self):
        return float(self.next())

    def nextLine(self):
        return self.reader.readline().strip()

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

