
import sys
import random

class FastScanner:
    def __init__(self, input_stream):
        self.in_stream = input_stream
        self.st = None

    def next_token(self):
        while self.st is None or not self.st:
            self.st = self.in_stream.readline().split()
        return self.st.pop(0)

    def next(self):
        return self.next_token()

    def next_int(self):
        return int(self.next_token())

    def next_long(self):
        return int(self.next_token())

    def next_double(self):
        return float(self.next_token())

def main():
    sc = FastScanner(sys.stdin)
    n = sc.next_int()
    pre = [0] * (n + 1)

    for i in range(1, n + 1):
        pre[i] = pre[i - 1] + sc.next_long()

    min_val = float('inf')

    for i in range(1, n):
        val1 = pre[i]
        val2 = pre[n] - pre[i]
        min_val = min(min_val, abs(val1 - val2))

    print(min_val)

if __name__ == "__main__":
    main()

