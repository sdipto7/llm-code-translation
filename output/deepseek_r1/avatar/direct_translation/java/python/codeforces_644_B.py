
import sys
from collections import deque

n, b = map(int, sys.stdin.readline().split())
ans = []
q = deque()

for _ in range(n):
    t, d = map(int, sys.stdin.readline().split())
    while q and q[0] <= t:
        q.popleft()
    if len(q) <= b:
        start = q[-1] if q else t
        end = start + d
        q.append(end)
        ans.append(end)
    else:
        ans.append(-1)

print(' '.join(map(str, ans)))

