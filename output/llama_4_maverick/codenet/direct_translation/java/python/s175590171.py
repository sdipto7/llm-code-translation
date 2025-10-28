
import sys

class FastScanner:
    def __init__(self):
        self.buffer = sys.stdin.read().split()
        self.index = 0

    def hasNext(self):
        return self.index < len(self.buffer)

    def next(self):
        s = self.buffer[self.index]
        self.index += 1
        return s

    def nextLong(self):
        return int(self.next())

    def nextInt(self):
        return int(self.next())

    def nextDouble(self):
        return float(self.next())

def main():
    fs = FastScanner()
    n = fs.nextInt()
    a = [fs.nextInt() for _ in range(n)]
    a.sort()
    sum_val = 0
    count = 0
    for i in range(n - 1):
        sum_val += a[i]
        if a[i + 1] <= 2 * sum_val:
            count += 1
        else:
            count = 0
    print(count + 1)

if __name__ == "__main__":
    main()

