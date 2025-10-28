
import sys
from collections import defaultdict

input = sys.stdin.read
data = input().split()

n = int(data[0])
hm = defaultdict(int)

for i in range(n):
    val = int(data[i + 1])
    hm[val] += 1

ans = 0
for val in hm:
    num = hm[val]
    if num > val:
        ans += num - val
    else:
        ans += num

print(ans)

