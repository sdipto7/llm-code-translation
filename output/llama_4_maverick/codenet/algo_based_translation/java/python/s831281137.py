
import sys

class Main:
    def __init__(self):
        self.sc = sys.stdin.readline
        self.so = sys.stdout.write

    def nint(self):
        return int(self.sc().strip())

    def nlong(self):
        return int(self.sc().strip())

    def nstr(self):
        return self.sc().strip()

    def ns_to_chars(self):
        return list(self.sc().strip())

    def nints(self, n, padL=0, padR=0):
        a = [0] * (padL + n + padR)
        for i in range(n):
            a[padL + i] = self.nint()
        return a

    def nlongs(self, n, padL=0, padR=0):
        a = [0] * (padL + n + padR)
        for i in range(n):
            a[padL + i] = self.nlong()
        return a

    def nstrs(self, n):
        a = []
        for _ in range(n):
            a.append(self.nstr())
        return a

    def ns_to_chars_2d(self, h, w, pad=0):
        a2 = [[''] * (w + pad * 2) for _ in range(h + pad * 2)]
        for i in range(h):
            chars = self.ns_to_chars()
            for j in range(w):
                a2[pad + i][pad + j] = chars[j]
        return a2

    def main(self):
        N = self.nint()
        W = self.nint()

        v = [0] * (N + 1)
        w = [0] * (N + 1)

        for i in range(1, N + 1):
            v[i] = self.nint()
            w[i] = self.nint()

        sumV = [[0] * (W + 1) for _ in range(N + 1)]

        for i in range(1, N + 1):
            for i_sum in range(w[i]):
                sumV[i][i_sum] = sumV[i-1][i_sum]
            for i_sum in range(w[i], W + 1):
                sumV[i][i_sum] = max(sumV[i-1][i_sum], sumV[i-1][i_sum-w[i]] + v[i])

        self.so(str(sumV[N][W]) + '\n')

if __name__ == "__main__":
    main = Main()
    main.main()

