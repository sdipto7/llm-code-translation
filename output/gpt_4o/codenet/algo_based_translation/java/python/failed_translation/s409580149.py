
import sys
import io

class Main:
    mod = 10**9 + 7
    dx = [-1, 0, 1, 0]
    dy = [0, -1, 0, 1]
    dx8 = [-1, -1, -1, 0, 0, 1, 1, 1]
    dy8 = [-1, 0, 1, -1, 1, -1, 0, 1]
    inf = sys.maxsize // 2
    linf = sys.maxsize // 3
    dinf = float('inf') / 3
    eps = 1e-10
    pi = 3.141592653589793

    def __init__(self):
        self.sb = []
        self.is_input = sys.stdin
        self.out = sys.stdout
        self.INPUT = ""
        self.inbuf = bytearray(1024)
        self.lenbuf = 0
        self.ptrbuf = 0

    def solve(self):
        self.n = self.ni()
        self.a = self.na(self.n)
        self.dp = [[[-1] * (self.n + 1) for _ in range(self.n + 1)] for _ in range(self.n + 1)]
        self.dp[0][0][0] = 0
        cnt = [0] * 3
        for i in range(self.n):
            cnt[self.a[i] - 1] += 1
        ans = self.rec(cnt[0], cnt[1], cnt[2])
        print(ans, file=self.out)

    def rec(self, i, j, k):
        if self.dp[i][j][k] != -1:
            return self.dp[i][j][k]
        ret = 0
        p = (i + j + k) / self.n
        pi = i / self.n
        pj = j / self.n
        pk = k / self.n
        ret += 1 / p
        if i > 0:
            ret += pi / p * self.rec(i - 1, j, k)
        if j > 0:
            ret += pj / p * self.rec(i + 1, j - 1, k)
        if k > 0:
            ret += pk / p * self.rec(i, j + 1, k - 1)
        self.dp[i][j][k] = ret
        return ret

    def main(self):
        if self.INPUT:
            self.is_input = io.StringIO(self.INPUT)
        self.solve()

    def ni(self):
        num = 0
        minus = False
        b = self.readByte()
        while b != -1 and not (b >= ord('0') and b <= ord('9') or b == ord('-')):
            b = self.readByte()
        if b == ord('-'):
            minus = True
            b = self.readByte()
        while True:
            if b >= ord('0') and b <= ord('9'):
                num = num * 10 + (b - ord('0'))
            else:
                return -num if minus else num
            b = self.readByte()

    def na(self, n):
        return [self.ni() for _ in range(n)]

    def readByte(self):
        if self.lenbuf == -1:
            raise IOError("InputMismatchException")
        if self.ptrbuf >= self.lenbuf:
            self.ptrbuf = 0
            self.lenbuf = self.is_input.readinto(self.inbuf)
            if self.lenbuf <= 0:
                return -1
        b = self.inbuf[self.ptrbuf]
        self.ptrbuf += 1
        return b

if __name__ == "__main__":
    main_instance = Main()
    main_instance.main()

