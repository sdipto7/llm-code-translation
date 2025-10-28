
import decimal
from decimal import Decimal

n, d, x = map(float, input().split())

ans = Decimal('0.0')
current_n = n
current_d = d
current_x = x

while current_n > 0.5:
    adnum = current_d + current_x * (current_n - 0.5)
    ans += Decimal(str(adnum))
    new_d = ((current_n + 1) * current_d) / current_n + (5 * current_x) / (2 * current_n)
    new_x = (1 + (2 / current_n)) * current_x
    current_d, current_x, current_n = new_d, new_x, current_n - 1

s = format(ans, 'f')
if '.' in s:
    integer, fractional = s.split('.')
else:
    integer, fractional = s, ''
fractional += '0' * (20 - len(fractional)) if len(fractional) < 20 else ''
print(f"{integer}.{fractional}")

