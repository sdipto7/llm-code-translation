
import sys
from collections import defaultdict

class FastReader:
    def __init__(self):
        self.input = sys.stdin.read
        self.data = None
        self.index = 0

    def next(self):
        if self.data is None:
            self.data = self.input().split()
        while self.index >= len(self.data):
            self.data = input().split()
            self.index = 0
        token = self.data[self.index]
        self.index += 1
        return token

    def nextInt(self):
        return int(self.next())

def main():
    reader = FastReader()
    n = reader.nextInt()
    m = reader.nextInt()

    bannedRows = set()
    bannedCols = set()

    for _ in range(m):
        r = reader.nextInt()
        if 1 < r < n:
            bannedRows.add(r)
        c = reader.nextInt()
        if 1 < c < n:
            bannedCols.add(c)

    answer = (n - 2) * 2
    answer -= len(bannedRows)
    answer -= len(bannedCols)

    if n % 2 != 0:
        mid = (n + 1) // 2
        if mid not in bannedRows and mid not in bannedCols:
            answer -= 1

    print(answer)

if __name__ == "__main__":
    main()

