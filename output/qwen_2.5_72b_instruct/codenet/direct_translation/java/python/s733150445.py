import sys
from decimal import Decimal

input = sys.stdin.read().split()
a = Decimal(input[0])
b = Decimal(input[1])
mul = a * b
integer_part = str(mul).split('.')[0]
print(integer_part)
