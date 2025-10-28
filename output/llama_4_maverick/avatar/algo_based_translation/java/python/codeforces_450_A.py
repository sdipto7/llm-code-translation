from collections import deque

n, m = map(int, input().split())
q1 = deque()
q2 = deque()

for i in range(1, n + 1):
    q1.append(int(input().split()[0]))
    q2.append(i)

ans = 0
while q1:
    if q1[0] <= m:
        q1.popleft()
        ans = q2.popleft()
    else:
        x = q1.popleft()
        q1.append(x - m)
        q2.append(q2.popleft())

print(ans)
