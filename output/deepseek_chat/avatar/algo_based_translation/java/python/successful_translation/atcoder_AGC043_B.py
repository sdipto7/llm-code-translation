
import sys
import io

class MyScanner:
    def __init__(self):
        self.br = sys.stdin
        self.st = None
    
    def next(self):
        while self.st is None or not self.st:
            try:
                self.st = self.br.readline().split()
            except:
                pass
        return self.st.pop(0)
    
    def nextInt(self):
        return int(self.next())
    
    def nextLong(self):
        return int(self.next())
    
    def nextDouble(self):
        return float(self.next())

class atcoder_AGC043_B:
    def __init__(self):
        pass
    
    def cal(self, s, c):
        n = len(s)
        m = n - 1
        ans = 0
        for i in range(n):
            if s[i] == c and (m & i) == i:
                ans ^= 1
        return ans
    
    def solve(self):
        sc = MyScanner()
        n = sc.nextInt()
        s = sc.next()
        sb = []
        for i in range(1, n):
            diff = abs(ord(s[i]) - ord(s[i-1]))
            sb.append(str(diff))
        if n == 2:
            print(sb[0])
            return
        s = ''.join(sb)
        if '1' in s:
            print(self.cal(s, '1'))
        else:
            print(self.cal(s, '2') * 2)

def main():
    sys.stdout = io.TextIOWrapper(sys.stdout.buffer, encoding='utf-8')
    solver = atcoder_AGC043_B()
    solver.solve()

if __name__ == '__main__':
    main()

