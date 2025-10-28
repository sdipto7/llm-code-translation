
import sys

n, m = map(int, sys.stdin.readline().split())
req = list(map(int, sys.stdin.readline().split()))[:n]
pre = list(map(int, sys.stdin.readline().split()))[:m]
i, j, ans = n - 1, m - 1, 0

while i >= 0 and j >= 0:
    if req[i] > pre[j]:
        ans += 1
    else:
        j -= 1
    i -= 1

print(ans + i + 1)

