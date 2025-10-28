
from decimal import Decimal

a, b = map(Decimal, input().split())
mul = a * b
print(str(mul).split('.')[0])

