Here is the Python code translated from the provided Java code:


parts = list(map(int, input().split()))
m = parts[1]
s = parts[2]
f = parts[3]

max_t = -1
events = {}
for _ in range(m):
    k, a, b = map(int, input().split())
    events[k] = (a, b)
    if k > max_t:
        max_t = k

direction = 'R' if s < f else 'L'
step = 1 if s < f else -1
cur = s
actions = []

for t in range(1, max_t + 1):
    if t in events:
        a, b = events[t]
        in_current = a <= cur <= b
        next_pos = cur + step
        in_next = a <= next_pos <= b
        if in_current or in_next:
            actions.append('X')
        else:
            actions.append(direction)
            cur += step
    else:
        actions.append(direction)
        cur += step
    if cur == f:
        break

while cur != f:
    actions.append(direction)
    cur += step

print(''.join(actions))

