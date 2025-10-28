import sys

class FastScanner:
    def __init__(self):
        self.in_ = sys.stdin
        self.buffer = []
        self.next_token = None

    def _fill_buffer(self):
        self.buffer = self.in_.readline().split()
        self.next_token = 0

    def _has_next(self):
        return self.next_token < len(self.buffer)

    def next(self):
        if not self._has_next():
            self._fill_buffer()
        token = self.buffer[self.next_token]
        self.next_token += 1
        return token

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return int(self.next())

    def nextDouble(self):
        return float(self.next())

def main():
    fs = FastScanner()
    n = fs.nextInt()
    a = [0] * n
    for i in range(n):
        a[i] = fs.nextInt()
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

if __name__ == "__main__":
    main()
