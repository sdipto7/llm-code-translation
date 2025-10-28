
import sys

class FastScanner:
    def __init__(self):
        self.br = sys.stdin
        self.st = []

    def next(self):
        while not self.st:
            self.st = sys.stdin.readline().strip().split()
        return self.st.pop(0)

    def nextLine(self):
        return sys.stdin.readline().strip()

    def nextByte(self):
        return int(self.next())

    def nextShort(self):
        return int(self.next())

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return int(self.next())

    def nextDouble(self):
        return float(self.next())

def main():
    in_scanner = FastScanner()
    n = int(in_scanner.next())
    s = int(in_scanner.next())
    max_value = 0
    while n > 0:
        n -= 1
        f = int(in_scanner.next())
        t = int(in_scanner.next())
        if max_value < f + t:
            max_value = f + t
    print(max(max_value, s))

if __name__ == "__main__":
    main()

