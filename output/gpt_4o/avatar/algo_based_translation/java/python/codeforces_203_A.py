
import sys

class Codeforces203A:
    def __init__(self):
        self.br = sys.stdin
        self.out = sys.stdout
        self.st = None

    def solve(self):
        x = self.next_int()
        t = self.next_int()
        a = self.next_int()
        b = self.next_int()
        da = self.next_int()
        db = self.next_int()
        
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

    def next_int(self):
        return int(self.next())

    def next(self):
        while self.st is None or not self.st:
            self.st = self.br.readline().strip().split()
        return self.st.pop(0)

def main():
    codeforces_203_a = Codeforces203A()
    codeforces_203_a.solve()

if __name__ == "__main__":
    main()

