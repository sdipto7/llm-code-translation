
import sys
input = sys.stdin.readline
N = int(input())
size = 1 << N
S = [int(input()) for _ in range(size)]
spawned = [False] * size
spawned[size - 1] = True
S.sort()
active = [S[size - 1]]
for _ in range(N):
    active.sort(reverse=True)
    activated = []
    next_idx = size - 1
    for slime in active:
        while next_idx >= 0 and (S[next_idx] >= slime or spawned[next_idx]):
            next_idx -= 1
        if next_idx < 0:
            print("No")
            sys.exit()
        spawned[next_idx] = True
        activated.append(S[next_idx])
    active.extend(activated)
print("Yes")

