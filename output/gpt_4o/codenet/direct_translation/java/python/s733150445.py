
import sys
from decimal import Decimal

input_line = sys.stdin.readline().strip()
a_str, b_str = input_line.split()
a = Decimal(a_str)
b = Decimal(b_str)
mul = a * b
print(str(mul).split('.')[0])

