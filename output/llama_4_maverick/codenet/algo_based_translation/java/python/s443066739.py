
import sys

class FastScanner:
    def __init__(self, file):
        self.file = file
        self.tokens = []

    def next_token(self):
        while not self.tokens:
            self.tokens = self.file.readline().split()
            self.tokens.reverse()
        return self.tokens.pop()

    def next(self):
        return self.next_token()

    def next_int(self):
        return int(self.next_token())

    def next_long(self):
        return int(self.next_token())

    def next_double(self):
        return float(self.next_token())

class Main:
    def __init__(self):
        self.sc = FastScanner(sys.stdin)
        self.out = sys.stdout

    def run(self):
        n = self.sc.next_int()
        pre = [0] * (n + 1)
        for i in range(1, n + 1):
            pre[i] = pre[i - 1] + self.sc.next_long()

        min_val = float('inf')
        for i in range(1, n):
            val1 = pre[i]
            val2 = pre[n] - pre[i]
            min_val = min(min_val, abs(val1 - val2))

        self.out.write(str(min_val) + '\n')

if __name__ == "__main__":
    Main().run()

