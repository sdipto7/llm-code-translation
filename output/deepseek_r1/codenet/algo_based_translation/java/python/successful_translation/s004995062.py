
from decimal import Decimal, ROUND_DOWN

if __name__ == "__main__":
    sa, sb = input().split()
    a = Decimal(sa)
    b = Decimal(sb)
    result = a * b
    print(result.quantize(Decimal('1'), rounding=ROUND_DOWN))

