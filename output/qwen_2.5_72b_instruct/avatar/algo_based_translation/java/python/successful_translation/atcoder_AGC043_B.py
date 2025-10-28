
import sys

class MyScanner:
    def __init__(self):
        self.br = sys.stdin
        self.st = None

    def next(self):
        while self.st is None or not self.st:
            try:
                self.st = next(self.br).split()
            except StopIteration:
                return None
        return self.st.pop(0)

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return int(self.next())

    def nextDouble(self):
        return float(self.next())

def cal(s, c):
    n = len(s)
    m = n - 1
    ans = 0
    for i in range(n):
        if s[i] == c and (m & i) == i:
            ans ^= 1
    return ans

def solve():
    sc = MyScanner()
    n = sc.nextInt()
    s = sc.next()
    sb = []
    for i in range(1, n):
        sb.append(str(abs(ord(s[i]) - ord(s[i - 1]))))
    if n == 2:
        print(sb[0])
        return
    s = ''.join(sb)
    if '1' in s:
        print(cal(s, '1'))
    else:
        print(cal(s, '2') * 2)

if __name__ == "__main__":
    solve()

