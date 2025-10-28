
import sys

class FastScanner:
    def __init__(self):
        self.stdin = sys.stdin
        self.st = []
    
    def next(self):
        while not self.st:
            line = self.stdin.readline()
            if not line:
                return None
            self.st = line.strip().split()
        return self.st.pop(0)
    
    def nextInt(self):
        return int(self.next())

def main():
    fs = FastScanner()
    n = fs.nextInt()
    counts = {}
    for _ in range(n):
        val = fs.nextInt()
        counts[val] = counts.get(val, 0) + 1
    max_count = max(counts.values()) if counts else -2147483648
    print(f"{max_count}{len(counts)}")

if __name__ == "__main__":
    main()

