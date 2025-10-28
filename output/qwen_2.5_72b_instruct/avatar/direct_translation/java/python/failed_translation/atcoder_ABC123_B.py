
import sys
from sortedcontainers import SortedDict

sc = sys.stdin.read().split()
a = [int(sc[i]) for i in range(5)]
r = [a[i] % 10 for i in range(5)]
map = SortedDict()
for i in range(len(a)):
    if r[i] != 0:
        b = 10 - r[i]
        map[b] = a[i]
ans = 0
if len(map) == 0:
    for i in range(len(a)):
        ans += a[i]
    print(ans)
    sys.exit()
last = map.peekitem(-1)[1]
idx = a.index(last)
for i in range(len(a)):
    if i != idx:
        if a[i] % 10 == 0:
            ans += a[i]
        else:
            ans += a[i] + (10 - r[i])
ans += last
print(ans)

