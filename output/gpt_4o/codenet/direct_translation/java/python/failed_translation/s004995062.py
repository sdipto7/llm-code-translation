
from decimal import Decimal, ROUND_DOWN

sa = input()
sb = input()
A = Decimal(sa)
B = Decimal(sb)
print(A * B.quantize(Decimal('1.'), rounding=ROUND_DOWN))

