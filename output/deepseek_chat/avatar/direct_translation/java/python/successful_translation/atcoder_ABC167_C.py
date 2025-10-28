
import sys
import math

n, m, x = map(int, sys.stdin.readline().split())
min_cost = float('inf')
a = [list(map(int, sys.stdin.readline().split())) for _ in range(n)]

for i in range(2 ** n):
    status = [0] * n
    for j in range(n):
        if (i >> j) & 1:
            status[j] = 1
    res = [0] * (m + 1)
    for j in range(n):
        if status[j]:
            for k in range(m + 1):
                res[k] += a[j][k]
    flag = True
    for j in range(1, m + 1):
        if res[j] < x:
            flag = False
            break
    if flag:
        min_cost = min(min_cost, res[0])

print(-1 if min_cost == float('inf') else min_cost)

