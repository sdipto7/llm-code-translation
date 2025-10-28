n, m, x = map(int, input().split())
a = [list(map(int, input().split())) for _ in range(n)]
min_cost = float('inf')

for i in range(2**n):
    total = [0] * (m + 1)
    for j in range(n):
        if (i >> j) & 1:
            for k in range(m + 1):
                total[k] += a[j][k]
    if all(total[k] >= x for k in range(1, m + 1)):
        min_cost = min(min_cost, total[0])

print(-1 if min_cost == float('inf') else min_cost)
