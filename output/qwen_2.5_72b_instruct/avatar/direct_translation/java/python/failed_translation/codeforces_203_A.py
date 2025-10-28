
import sys

class codeforces_203_A:
    def solve(self):
        x = self.nextInt()
        t = self.nextInt()
        a = self.nextInt()
        b = self.nextInt()
        da = self.nextInt()
        db = self.nextInt()
        first = 0
        second = 0
        ok = False
        for i in range(t):
            first = a - (da * i)
            for j in range(t):
                second = b - (db * j)
                if second + first == x or second == x or first == x or x == 0:
                    ok = True
                    break
        if ok:
            self.out.write("YES\n")
        else:
            self.out.write("NO\n")

    def run(self):
        self.br = sys.stdin
        self.out = sys.stdout
        self.solve()
        self.out.flush()

    def nextInt(self):
        return int(self.next())

    def next(self):
        while self.st == [] or len(self.st) == 0:
            try:
                self.st = self.br.readline().split()
            except:
                return "END_OF_FILE"
        return self.st.pop(0)

if __name__ == "__main__":
    codeforces_203_A().run()

