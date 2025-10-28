
import sys

class Solution:
    def __init__(self):
        import sys
        self.scanner = sys.stdin.read().splitlines()
        self.index = 0

        while self.index < len(self.scanner):
            self.run_case()

    def run_case(self):
        line = self.scanner[self.index]
        self.index += 1
        N, K = map(int, line.split())
        length = 0
        while N > 0:
            N //= K
            length += 1
        print(length)

    def strToIntArray(self, str):
        return list(map(int, str.split()))

class LCS:
    def __init__(self):
        pass

    def lcs(self, A, B):
        sz_a, sz_b = len(A), len(B)
        dp = [[0] * (sz_b + 1) for _ in range(sz_a + 1)]

        for i in range(1, sz_a + 1):
            for j in range(1, sz_b + 1):
                if A[i - 1] == B[j - 1]:
                    dp[i][j] = dp[i - 1][j - 1] + 1
                else:
                    dp[i][j] = max(dp[i - 1][j], dp[i][j - 1])

        return dp[sz_a][sz_b]

    def getLCS(self, X, Y):
        m, n = len(X), len(Y)
        dp = [[0] * (n + 1) for _ in range(m + 1)]

        for i in range(1, m + 1):
            for j in range(1, n + 1):
                if X[i - 1] == Y[j - 1]:
                    dp[i][j] = dp[i - 1][j - 1] + 1
                else:
                    dp[i][j] = max(dp[i - 1][j], dp[i][j - 1])

        index = dp[m][n]
        lcs = [''] * index

        i, j = m, n
        while i > 0 and j > 0:
            if X[i - 1] == Y[j - 1]:
                lcs[index - 1] = X[i - 1]
                i -= 1
                j -= 1
                index -= 1
            elif dp[i - 1][j] > dp[i][j - 1]:
                i -= 1
            else:
                j -= 1

        return ''.join(lcs)

if __name__ == "__main__":
    Solution()

