
import sys

class FastScanner:
    def __init__(self, stream):
        self.stream = stream
        self.tokens = []

    def next(self):
        while not self.tokens:
            line = self.stream.readline().decode('utf-8').strip()
            if not line:
                return None
            self.tokens = line.split()
        return self.tokens.pop(0)

    def next_int(self):
        return int(self.next())

class TaskB:
    def solve(self, test_number, in_stream, out_stream):
        n = in_stream.next_int()
        a = [list(in_stream.next()) for _ in range(n)]
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
                    ok &= hash_row[(i + A) % n][B] == hash_col[(i + B) % n][A]
                ans += ok

        out_stream.write(str(ans) + '\n')

def main():
    in_stream = FastScanner(sys.stdin)
    out_stream = sys.stdout
    solver = TaskB()
    solver.solve(1, in_stream, out_stream)

if __name__ == "__main__":
    main()

