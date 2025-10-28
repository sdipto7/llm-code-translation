
from decimal import Decimal, getcontext, ROUND_DOWN

a = input().strip()
b = input().strip()

A = Decimal(a)
B = Decimal(b)

result = A * B
result = result.quantize(Decimal('1'), rounding=ROUND_DOWN)

print(result)

