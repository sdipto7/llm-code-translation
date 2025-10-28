
import sys
from collections import defaultdict

class FastScanner:
    def __init__(self):
        self.input = sys.stdin
        self.st = iter([])

    def next(self):
        try:
            value = next(self.st)
        except StopIteration:
            self.st = iter(self.input.readline().split())
            value = next(self.st)
        return value

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return int(self.next())

    def nextDouble(self):
        return float(self.next())

    def nextLine(self):
        return self.input.readline().strip()

def main():
    input = FastScanner()
    n = input.nextInt()
    
    map = defaultdict(int)
    
    for _ in range(n):
        val = input.nextInt()
        map[val] += 1
    
    max_frequency = max(map.values())
    
    print(max_frequency, len(map))

if __name__ == "__main__":
    main()

