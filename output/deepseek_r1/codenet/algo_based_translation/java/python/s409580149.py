
import sys
sys.setrecursionlimit(1000000)

n = int(sys.stdin.readline())
a = list(map(int, sys.stdin.readline().split()))
cnt = [0, 0, 0]
for num in a:
    cnt[num-1] += 1

dp = [[[-1.0 for _ in range(n+1)] for __ in range(n+1)] for ___ in range(n+1)]
dp[0][0][0] = 0.0

def rec(i, j, k):
    if dp[i][j][k] != -1.0:
        return dp[i][j][k]
    total = i + j + k
    p = total / n
    res = 1.0 / p
    if i > 0:
        prob_i = i / n
        res += (prob_i / p) * rec(i-1, j, k)
    if j > 0:
        prob_j = j / n
        res += (prob_j / p) * rec(i+1, j-1, k)
    if k > 0:
        prob_k = k / n
        res += (prob_k / p) * rec(i, j+1, k-1)
    dp[i][j][k] = res
    return res

print("{0:.10f}".format(rec(cnt[0], cnt[1], cnt[2])))

