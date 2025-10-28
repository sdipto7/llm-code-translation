
import sys
from collections import *

class FastReader:
    def __init__(self):
        self.input = sys.stdin.read
        self.tokens = deque()

    def next(self):
        while not self.tokens:
            self.tokens = deque(self.input().split())
        return self.tokens.popleft()

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return int(self.next())

    def nextDouble(self):
        return float(self.next())

def main():
    in_ = FastReader()
    out = sys.stdout

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

    out.write(f"{answer}\n")

if __name__ == "__main__":
    main()

