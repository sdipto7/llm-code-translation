
from decimal import Decimal, getcontext
getcontext().prec = 30
N = Decimal(input().split()[0])
d = Decimal(input().split()[1])
x = Decimal(input().split()[2])
ans = Decimal('0.0')
while N > Decimal('0.5'):
    adnum = d + x * (N - Decimal('0.5'))
    ans += adnum
    d = (N + Decimal('1.0')) * d / N + (Decimal('5.0') * x) / (Decimal('2.0') * N)
    x = (Decimal('1.0') + (Decimal('2.0') / N)) * x
    N -= Decimal('1.0')
print(format(ans, '.20f'))

