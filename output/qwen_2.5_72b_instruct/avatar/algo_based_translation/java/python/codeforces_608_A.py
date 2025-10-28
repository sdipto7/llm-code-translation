
import sys

class FastScanner:
    def __init__(self):
        self.br = sys.stdin
        self.st = []
    
    def next(self):
        while not self.st:
            try:
                self.st = sys.stdin.readline().split()
            except ValueError:
                return None
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
    sc = FastScanner()
    o = sys.stdout
    n = sc.nextInt()
    s = sc.nextInt()
    max_val = 0
    while n > 0:
        n -= 1
        f = sc.nextInt()
        t = sc.nextInt()
        if max_val < f + t:
            max_val = f + t
    o.write(f"{max(max_val, s)}\n")
    o.flush()

if __name__ == "__main__":
    main()

