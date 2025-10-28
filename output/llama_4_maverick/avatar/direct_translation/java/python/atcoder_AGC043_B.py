
import sys

class MyScanner:
    def __init__(self):
        self.br = sys.stdin

    def next(self):
        if not hasattr(self, 'st') or not self.st.hasMoreTokens():
            line = self.br.readline().decode().strip()
            self.st = line.split()
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

def solve(sc, out):
    n = sc.nextInt()
    s = sc.next()
    sb = ''
    for i in range(1, n):
        sb += str(abs(ord(s[i]) - ord(s[i-1])))
    if n == 2:
        out.write(sb + '\n')
        return
    s = sb
    if '1' in s:
        out.write(str(cal(s, '1')) + '\n')
    else:
        out.write(str(cal(s, '2') * 2) + '\n')

def main():
    sc = MyScanner()
    out = sys.stdout
    solve(sc, out)

if __name__ == "__main__":
    main()

