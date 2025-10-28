
import sys
from collections import deque

n, b = map(int, sys.stdin.readline().split())
ans = [0] * n
q = deque()

for i in range(n):
    t, d = map(int, sys.stdin.readline().split())
    while q and q[0] <= t:
        q.popleft()
    if len(q) <= b:
        ans[i] = (t if not q else q[-1]) + d
        q.append(ans[i])
    else:
        ans[i] = -1

print(' '.join(map(str, ans)))

