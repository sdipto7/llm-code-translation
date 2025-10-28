import sys
from io import StringIO
from collections import deque

class codeforces_203_A:
    def __init__(self):
        self.br = sys.stdin
        self.out = sys.stdout
        self.st = deque()

    def solve(self):
        x = self.nextInt()
        t = self.nextInt()
        a = self.nextInt()
        b = self.nextInt()
        da = self.nextInt()
        db = self.nextInt()
        ok = False
        for i in range(t):
            first = a - (da * i)
            for j in range(t):
                second = b - (db * j)
                if second + first == x or second == x or first == x or x == 0:
                    ok = True
                    break
            if ok:
                break
        if ok:
            self.out.write("YES\n")
        else:
            self.out.write("NO\n")

    def main(self):
        self.run()

    def run(self):
        try:
            self.solve()
        except IOError:
            pass

    def nextInt(self):
        return int(self.next())

    def next(self):
        while not self.st:
            self.st = deque(self.br.readline().split())
        return self.st.popleft()

if __name__ == "__main__":
    codeforces_203_A().main()
