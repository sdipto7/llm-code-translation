
import sys
import bisect

class FastScanner:
    def __init__(self):
        self.buffer = sys.stdin.read().split()
        self.ptr = 0

    def next(self):
        self.ptr += 1
        return self.buffer[self.ptr - 1]

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return int(self.next())

    def next_double(self):
        return float(self.next())

def main():
    fs = FastScanner()
    n = fs.next_int()
    a = [fs.next_int() for _ in range(n)]
    a.sort()
    sum = 0
    count = 0
    for i in range(n - 1):
        sum += a[i]
        if a[i + 1] <= 2 * sum:
            count += 1
        else:
            count = 0
    print(count + 1)

main()

