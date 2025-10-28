
import math

def get_gcd(a, b):
    if b == 0:
        return a
    else:
        return get_gcd(b, a % b)

def main():
    n, m = map(int, input().split())
    a = [int(input()) // 2 for _ in range(n)]
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

