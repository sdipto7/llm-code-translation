
import sys
from typing import List

class FastScanner:
    def __init__(self, stream):
        self.br = stream
        self.st = None
    
    def next_int(self):
        return int(self.next())
    
    def next(self):
        while self.st is None or not self.st:
            line = self.br.readline().strip()
            if not line:
                continue
            self.st = line.split()
        return self.st.pop(0)

class TaskB:
    def solve(self, test_number, in_scanner, out_writer):
        n = in_scanner.next_int()
        a = [[''] * n for _ in range(n)]
        P = 37
        Q = 47
        powP = [0] * (n + 1)
        powQ = [0] * (n + 1)
        powP[0] = 1
        powQ[0] = 1
        for i in range(1, n + 1):
            powP[i] = powP[i - 1] * P
            powQ[i] = powQ[i - 1] * Q
        
        for i in range(n):
            line = in_scanner.next()
            a[i] = list(line)
        
        hashRow = [[0] * n for _ in range(n)]
        hashCol = [[0] * n for _ in range(n)]
        
        for i in range(n):
            for j in range(n):
                for k in range(n):
                    hashRow[i][k] += ord(a[i][j]) * powP[(j - k + n) % n]
                    hashCol[j][k] += ord(a[i][j]) * powP[(i - k + n) % n]
        
        ans = 0
        for A in range(n):
            for B in range(n):
                ok = True
                for i in range(n):
                    if hashRow[(i + A) % n][B] != hashCol[(i + B) % n][A]:
                        ok = False
                        break
                if ok:
                    ans += 1
        
        out_writer.write(str(ans) + '\n')

def main():
    in_scanner = FastScanner(sys.stdin)
    out_writer = sys.stdout
    solver = TaskB()
    solver.solve(1, in_scanner, out_writer)
    out_writer.flush()

if __name__ == '__main__':
    main()

