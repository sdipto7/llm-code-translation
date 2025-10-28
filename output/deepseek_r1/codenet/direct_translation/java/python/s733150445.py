
from decimal import Decimal

a, b = input().split()
product = Decimal(a) * Decimal(b)
print(str(product).split('.')[0])

