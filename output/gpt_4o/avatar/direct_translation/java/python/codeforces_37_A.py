
import sys
from collections import defaultdict

class FastScanner:
    def __init__(self):
        self.input = sys.stdin
        self.tokens = []
    
    def next(self):
        while not self.tokens:
            line = self.input.readline()
            if not line:
                break
            self.tokens = line.split()
        return self.tokens.pop(0) if self.tokens else None
    
    def nextInt(self):
        return int(self.next())

def main():
    input = FastScanner()
    n = input.nextInt()
    map = defaultdict(int)
    for _ in range(n):
        val = input.nextInt()
        map[val] += 1
    max_value = max(map.values())
    print(f"{max_value} {len(map)}")

if __name__ == "__main__":
    main()

