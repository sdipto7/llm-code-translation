import sys
from decimal import Decimal, ROUND_DOWN
sa = sys.stdin.read().split()[0]
sb = sys.stdin.read().split()[1]
A = Decimal(sa)
B = Decimal(sb)
print(A * B).quantize(Decimal('1'), rounding=ROUND_DOWN)
