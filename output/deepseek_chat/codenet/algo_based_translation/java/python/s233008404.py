
import sys

class Main:
    def __init__(self):
        self.colorMtr = []
        self.h = 0
        self.w = 0
        self.k = 0

    def main(self):
        self.solve()

    def solve(self):
        fs = FastScanner()
        
        self.h = fs.nextInt()
        self.w = fs.nextInt()
        self.k = fs.nextInt()
        
        self.colorMtr = [['' for _ in range(self.w)] for _ in range(self.h)]
        for i in range(self.h):
            line = fs.next()
            for j in range(self.w):
                self.colorMtr[i][j] = line[j]
        
        hPattern = self.pow(2, self.h)
        wPattern = self.pow(2, self.w)
        
        ans = 0
        
        for i in range(hPattern):
            for j in range(wPattern):
                if self.judge(i, j):
                    ans += 1
        
        print(ans)

    def judge(self, hPattern, wPattern):
        hBitArr = [0] * self.h
        wBitArr = [0] * self.w
        
        for i in range(self.h):
            if ((hPattern >> i) & 1) == 1:
                hBitArr[i] = 1
        
        for i in range(self.w):
            if ((wPattern >> i) & 1) == 1:
                wBitArr[i] = 1
        
        black = 0
        
        for i in range(self.h):
            for j in range(self.w):
                if hBitArr[i] == 1 or wBitArr[j] == 1:
                    continue
                
                if self.colorMtr[i][j] == '#':
                    black += 1
        
        if black == self.k:
            return True
        else:
            return False

    def pow(self, base, n):
        retVal = 1
        while n > 0:
            if (n & 1) == 1:
                retVal *= base
            n >>= 1
            base *= base
        return retVal

class FastScanner:
    def __init__(self):
        self.st = []
        self.reader = sys.stdin
    
    def next(self):
        if not self.st:
            self.st = sys.stdin.readline().split()
        return self.st.pop(0)
    
    def nextLine(self):
        self.st = []
        return sys.stdin.readline()
    
    def nextInt(self):
        return int(self.next())
    
    def nextLong(self):
        return int(self.next())
    
    def nextIntArr(self, n):
        retArr = [0] * n
        for i in range(n):
            retArr[i] = self.nextInt()
        return retArr
    
    def nextLongArr(self, n):
        retArr = [0] * n
        for i in range(n):
            retArr[i] = self.nextLong()
        return retArr
    
    def close(self):
        pass

if __name__ == "__main__":
    mainObj = Main()
    mainObj.main()

