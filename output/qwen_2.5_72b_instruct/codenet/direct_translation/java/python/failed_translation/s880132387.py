import sys
import random

class Main:
    def __init__(self):
        self.sc = sys.stdin
        self.rand = random.Random()

    def run(self):
        while True:
            W, H = map(int, self.sc.readline().split())
            if W == 0 and H == 0:
                return
            map = [self.sc.readline().strip() for _ in range(H)]

            dp = [[0] * W for _ in range(H)]

            for h in range(H):
                for w in range(W):
                    hprev = 0
                    if h >= 1:
                        hprev = dp[h - 1][w]
                    wprev = 0
                    if w >= 1:
                        wprev = dp[h][w - 1]
                    if map[h][w].isdigit():
                        dp[h][w] = max(hprev, wprev) * 10 + int(map[h][w])
                    else:
                        dp[h][w] = 0

            max_val = 0
            for h in range(H):
                for w in range(W):
                    max_val = max(max_val, dp[h][w])
            print(max_val)

    def nextIntArray(self, n):
        return list(map(int, self.sc.readline().split()))

    def pr(self, o):
        sys.stdout.write(str(o))

    def ln(self, o=None):
        if o is not None:
            print(o)
        else:
            print()

if __name__ == "__main__":
    Main().run()
