
import sys
from decimal import Decimal

class Main:
    def __init__(self):
        self.sc = sys.stdin
        self.rand = __import__('random').Random()
    
    def run(self):
        while True:
            data = input().split()
            if not data:
                continue
            W = int(data[0])
            H = int(data[1])
            if W == 0 and H == 0:
                return
            
            map_data = []
            for h in range(H):
                row = input().strip()
                map_data.append(list(row))
            
            dp = [[Decimal(0) for _ in range(W)] for _ in range(H)]
            
            for h in range(H):
                for w in range(W):
                    hprev = Decimal(0)
                    if h >= 1:
                        hprev = dp[h-1][w]
                    wprev = Decimal(0)
                    if w >= 1:
                        wprev = dp[h][w-1]
                    
                    if map_data[h][w].isdigit():
                        max_val = hprev if hprev > wprev else wprev
                        dp[h][w] = max_val * Decimal(10) + Decimal(map_data[h][w])
                    else:
                        dp[h][w] = Decimal(0)
            
            max_result = Decimal(0)
            for h in range(H):
                for w in range(W):
                    if dp[h][w] > max_result:
                        max_result = dp[h][w]
            
            print(int(max_result))
    
    def next_int_array(self, n):
        res = []
        for i in range(n):
            res.append(int(input()))
        return res
    
    def pr(self, o):
        print(o, end='')
    
    def ln(self, o=None):
        if o is None:
            print()
        else:
            print(o)

if __name__ == '__main__':
    main = Main()
    main.run()

