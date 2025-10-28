
import sys
from collections import defaultdict

class FastScanner:
    def __init__(self):
        self.br = sys.stdin
        self.st = []

    def next(self):
        while not self.st:
            try:
                self.st = sys.stdin.readline().strip().split()
            except Exception as e:
                print(e)
        return self.st.pop(0)

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return int(self.next())

    def nextDouble(self):
        return float(self.next())

    def nextLine(self):
        return sys.stdin.readline().strip()

def main():
    input = FastScanner()
    n = input.nextInt()
    map = defaultdict(int)
    for i in range(n):
        val = input.nextInt()
        map[val] += 1
    max_val = float('-inf')
    for value in map.values():
        max_val = max(max_val, value)
    print(str(max_val) + str(len(map)))

if __name__ == "__main__":
    main()

