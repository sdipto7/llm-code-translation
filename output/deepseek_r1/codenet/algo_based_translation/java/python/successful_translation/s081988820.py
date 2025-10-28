
import sys

data = list(map(int, sys.stdin.read().split()))
ptr = 0

H = data[ptr]
ptr += 1
W = data[ptr]
ptr += 1

c = [data[ptr + i*10 : ptr + (i+1)*10] for i in range(10)]
ptr += 100

min_cost = [c[i][1] for i in range(10)]

for _ in range(10):
    for i in range(10):
        for j in range(10):
            min_cost[i] = min(min_cost[i], c[i][j] + min_cost[j])

ans = 0
grid = data[ptr:ptr + H*W]
for num in grid:
    if num >= 0:
        ans += min_cost[num]

print(ans)

