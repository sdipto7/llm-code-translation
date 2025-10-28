
from decimal import Decimal

def main():
    input_line = input().strip()
    tokens = input_line.split()
    a = Decimal(tokens[0])
    b = Decimal(tokens[1])
    mul = a * b
    result = str(mul).split('.')[0]
    print(result)

if __name__ == "__main__":
    main()

