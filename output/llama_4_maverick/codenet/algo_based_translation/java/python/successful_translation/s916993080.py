
import sys

class InputReader:
    def __init__(self):
        self.reader = sys.stdin.readline

    def read_int(self):
        return int(self.reader().strip())

    def read_ints(self):
        return list(map(int, self.reader().strip().split()))

def main():
    reader = InputReader()
    n = reader.read_int()
    arr = [reader.read_ints() for _ in range(n)]
    dp = [[0] * 3 for _ in range(n)]
    dp[0] = arr[0]
    for i in range(1, n):
        for j in range(3):
            dp[i][j] = max(arr[i][j] + dp[i-1][(j+1) % 3], arr[i][j] + dp[i-1][(j+2) % 3])
    max_val = max(dp[-1])
    print(max_val)

if __name__ == "__main__":
    main()

