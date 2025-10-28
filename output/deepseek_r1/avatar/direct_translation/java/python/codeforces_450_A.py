
from collections import deque

n, m = map(int, input().split())
a = list(map(int, input().split()))
q1 = deque(a)
q2 = deque(range(1, n + 1))
ans = 0
while q1:
    if q1[0] <= m:
        ans = q2.popleft()
        q1.popleft()
    else:
        q1.append(q1.popleft() - m)
        q2.append(q2.popleft())
print(ans)

