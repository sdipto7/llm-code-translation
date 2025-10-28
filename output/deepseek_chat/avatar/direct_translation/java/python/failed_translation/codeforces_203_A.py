
import sys

class Codeforces203A:
    def __init__(self):
        pass

    def solve(self):
        x = int(input())
        t = int(input())
        a = int(input())
        b = int(input())
        da = int(input())
        db = int(input())
        ok = False
        for i in range(t):
            first = a - (da * i)
            for j in range(t):
                second = b - (db * j)
                if second + first == x or second == x or first == x or x == 0:
                    ok = True
                    break
        print("YES" if ok else "NO")

    def run(self):
        self.solve()

if __name__ == "__main__":
    Codeforces203A().run()

