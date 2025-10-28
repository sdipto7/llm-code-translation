
import sys
from collections import defaultdict

reader = sys.stdin.readline
input_line = reader().strip().split()
m = int(input_line[1])
s = int(input_line[2])
f = int(input_line[3])
maxT = -1
map = defaultdict(list)

while m > 0:
    mth = reader().strip().split()
    k = int(mth[0])
    map[k].append(int(mth[1]))
    map[k].append(int(mth[2]))
    maxT = max(maxT, k)
    m -= 1

actions = []
M = 'R' if s < f else 'L'
d = 1 if s < f else -1
cur = s
a = -1
b = -1

for t in range(1, maxT + 1):
    if t in map:
        a = map[t][0]
        b = map[t][1]
    if t in map and ((a <= cur <= b) or (a <= cur + d <= b)):
        actions.append('X')
    else:
        actions.append(M)
        cur += d
    if cur == f:
        break

while cur != f:
    actions.append(M)
    cur += d

print(''.join(actions))

