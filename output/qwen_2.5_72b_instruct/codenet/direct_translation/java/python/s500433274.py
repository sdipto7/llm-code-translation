from sys import stdin

def main():
    from decimal import Decimal
    import sys
    while True:
        try:
            a = Decimal(stdin.readline().strip())
            b = Decimal(stdin.readline().strip())
            c = max(a, b)
            if a == c and b != c:
                print("GREATER")
            elif b == c and a != c:
                print("LESS")
            else:
                print("EQUAL")
        except:
            break

main()
