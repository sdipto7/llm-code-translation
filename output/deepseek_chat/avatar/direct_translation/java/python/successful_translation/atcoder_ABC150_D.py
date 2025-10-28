
import math

def main():
    n, m = map(int, input().split())
    a = [int(x) // 2 for x in input().split()]
    lcd = 1
    for num in a:
        gcd = math.gcd(lcd, num)
        lcd = lcd * num // gcd
        if lcd > m:
            print(0)
            return
    for num in a:
        if (lcd // num) % 2 == 0:
            print(0)
            return
    print((m // lcd + 1) // 2)

if __name__ == "__main__":
    main()

