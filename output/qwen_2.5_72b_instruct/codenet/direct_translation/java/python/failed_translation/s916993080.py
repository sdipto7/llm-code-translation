
import sys

class sc:
    @staticmethod
    def next():
        return sys.stdin.read().split()[sc.index]
    
    @staticmethod
    def nextInt():
        return int(sc.next())
    
    @staticmethod
    def nextDouble():
        return float(sc.next())
    
    @staticmethod
    def nextLong():
        return int(sc.next())
    
    @staticmethod
    def nextFloat():
        return float(sc.next())

sc.index = 0

n = sc.nextInt()
arr = [[0] * 3 for _ in range(n)]
for i in range(n):
    for j in range(3):
        arr[i][j] = sc.nextInt()
dp = [[0] * 3 for _ in range(n)]
dp[0][0] = arr[0][0]
dp[0][1] = arr[0][1]
dp[0][2] = arr[0][2]
for i in range(1, n):
    for j in range(3):
        if j == 0:
            dp[i][j] = max(arr[i][0] + dp[i - 1][1], arr[i][0] + dp[i - 1][2])
        if j == 1:
            dp[i][j] = max(arr[i][1] + dp[i - 1][0], arr[i][1] + dp[i - 1][2])
        if j == 2:
            dp[i][j] = max(arr[i][2] + dp[i - 1][1], arr[i][2] + dp[i - 1][0])
max_value = -1
for i in range(3):
    if dp[n - 1][i] > max_value:
        max_value = dp[n - 1][i]
print(max_value)

