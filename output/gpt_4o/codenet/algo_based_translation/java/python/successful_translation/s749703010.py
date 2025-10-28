
import sys
from collections import deque

class Pair:
    def __init__(self, a, b):
        self.l = a
        self.r = b

    def __str__(self):
        return f"{self.l} {self.r}"

memo = None
a = None
n = None

def dp(fliped, idx, msk):
    if msk == (1 << n) - 1:
        return 0
    if memo[fliped][idx][msk] != -1:
        return memo[fliped][idx][msk]
    x = bin(msk).count('1')
    ff = 0
    ans = int(1e9)
    for i in range(n):
        if (msk & (1 << i)) == 0:
            nf = x % 2
            if idx == n or a[fliped][idx] <= a[(nf + (ff % 2)) % 2][i]:
                ans = min(ans, ff + dp((nf + (ff % 2)) % 2, i, msk | 1 << i))
            ff += 1
        else:
            x -= 1
    memo[fliped][idx][msk] = ans
    return ans

class Scanner:
    def __init__(self, source):
        if isinstance(source, str):
            self.br = open(source, 'r')
        else:
            self.br = source
        self.st = deque()

    def next(self):
        while not self.st:
            line = self.br.readline()
            if line:
                self.st.extend(line.split())
            else:
                return None
        return self.st.popleft()

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return int(self.next())

    def nextLine(self):
        return self.br.readline().strip()

    def nextDouble(self):
        x = self.next()
        if x is None:
            return None
        return float(x)

    def ready(self):
        return bool(self.st) or self.br.peek()

def main():
    sc = Scanner(sys.stdin)
    global n, a, memo
    n = sc.nextInt()
    a = [[sc.nextInt() for _ in range(n)] for _ in range(2)]
    memo = [[[-1] * (1 << n) for _ in range(n + 1)] for _ in range(2)]
    ans = dp(0, n, 0)
    print(-1 if ans >= 1e8 else ans)

if __name__ == "__main__":
    main()

