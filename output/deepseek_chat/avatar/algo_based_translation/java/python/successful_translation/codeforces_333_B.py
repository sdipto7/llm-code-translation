
import sys
import math
from collections import defaultdict

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
        try:
            return sys.stdin.readline().rstrip()
        except:
            return ""

def main():
    in_reader = FastReader()
    n = in_reader.nextInt()
    m = in_reader.nextInt()
    
    banned_rows = set()
    banned_cols = set()
    
    for i in range(m):
        r = in_reader.nextInt()
        if r > 1 and r < n:
            banned_rows.add(r)
        c = in_reader.nextInt()
        if c > 1 and c < n:
            banned_cols.add(c)
    
    answer = (n - 2) * 2
    answer -= len(banned_rows)
    answer -= len(banned_cols)
    
    if n % 2 != 0:
        mid = (n + 1) // 2
        if mid not in banned_rows and mid not in banned_cols:
            answer -= 1
    
    print(answer)

if __name__ == "__main__":
    main()

