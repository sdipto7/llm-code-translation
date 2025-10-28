
import sys
from collections import defaultdict

input = sys.stdin.readline

n = int(input())
hm = defaultdict(int)
values = map(int, input().split())

for val in values:
    hm[val] += 1

ans = 0
for val, num in hm.items():
    if num > val:
        ans += num - val
    else:
        ans += num

print(ans)

