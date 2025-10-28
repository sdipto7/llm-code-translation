
import sys
from collections import defaultdict

class FastReader:
    def __init__(self):
        self.br = sys.stdin

    def next(self):
        while True:
            try:
                return input()
            except EOFError:
                continue

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return int(self.next())

    def nextDouble(self):
        return float(self.next())

    def nextLine(self):
        return self.next()

def main():
    in = FastReader()
    n = in.nextInt()
    m = in.nextInt()
    bannedRow = set()
    bannedCol = set()
    for _ in range(m):
        r = in.nextInt()
        if r > 1 and r < n:
            bannedRow.add(r)
        c = in.nextInt()
        if c > 1 and c < n:
            bannedCol.add(c)
    answer = (n - 2) * 2
    answer -= len(bannedRow)
    answer -= len(bannedCol)
    if n % 2 != 0:
        mid = (n + 1) // 2
        if mid not in bannedRow and mid not in bannedCol:
            answer -= 1
    print(answer)

if __name__ == "__main__":
    main()

