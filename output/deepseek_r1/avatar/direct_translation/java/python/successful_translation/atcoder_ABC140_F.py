
n = int(input())
size = 1 << n
s = list(map(int, input().split()))
s.sort()
spawned = [False] * size
spawned[-1] = True
active = [s[-1]]
for _ in range(n):
    active.sort(reverse=True)
    activated = []
    next_idx = size - 1
    for slime in active:
        while next_idx >= 0 and (s[next_idx] >= slime or spawned[next_idx]):
            next_idx -= 1
        if next_idx < 0:
            print("No")
            exit()
        spawned[next_idx] = True
        activated.append(s[next_idx])
    active += activated
print("Yes")

