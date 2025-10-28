
import sys
from collections import Counter

n = int(sys.stdin.readline().strip())
v = list(map(int, sys.stdin.readline().strip().split()))

vo = [0] * 100010
ve = [0] * 100010
vt = [0] * 100010

for i in range(n):
    vt[v[i]] += 1
    if i % 2 == 0:
        ve[v[i]] += 1
    else:
        vo[v[i]] += 1

vo_sorted = sorted(((count, num) for num, count in enumerate(vo)), reverse=True)
ve_sorted = sorted(((count, num) for num, count in enumerate(ve)), reverse=True)
vt_sorted = sorted(((count, num) for num, count in enumerate(vt)), reverse=True)

ans = 0
if vo_sorted[0][0] + ve_sorted[0][0] == vt_sorted[0][0]:
    ans = min(n - vo_sorted[0][0] - ve_sorted[1][0], n - vo_sorted[1][0] - ve_sorted[0][0])
else:
    ans = n - vo_sorted[0][0] - ve_sorted[0][0]

print(ans)

