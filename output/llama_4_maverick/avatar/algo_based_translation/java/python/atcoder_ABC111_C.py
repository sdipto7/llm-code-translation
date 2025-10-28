
import sys

n = int(sys.stdin.readline().strip())
v = [0] * 100010
for i, val in enumerate(sys.stdin.readline().strip().split()):
    if i < n:
        v[int(val)] += 1

vo = [0] * 100010
ve = [0] * 100010
vt = [0] * 100010

for i in range(100010):
    vt[i] = v[i]

for i in range(n):
    if i % 2 == 0:
        ve[v[i]] += 1
    else:
        vo[v[i]] += 1

vo = sorted(vo, reverse=True)
ve = sorted(ve, reverse=True)
vt = sorted(vt, reverse=True)

if vo[0] + ve[0] == vt[0]:
    ans = min(n - vo[0] - ve[1], n - vo[1] - ve[0])
else:
    ans = n - vo[0] - ve[0]

print(ans)

