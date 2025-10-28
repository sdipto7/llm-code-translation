
import sys

x = list(map(int, sys.stdin.readline().split()))
max_val = max(x)
k = int(sys.stdin.readline())
a = [sorted(list(map(int, sys.stdin.readline().split()))) for _ in range(3)]
ans = []
for i in range(x[0]):
    for j in range(x[1]):
        for m in range(x[2]):
            if (i + 1) * (j + 1) * (m + 1) <= k:
                tmp = a[0][-i-1] + a[1][-j-1] + a[2][-m-1]
                ans.append(tmp)
ans.sort()
n = len(ans)
for i in range(k):
    print(ans[n - i - 1])

