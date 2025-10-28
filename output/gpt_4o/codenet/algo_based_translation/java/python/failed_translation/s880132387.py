
import sys
from functools import reduce

class Main:
    def __init__(self):
        self.sc = sys.stdin

    def run(self):
        while True:
            line = self.sc.readline().strip()
            W, H = map(int, line.split())
            if W == 0 and H == 0:
                return
            
            map = []
            for _ in range(H):
                map.append(self.sc.readline().strip())
            
            dp = [[0] * W for _ in range(H)]
            
            for h in range(H):
                for w in range(W):
                    hprev = 0
                    if h >= 1:
                        hprev = dp[h-1][w]
                    
                    wprev = 0
                    if w >= 1:
                        wprev = dp[h][w-1]
                    
                    if map[h][w].isdigit():
                        max_val = max(hprev, wprev)
                        dp[h][w] = max_val * 10 + int(map[h][w])
                    else:
                        dp[h][w] = 0
            
            max_val = 0
            for h in range(H):
                for w in range(W):
                    if dp[h][w] > max_val:
                        max_val = dp[h][w]
            
            print(max_val)

if __name__ == '__main__':
    Main().run()

