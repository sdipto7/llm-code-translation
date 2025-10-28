
import sys
from collections import defaultdict

class Main:
    def __init__(self):
        self.br = sys.stdin.readline
        self.pw = sys.stdout.write

    def main(self):
        n = int(self.br().strip())
        hm = defaultdict(int)
        tokens = self.br().strip().split()
        for token in tokens:
            val = int(token)
            hm[val] += 1
        ans = 0
        for val, num in hm.items():
            if num > val:
                ans += num - val
            elif num < val:
                ans += num
        self.pw(str(ans) + '\n')

if __name__ == "__main__":
    main = Main()
    main.main()

