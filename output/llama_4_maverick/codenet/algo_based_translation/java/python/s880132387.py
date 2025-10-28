
import sys

class Main:
    def __init__(self):
        self.sc = sys.stdin.readline

    def next_int(self):
        return int(self.sc().strip())

    def next_int_array(self, n):
        return [int(x) for x in self.sc().strip().split()]

    def run(self):
        while True:
            try:
                W, H = self.next_int_array(2)
            except ValueError:
                break
            if W == 0 and H == 0:
                return
            map = []
            for _ in range(H):
                map.append(list(self.sc().strip()))
            dp = [[0 for _ in range(W)] for _ in range(H)]
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
                    max_val = max(max_val, dp[h][w])
            print(max_val)

    def main(self):
        self.run()

if __name__ == "__main__":
    Main().main()

