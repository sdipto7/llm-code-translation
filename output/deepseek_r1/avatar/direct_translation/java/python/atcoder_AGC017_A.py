
import math

n, p = map(int, input().split())
k0 = 0
k1 = 0
for _ in range(n):
    x = int(input())
    if x % 2 == 0:
        k0 += 1
    else:
        k1 += 1

even_part = 2 ** k0

if p == 0:
    sum_choices = sum(math.comb(k1, i) for i in range(0, k1 + 1, 2))
else:
    sum_choices = sum(math.comb(k1, i) for i in range(1, k1 + 1, 2))

print(even_part * sum_choices)

