
n = int(input())
v = list(map(int, input().split()))

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

vo_sorted = sorted(vo, reverse=True)
ve_sorted = sorted(ve, reverse=True)
vt_sorted = sorted(vt, reverse=True)

if vo_sorted[0] + ve_sorted[0] == vt_sorted[0]:
    ans = min(n - vo_sorted[0] - ve_sorted[1], n - vo_sorted[1] - ve_sorted[0])
else:
    ans = n - vo_sorted[0] - ve_sorted[0]

print(ans)

