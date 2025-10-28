
import sys

class FastScanner:
    def __init__(self, file):
        self.file = file
        self.buffer = []
        self.token = 0

    def next(self):
        if self.token >= len(self.buffer):
            self.buffer = self.file.readline().split()
            self.token = 0
        result = self.buffer[self.token]
        self.token += 1
        return result

    def nextInt(self):
        return int(self.next())

class TaskB:
    def solve(self, testNumber, in_, out):
        n = in_.nextInt()
        a = [in_.next().strip() for _ in range(n)]
        P = 37
        Q = 47
        powP = [0] * (n + 1)
        powQ = [0] * (n + 1)
        powP[0] = powQ[0] = 1
        for i in range(1, n + 1):
            powP[i] = powP[i - 1] * P
            powQ[i] = powQ[i - 1] * Q

        hashRow = [[0] * n for _ in range(n)]
        hashCol = [[0] * n for _ in range(n)]
        for i in range(n):
            for j in range(n):
                for k in range(n):
                    hashRow[i][k] += ord(a[i][j]) * powP[(j - k + n) % n]
                    hashCol[j][k] += ord(a[i][j]) * powP[(i - k + n) % n]

        ans = 0
        for A in range(n):
            for B in range(n):
                ok = True
                for i in range(n):
                    if hashRow[(i + A) % n][B] != hashCol[(i + B) % n][A]:
                        ok = False
                        break
                ans += 1 if ok else 0
        out.write(f"{ans}\n")

def main():
    in_ = FastScanner(sys.stdin)
    out = sys.stdout
    solver = TaskB()
    solver.solve(1, in_, out)

if __name__ == "__main__":
    main()

