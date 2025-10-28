import sys
from decimal import Decimal

st = sys.stdin.readline().split()
a = Decimal(st[0])
b = Decimal(st[1])
mul = a * b
result = str(mul).split('.')[0]
print(result)
