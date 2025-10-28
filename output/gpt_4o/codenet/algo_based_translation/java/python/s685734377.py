
class FastScanner:
    def __init__(self, input_stream):
        import sys
        self.input = sys.stdin if input_stream is None else input_stream
        self.iterator = iter(self.input.read().split())

    def next_int(self):
        return int(next(self.iterator))

    def next(self):
        return next(self.iterator)

def solve(test_number, in_stream, out_stream):
    in_scanner = FastScanner(in_stream)
    n = in_scanner.next_int()
    a = [list(in_scanner.next()) for _ in range(n)]
    
    P, Q = 37, 47
    powP = [1] * (n + 1)
    powQ = [1] * (n + 1)

    for i in range(1, n + 1):
        powP[i] = powP[i - 1] * P
        powQ[i] = powQ[i - 1] * Q

    hash_row = [[0] * n for _ in range(n)]
    hash_col = [[0] * n for _ in range(n)]

    for i in range(n):
        for j in range(n):
            for k in range(n):
                hash_row[i][k] += ord(a[i][j]) * powP[(j - k + n) % n]
                hash_col[j][k] += ord(a[i][j]) * powP[(i - k + n) % n]

    ans = 0
    for A in range(n):
        for B in range(n):
            ok = True
            for i in range(n):
                if hash_row[(i + A) % n][B] != hash_col[(i + B) % n][A]:
                    ok = False
                    break
            if ok:
                ans += 1

    print(ans, file=out_stream)

if __name__ == "__main__":
    import sys
    solve(1, sys.stdin, sys.stdout)

