
import sys
from decimal import Decimal

def main():
    import sys
    from decimal import Decimal
    
    input_line = sys.stdin.readline().strip()
    parts = input_line.split()
    
    a = Decimal(parts[0])
    b = Decimal(parts[1])
    
    mul = a * b
    mul_str = str(mul)
    
    integer_part = mul_str.split('.')[0]
    
    print(integer_part)

if __name__ == "__main__":
    main()

