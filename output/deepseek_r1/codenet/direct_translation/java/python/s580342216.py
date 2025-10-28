
import sys

class LCS:
    def __init__(self):
        self.dp = []

    def lcs(self, A, B):
        m = len(A)
        n = len(B)
        self.dp = [[0] * (n + 1) for _ in range(m + 1)]
        for i in range(m + 1):
            self.dp[i][0] = 0
        for j in range(n + 1):
            self.dp[0][j] = 0
        for i in range(1, m + 1):
            for j in range(1, n + 1):
                if A[i - 1] == B[j - 1]:
                    self.dp[i][j] = self.dp[i - 1][j - 1] + 1
                else:
                    self.dp[i][j] = max(self.dp[i - 1][j], self.dp[i][j - 1])
        return self.dp[m][n]

    def get_LCS(self, X, Y):
        m = len(X)
        n = len(Y)
        index = self.dp[m][n]
        temp = index
        lcs = [''] * (index + 1)
        lcs[index] = '\0'
        i = m
        j = n
        while i > 0 and j > 0:
            if X[i - 1] == Y[j - 1]:
                lcs[index - 1] = X[i - 1]
                i -= 1
                j -= 1
                index -= 1
            elif self.dp[i - 1][j] > self.dp[i][j - 1]:
                i -= 1
            else:
                j -= 1
        return ''.join(lcs)[:temp + 2]

def main():
    for line in sys.stdin:
        line = line.strip()
        if not line:
            continue
        parts = line.split()
        N = int(parts[0])
        K = int(parts[1])
        count = 0
        current = N
        while current > 0:
            current = current // K
            count += 1
        print(count)

if __name__ == "__main__":
    main()

