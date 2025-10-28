
from collections import defaultdict
import bisect

n = int(input())
nums = [int(input()) for _ in range(n)]
map = defaultdict(int)
keys = []

for num in nums:
    pos = bisect.bisect_left(keys, num)
    if pos == 0:
        map[num] += 1
        if map[num] == 1:
            bisect.insort_left(keys, num)
    else:
        key = keys[pos - 1]
        map[key] -= 1
        if map[key] == 0:
            keys.pop(pos - 1)
        map[num] += 1
        if map[num] == 1:
            bisect.insort_left(keys, num)

ans = sum(map[key] for key in map)
print(ans)

