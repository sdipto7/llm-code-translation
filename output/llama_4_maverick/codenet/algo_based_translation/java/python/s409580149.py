
import sys

class Main:
    def __init__(self):
        self.n = 0
        self.a = []
        self.dp = []
        self.mod = 10**9 + 7
        self.input_stream = sys.stdin
        self.output_stream = sys.stdout

    def solve(self):
        self.n = self.ni()
        self.a = self.na(self.n)
        self.dp = [[[float('-inf') for _ in range(self.n+1)] for _ in range(self.n+1)] for _ in range(self.n+1)]
        cnt = [0, 0, 0]
        for i in self.a:
            cnt[i-1] += 1
        ans = self.rec(cnt[0], cnt[1], cnt[2])
        self.out.println(ans)

    def rec(self, i, j, k):
        if self.dp[i][j][k] != float('-inf'):
            return self.dp[i][j][k]
        p = (i + j + k) / self.n
        pi = i / self.n
        pj = j / self.n
        pk = k / self.n
        ret = 1 / p
        if i > 0:
            ret += pi / p * self.rec(i-1, j, k)
        if j > 0:
            ret += pj / p * self.rec(i+1, j-1, k)
        if k > 0:
            ret += pk / p * self.rec(i, j+1, k-1)
        self.dp[i][j][k] = ret
        return ret

    def ni(self):
        return int(self.input_stream.readline())

    def na(self, n):
        return list(map(int, self.input_stream.readline().split()))

    def out(self, value):
        self.output_stream.write(str(value) + '\n')

    class Out:
        def __init__(self, stream):
            self.stream = stream

        def println(self, value):
            self.stream.write(str(value) + '\n')

def main():
    main_instance = Main()
    main_instance.out = main_instance.Out(main_instance.output_stream)
    main_instance.solve()

if __name__ == "__main__":
    main()

