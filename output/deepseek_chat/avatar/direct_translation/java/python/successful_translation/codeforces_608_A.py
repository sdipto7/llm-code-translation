
import sys
import math

def main():
    sc = Scanner()
    n = sc.nextInt()
    s = sc.nextInt()
    max_val = 0
    for _ in range(n):
        f = sc.nextInt()
        t = sc.nextInt()
        if max_val < f + t:
            max_val = f + t
    print(max(max_val, s))

class Scanner:
    def __init__(self):
        self.buffer = sys.stdin.read().split()
        self.pointer = 0

    def nextInt(self):
        value = int(self.buffer[self.pointer])
        self.pointer += 1
        return value

    def nextLong(self):
        value = int(self.buffer[self.pointer])
        self.pointer += 1
        return value

    def nextDouble(self):
        value = float(self.buffer[self.pointer])
        self.pointer += 1
        return value

    def next(self):
        value = self.buffer[self.pointer]
        self.pointer += 1
        return value

if __name__ == "__main__":
    main()

