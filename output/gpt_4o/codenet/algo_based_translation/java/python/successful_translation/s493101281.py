
import sys
import collections

MOD = 1000000007

class FastScanner:
    def __init__(self):
        self.buffer = sys.stdin.read().split()
        self.index = 0
    
    def next(self):
        if self.index >= len(self.buffer):
            raise StopIteration
        result = self.buffer[self.index]
        self.index += 1
        return result
    
    def nextInt(self):
        return int(self.next())
    
    def nextLong(self):
        return int(self.next())
    
    def nextDouble(self):
        return float(self.next())

class Pair:
    def __init__(self, key, value):
        self.key = key
        self.value = value
    
    def getKey(self):
        return self.key
    
    def getValue(self):
        return self.value

def gcd(m, n):
    while n != 0:
        m, n = n, m % n
    return m

def lcm(m, n):
    return m * n // gcd(m, n)

def main():
    sc = FastScanner()
    n = sc.nextInt()
    l = []
    
    for _ in range(n):
        l.append(sc.nextInt())
    
    l.sort()
    
    print(l[n // 2] - l[n // 2 - 1])

if __name__ == "__main__":
    main()

