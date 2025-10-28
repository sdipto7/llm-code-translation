
import sys

class FastScanner:
    def __init__(self, file):
        self.file = file
        self.buffer = None
        self.tokens = None

    def next(self):
        if self.tokens is None or not self.tokens:
            self.tokens = self.file.readline().split()
        return self.tokens.pop(0)

    def next_int(self):
        return int(self.next())

def main():
    in_file = sys.stdin
    out_file = sys.stdout
    in_scanner = FastScanner(in_file)
    out = out_file

    n = in_scanner.next_int()
    a = [list(in_scanner.next()) for _ in range(n)]
    P, Q = 37, 47
    pow_P = [1] * (n + 1)
    pow_Q = [1] * (n + 1)
    for i in range(1, n + 1):
        pow_P[i] = pow_P[i - 1] * P
        pow_Q[i] = pow_Q[i - 1] * Q

    hash_row = [[0] * n for _ in range(n)]
    hash_col = [[0] * n for _ in range(n)]
    for i in range(n):
        for j in range(n):
            for k in range(n):
                hash_row[i][k] += ord(a[i][j]) * pow_P[(j - k + n) % n]
                hash_col[j][k] += ord(a[i][j]) * pow_P[(i - k + n) % n]

    ans = 0
    for A in range(n):
        for B in range(n):
            ok = True
            for i in range(n):
                ok = ok and (hash_row[(i + A) % n][B] == hash_col[(i + B) % n][A])
            ans += 1 if ok else 0

    print(ans, file=out)

if __name__ == "__main__":
    main()

