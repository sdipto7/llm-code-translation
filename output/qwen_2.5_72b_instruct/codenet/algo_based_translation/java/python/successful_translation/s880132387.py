
import sys
from random import Random
from typing import List

class Main:
    def __init__(self):
        self.sc = sys.stdin
        self.rand = Random()

    def run(self):
        while True:
            W, H = map(int, self.sc.readline().split())
            if W == 0 and H == 0:
                return
            map_ = [self.sc.readline().strip() for _ in range(H)]

            dp = [[0 for _ in range(W)] for _ in range(H)]

            for h in range(H):
                for w in range(W):
                    hprev = 0
                    if h >= 1:
                        hprev = dp[h-1][w]
                    wprev = 0
                    if w >= 1:
                        wprev = dp[h][w-1]
                    if map_[h][w].isdigit():
                        max_ = max(hprev, wprev)
                        dp[h][w] = max_ * 10 + int(map_[h][w])
                    else:
                        dp[h][w] = 0

            max_ = 0
            for h in range(H):
                for w in range(W):
                    if dp[h][w] > max_:
                        max_ = dp[h][w]

            print(max_)

    def nextIntArray(self, n: int) -> List[int]:
        return list(map(int, self.sc.readline().split()))

    def pr(self, o):
        sys.stdout.write(str(o))

    def ln(self, o=None):
        if o is not None:
            print(o)
        else:
            print()

if __name__ == "__main__":
    main = Main()
    main.run()

