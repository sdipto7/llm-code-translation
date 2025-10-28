
from decimal import Decimal, ROUND_DOWN

def main():
    sa = input().strip()
    sb = input().strip()
    
    A = Decimal(sa)
    B = Decimal(sb)
    
    result = A * B
    result = result.quantize(Decimal('1'), rounding=ROUND_DOWN)
    
    print(result)

if __name__ == "__main__":
    main()

