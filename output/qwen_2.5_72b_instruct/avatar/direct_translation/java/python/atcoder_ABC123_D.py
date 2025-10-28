
import sys

input = sys.stdin.read().split()
x = [int(input[i]) for i in range(3)]
max_val = max(x)
k = int(input[3])
a = [[] for _ in range(3)]
index = 4
for i in range(3):
    for j in range(x[i]):
        a[i].append(int(input[index]))
        index += 1
    a[i].sort()

ans = []
for i in range(x[0]):
    for j in range(x[1]):
        for m in range(x[2]):
            if (i + 1) * (j + 1) * (m + 1) <= k:
                tmp = a[0][x[0] - i - 1] + a[1][x[1] - j - 1] + a[2][x[2] - m - 1]
                ans.append(tmp)

ans.sort()
n = len(ans)
for i in range(k):
    print(ans[n - i - 1])

