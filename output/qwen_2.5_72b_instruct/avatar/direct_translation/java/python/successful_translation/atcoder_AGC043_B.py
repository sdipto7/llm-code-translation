import sys
import math

class atcoder_AGC043_B:
    def cal(self, s, c):
        n = len(s)
        m = n - 1
        ans = 0
        for i in range(n):
            if s[i] == c and (m & i) == i:
                ans ^= 1
        return ans

    def solve(self):
        n = sc.nextInt()
        s = sc.next()
        sb = []
        for i in range(1, n):
            sb.append(str(abs(ord(s[i]) - ord(s[i - 1]))))
        if n == 2:
            out.write(sb[0] + '\n')
            return
        s = ''.join(sb)
        if '1' in s:
            out.write(str(self.cal(s, '1')) + '\n')
        else:
            out.write(str(self.cal(s, '2') * 2) + '\n')

class MyScanner:
    def __init__(self):
        self.br = sys.stdin

    def next(self):
        self.tokens = self.br.readline().split()
        return self.tokens.pop(0)

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return int(self.next())

    def nextDouble(self):
        return float(self.next())

out = sys.stdout
sc = MyScanner()
atcoder_AGC043_B().solve()
