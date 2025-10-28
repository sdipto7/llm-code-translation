import sys
import math

class FastReader:
    def __init__(self):
        self.br = sys.stdin

    def next(self):
        while self.st == [] or len(self.st) == 0:
            try:
                self.st = list(map(str, self.br.readline().split()))
            except:
                pass
        return self.st.pop(0)

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return int(self.next())

    def nextDouble(self):
        return float(self.next())

    def nextLine(self):
        try:
            return self.br.readline().strip()
        except:
            return ""

def reverse(n):
    if n < 10:
        return n * 10
    t = n
    r = 0
    while t > 0:
        r = (r * 10) + t % 10
        t = t // 10
    return r

sc = FastReader()
n = sc.nextInt()
m = sc.nextInt()
t = reverse(m)
print(t + n)
