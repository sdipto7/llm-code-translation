
n, k = map(int, input().split())
a = list(map(int, input().split()))

visited = set()
current = 0
path = []
while current not in visited:
    visited.add(current)
    path.append(current)
    current = a[current] - 1

cycle_start = current

straight = []
st = 0
while st != cycle_start:
    straight.append(st)
    st = a[st] - 1

cycle = []
current = cycle_start
cycle.append(current)
current = a[current] - 1
while current != cycle_start:
    cycle.append(current)
    current = a[current] - 1

if k < len(straight):
    print(straight[k] + 1)
else:
    remaining = k - len(straight)
    print(cycle[remaining % len(cycle)] + 1)

