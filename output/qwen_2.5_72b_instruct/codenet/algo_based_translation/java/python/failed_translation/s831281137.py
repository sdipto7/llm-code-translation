
import sys

class Main:
    @staticmethod
    def nlong():
        return int(sys.stdin.readline())

    @staticmethod
    def nint():
        return int(sys.stdin.readline())

    @staticmethod
    def nstr():
        return sys.stdin.readline().strip()

    @staticmethod
    def nsToChars():
        return list(sys.stdin.readline().strip())

    @staticmethod
    def nlongs(n):
        return Main.nlongs(n, 0, 0)

    @staticmethod
    def nints(n):
        return Main.nints(n, 0, 0)

    @staticmethod
    def nints(n, padL, padR):
        a = [0] * (padL + n + padR)
        for i in range(n):
            a[padL + i] = Main.nint()
        return a

    @staticmethod
    def nlongs(n, padL, padR):
        a = [0] * (padL + n + padR)
        for i in range(n):
            a[padL + i] = Main.nlong()
        return a

    @staticmethod
    def nstrs(n):
        a = [None] * n
        for i in range(n):
            a[i] = Main.nstr()
        return a

    @staticmethod
    def nsToChars2D(h, w):
        return Main.nsToChars2D(h, w, 0)

    @staticmethod
    def nsToChars2D(h, w, pad):
        a2 = [[''] * (w + pad * 2) for _ in range(h + pad * 2)]
        for i in range(h):
            chars = Main.nsToChars()
            for j in range(w):
                a2[pad + i][pad + j] = chars[j]
        return a2

    @staticmethod
    def main():
        N = Main.nint()
        W = Main.nint()

        v = [0] * (N + 1)
        w = [0] * (N + 1)

        for i in range(1, N + 1):
            v[i] = Main.nint()
            w[i] = Main.nint()

        sumV = [[0] * (W + 1) for _ in range(N + 1)]

        for i in range(1, N + 1):
            for i_sum in range(w[i]):
                sumV[i][i_sum] = sumV[i - 1][i_sum]

            for i_sum in range(w[i], W + 1):
                sumV[i][i_sum] = max(sumV[i - 1][i_sum], sumV[i - 1][i_sum - w[i]] + v[i])

        print(sumV[N][W])

if __name__ == "__main__":
    Main.main()

