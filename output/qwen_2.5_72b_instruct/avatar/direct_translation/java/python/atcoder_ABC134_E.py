import sys
from sortedcontainers import SortedDict

n = int(input().strip())
map = SortedDict()
for _ in range(n):
    num = int(input().strip())
    if map.bisect_left(num) == 0:
        map[num] = map.get(num, 0) + 1
    else:
        key = map.keys()[map.bisect_left(num) - 1]
        val = map[key]
        if val == 1:
            del map[key]
        else:
            map[key] = val - 1
        map[num] = map.get(num, 0) + 1
ans = sum(map.values())
print(ans)
