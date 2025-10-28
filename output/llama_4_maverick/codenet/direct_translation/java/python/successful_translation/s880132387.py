
import sys
from random import Random
from collections import defaultdict

class Main:
    def __init__(self):
        self.sc = self.Scanner(sys.stdin)
        self.rand = Random()

    def run(self):
        while True:
            W, H = self.sc.next_int(), self.sc.next_int()
            if W == 0 and H == 0:
                return
            map_ = [list(self.sc.next()) for _ in range(H)]
            dp = [[0] * W for _ in range(H)]

            for h in range(H):
                for w in range(W):
                    hprev = dp[h - 1][w] if h >= 1 else 0
                    wprev = dp[h][w - 1] if w >= 1 else 0
                    if map_[h][w].isdigit():
                        max_ = max(hprev, wprev)
                        dp[h][w] = max_ * 10 + int(map_[h][w])
                    else:
                        dp[h][w] = 0

            max_ = max(max(row) for row in dp)
            print(max_)

    class Scanner:
        def __init__(self, stream):
            self.stream = stream
            self.tokens = []

        def next(self):
            if not self.tokens:
                self.tokens = self.stream.readline().split()
            return self.tokens.pop(0)

        def next_int(self):
            return int(self.next())

if __name__ == "__main__":
    Main().run()

