
import math
import sys

def get_gcd(a, b):
    while b != 0:
        a, b = b, a % b
    return a

def main():
    import sys
    import math
    input = sys.stdin.read().split()
    n = int(input[0])
    m = int(input[1])
    a = [int(x) // 2 for x in input[2:]]

    lcd = 1
    for i in range(n):
        gcd = get_gcd(lcd, a[i])
        lcd = lcd * a[i] // gcd
        if lcd > m:
            print(0)
            return

    for i in range(n):
        if (lcd // a[i]) % 2 == 0:
            print(0)
            return

    print((m // lcd + 1) // 2)

if __name__ == "__main__":
    main()

