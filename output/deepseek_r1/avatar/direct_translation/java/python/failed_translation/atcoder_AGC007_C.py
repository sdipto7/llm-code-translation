
import sys
from decimal import Decimal

N, d, x = map(float, input().split())

ans = Decimal(0)

while N > 0.5:
    adnum_float = d + x * (N - 0.5)
    ans += Decimal(f"{adnum_float:.17g}")
    new_d = ((N + 1) * d / N) + (5 * x) / (2 * N)
    new_x = x * (1 + 2 / N)
    d, x = new_d, new_x
    N -= 1

print("{0:.20f}".format(ans))

