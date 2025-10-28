
import sys

data = list(map(int, sys.stdin.read().split()))
n = data[0]
v = data[1:n+1]

vo = [0] * 100010
ve = [0] * 100010
vt = [0] * 100010

for i in range(n):
    num = v[i]
    vt[num] += 1
    if i % 2 == 0:
        ve[num] += 1
    else:
        vo[num] += 1

vo.sort(reverse=True)
ve.sort(reverse=True)
vt.sort(reverse=True)

if vo[0] + ve[0] == vt[0]:
    option1 = n - vo[0] - ve[1]
    option2 = n - vo[1] - ve[0]
    ans = min(option1, option2)
else:
    ans = n - vo[0] - ve[0]

print(ans)

