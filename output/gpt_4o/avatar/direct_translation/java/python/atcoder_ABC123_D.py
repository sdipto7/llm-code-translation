
from heapq import nlargest

x = list(map(int, input().split()))
max_val = max(x)
k = int(input())
a = []

for i in range(3):
    a.append(sorted(map(int, input().split()), reverse=True))

ans = []

for i in range(x[0]):
    for j in range(x[1]):
        for m in range(x[2]):
            if (i + 1) * (j + 1) * (m + 1) <= k:
                tmp = a[0][i] + a[1][j] + a[2][m]
                ans.append(tmp)

for value in nlargest(k, ans):
    print(value)

