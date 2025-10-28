
import sys

class FastReader:
    def __init__(self):
        self.tokens = []
        self.idx = 0
    
    def next(self):
        while self.idx >= len(self.tokens):
            line = sys.stdin.readline()
            if not line:
                return None
            self.tokens = line.split()
            self.idx = 0
        token = self.tokens[self.idx]
        self.idx += 1
        return token
    
    def nextInt(self):
        return int(self.next())
    
    def nextLong(self):
        return int(self.next())
    
    def nextDouble(self):
        return float(self.next())
    
    def nextLine(self):
        return sys.stdin.readline().strip()

def modPower(x, y, mod):
    x %= mod
    if x == 0:
        return 0
    res = 1
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
    in_reader = FastReader()
    a = [in_reader.nextLong() for _ in range(4)]
    max_val = max(a[0]*a[2], a[1]*a[3], a[0]*a[3], a[1]*a[2])
    print(max_val)

if __name__ == "__main__":
    main()

