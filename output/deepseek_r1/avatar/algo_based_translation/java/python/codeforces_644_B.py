
import sys
from collections import deque

data = list(map(int, sys.stdin.read().split()))
ptr = 0
n = data[ptr]
ptr += 1
b = data[ptr]
ptr += 1

ans = [-1] * n
q = deque()

for i in range(n):
    t = data[ptr]
    ptr += 1
    d = data[ptr]
    ptr += 1
    
    while q and q[0] <= t:
        q.popleft()
    
    if len(q) <= b:
        ans[i] = (t if not q else q[-1]) + d
        q.append(ans[i])
    else:
        ans[i] = -1

print(' '.join(map(str, ans)))

