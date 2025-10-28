
from decimal import Decimal, ROUND_DOWN

def main():
    sa = input().split()[0]
    sb = input().split()[0]
    A = Decimal(sa)
    B = Decimal(sb)
    print((A * B).quantize(Decimal('1'), rounding=ROUND_DOWN))

if __name__ == "__main__":
    main()

