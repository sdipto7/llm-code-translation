
import sys
from decimal import Decimal

def main():
    line = sys.stdin.readline().strip()
    tokens = line.split()
    a = Decimal(tokens[0])
    b = Decimal(tokens[1])
    mul = a * b
    mul_str = str(mul)
    parts = mul_str.split('.')
    print(parts[0])

if __name__ == "__main__":
    main()

