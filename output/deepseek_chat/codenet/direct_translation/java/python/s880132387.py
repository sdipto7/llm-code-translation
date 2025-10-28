
import sys
import math
from random import Random

class Main:
    def __init__(self):
        self.sc = sys.stdin
        self.rand = Random()

    def run(self):
        while True:
            W, H = map(int, self.sc.readline().split())
            if W == 0 and H == 0:
                return
            map_ = [list(self.sc.readline().strip()) for _ in range(H)]
            dp = [[math.BigInteger(0) for _ in range(W)] for _ in range(H)]
            for h in range(H):
                for w in range(W):
                    hprev = math.BigInteger(0)
                    if h >= 1:
                        hprev = dp[h-1][w]
                    wprev = math.BigInteger(0)
                    if w >= 1:
                        wprev = dp[h][w-1]
                    if map_[h][w].isdigit():
                        max_ = hprev if hprev > wprev else wprev
                        dp[h][w] = max_ * math.BigInteger(10) + math.BigInteger(map_[h][w])
                    else:
                        dp[h][w] = math.BigInteger(0)
            max_ = math.BigInteger(0)
            for h in range(H):
                for w in range(W):
                    if dp[h][w] > max_:
                        max_ = dp[h][w]
            print(max_)

    def next_int_array(self, n):
        return [int(self.sc.readline()) for _ in range(n)]

if __name__ == "__main__":
    Main().run()

