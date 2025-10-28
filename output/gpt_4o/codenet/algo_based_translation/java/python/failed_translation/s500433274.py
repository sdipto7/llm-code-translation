
import sys

def main():
    import operator
    from decimal import Decimal

    for line in sys.stdin:
        numbers = line.split()
        a = Decimal(numbers[0])
        b = Decimal(numbers[1])
        c = max(a, b, key=operator.attrgetter('real'))
        
        if a == c and b != c:
            print("GREATER")
        elif b == c and a != c:
            print("LESS")
        else:
            print("EQUAL")

if __name__ == "__main__":
    main()

