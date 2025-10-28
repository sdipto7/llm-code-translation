
import sys
from collections import deque

class FastReader:
    def __init__(self):
        self.br = sys.stdin
        self.st = deque()
    
    def next(self):
        while not self.st:
            try:
                self.st = deque(self.br.readline().split())
            except:
                pass
        return self.st.popleft()
    
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

def main():
    t = 1
    while t > 0:
        solve()
        t -= 1

def solve():
    scan = FastReader()
    t = scan.nextInt()
    arr = [0] * t
    for i in range(t):
        arr[i] = scan.nextInt()
    
    prevWinner = 0
    for i in range(t):
        if arr[i] == 1:
            if prevWinner == 0:
                prevWinner = 2
        
        if prevWinner == 2 or prevWinner == 0:
            if (arr[i] - 1) % 2 == 0:
                print(2)
                prevWinner = 2
            else:
                print(1)
                prevWinner = 1
        else:
            if (arr[i] - 1) % 2 == 0:
                print(1)
                prevWinner = 1
            else:
                print(2)
                prevWinner = 2

if __name__ == "__main__":
    main()

