
import sys
from collections import deque

input = sys.stdin.read().split()
n = int(input[0])
b = int(input[1])
ans = [0] * n
q = deque()
index = 2
for i in range(n):
    t = int(input[index])
    d = int(input[index + 1])
    index += 2
    while q and q[0] <= t:
        q.popleft()
    if len(q) <= b:
        ans[i] = (q[-1] if q else t) + d
        q.append(ans[i])
    else:
        ans[i] = -1
print(" ".join(map(str, ans)))

