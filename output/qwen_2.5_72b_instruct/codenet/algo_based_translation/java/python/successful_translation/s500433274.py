
import sys
from decimal import Decimal

def main():
    while True:
        try:
            a = Decimal(input().strip())
            b = Decimal(input().strip())
            c = max(a, b)
            if a == c and b != c:
                print("GREATER")
            elif b == c and a != c:
                print("LESS")
            else:
                print("EQUAL")
        except EOFError:
            break

if __name__ == "__main__":
    main()

