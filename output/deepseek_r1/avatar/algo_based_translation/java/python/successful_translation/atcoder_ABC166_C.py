
import sys

data = list(map(int, sys.stdin.read().split()))
ptr = 0
N = data[ptr]
ptr += 1
M = data[ptr]
ptr += 1
H = data[ptr:ptr+N]
ptr += N
ans = [True] * N

for _ in range(M):
    temp1 = data[ptr]
    ptr += 1
    temp2 = data[ptr]
    ptr += 1
    a = temp1 - 1
    b = temp2 - 1
    if H[a] < H[b]:
        ans[a] = False
    elif H[a] > H[b]:
        ans[b] = False
    else:
        ans[a] = False
        ans[b] = False

ans2 = sum(ans)
print(ans2)

