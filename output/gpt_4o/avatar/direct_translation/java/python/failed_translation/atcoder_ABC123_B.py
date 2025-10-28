
import sys
from collections import OrderedDict

a = [int(input()) for _ in range(5)]
r = [x % 10 for x in a]
map = OrderedDict()

for i in range(5):
    if r[i] != 0:
        b = 10 - r[i]
        map[b] = a[i]

ans = 0
if len(map) == 0:
    ans = sum(a)
    print(ans)
    sys.exit()

last = list(map.values())[-1]
idx = a.index(last)

for i in range(5):
    if i != idx:
        if a[i] % 10 == 0:
            ans += a[i]
        else:
            ans += a[i] + (10 - r[i])

ans += last
print(ans)

