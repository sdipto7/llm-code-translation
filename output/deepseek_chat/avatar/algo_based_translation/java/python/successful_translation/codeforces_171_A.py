
import sys
from io import StringIO

class FastReader:
    def __init__(self):
        self.br = sys.stdin
        self.st = None
    
    def next(self):
        while self.st is None or not self.st:
            try:
                self.st = sys.stdin.readline().split()
            except:
                pass
        return self.st.pop(0)
    
    def nextInt(self):
        return int(self.next())
    
    def nextLong(self):
        return int(self.next())
    
    def nextDouble(self):
        return float(self.next())
    
    def nextLine(self):
        return sys.stdin.readline().rstrip()

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

