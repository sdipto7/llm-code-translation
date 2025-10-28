
import sys
import math

class FastScanner:
    def __init__(self, file):
        self.file = file
        self.buffer = []
        self.token = 0

    def next_token(self):
        while not self.buffer:
            self.buffer = sys.stdin.readline().split()
        self.token -= 1
        return self.buffer.pop(0)

    def next(self):
        return self.next_token()

    def next_int(self):
        return int(self.next_token())

    def next_long(self):
        return int(self.next_token())

    def next_double(self):
        return float(self.next_token())

def main():
    import sys
    import math
    sc = FastScanner(sys.stdin)
    out = sys.stdout
    n = sc.next_int()
    pre = [0] * (n + 1)

    for i in range(1, n + 1):
        pre[i] = pre[i - 1] + sc.next_long()

    min_diff = math.inf

    for i in range(1, n):
        val1 = pre[i]
        val2 = pre[n] - pre[i]
        min_diff = min(min_diff, abs(val1 - val2))

    out.write(f"{min_diff}\n")
    out.close()

if __name__ == "__main__":
    main()

