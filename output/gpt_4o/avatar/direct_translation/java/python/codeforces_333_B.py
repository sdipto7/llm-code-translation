
import sys

class FastReader:
    def __init__(self):
        self.data = sys.stdin.read().split()
        self.index = 0
    
    def next(self):
        result = self.data[self.index]
        self.index += 1
        return result
    
    def nextInt(self):
        return int(self.next())
    
    def nextLong(self):
        return int(self.next())
    
    def nextDouble(self):
        return float(self.next())
    
    def nextLine(self):
        return self.next()

in_ = FastReader()
out = sys.stdout

def main():
    n = in_.nextInt()
    m = in_.nextInt()
    bannedRows = set()
    bannedCols = set()
    
    for _ in range(m):
        r = in_.nextInt()
        if r > 1 and r < n:
            bannedRows.add(r)
        c = in_.nextInt()
        if c > 1 and c < n:
            bannedCols.add(c)
    
    answer = (n - 2) * 2
    answer -= len(bannedRows)
    answer -= len(bannedCols)
    
    if n % 2 != 0:
        mid = (n + 1) // 2
        if mid not in bannedRows and mid not in bannedCols:
            answer -= 1
    
    out.write(str(answer) + '\n')

if __name__ == "__main__":
    main()

