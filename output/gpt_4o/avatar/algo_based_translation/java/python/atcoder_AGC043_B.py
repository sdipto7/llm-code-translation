
import sys

class MyScanner:
    def __init__(self):
        self.tokens = []
        self.current_line = None
    
    def next(self):
        while not self.tokens:
            self.current_line = sys.stdin.readline()
            if not self.current_line:
                return None
            self.tokens = self.current_line.split()
        return self.tokens.pop(0)
    
    def nextInt(self):
        return int(self.next())
    
    def nextLong(self):
        return int(self.next())
    
    def nextDouble(self):
        return float(self.next())

class AtcoderAGC043B:
    def __init__(self):
        self.sc = MyScanner()
        self.out = sys.stdout
    
    def cal(self, s, c):
        n = len(s)
        m = n - 1
        ans = 0
        for i in range(n):
            if s[i] == c and (m & i) == i:
                ans ^= 1
        return ans
    
    def solve(self):
        n = self.sc.nextInt()
        s = self.sc.next()
        sb = []
        for i in range(1, n):
            sb.append(str(abs(ord(s[i]) - ord(s[i - 1]))))
        
        if n == 2:
            self.out.write(str(sb[0]) + '\n')
            return
        
        s = ''.join(sb)
        if '1' in s:
            self.out.write(str(self.cal(s, '1')) + '\n')
        else:
            self.out.write(str(self.cal(s, '2') * 2) + '\n')

if __name__ == "__main__":
    problem_instance = AtcoderAGC043B()
    problem_instance.solve()

