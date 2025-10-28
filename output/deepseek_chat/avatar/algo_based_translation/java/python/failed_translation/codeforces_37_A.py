
import sys
from collections import defaultdict

class FastScanner:
    def __init__(self):
        self.br = sys.stdin
        self.st = []
    
    def next(self):
        while not self.st:
            try:
                self.st = self.br.readline().split()
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
        return self.br.readline().strip()

def main():
    input = FastScanner()
    n = input.nextInt()
    map = defaultdict(int)
    for i in range(n):
        val = input.nextInt()
        map[val] += 1
    max_val = -10**9
    for count in map.values():
        if count > max_val:
            max_val = count
    print(f"{max_val}{len(map)}")

if __name__ == "__main__":
    main()

