
import sys
import math

def main():
    input = sys.stdin.readline
    n = int(input().strip())
    m = int(input().strip())
    a = [int(input().strip()) // 2 for _ in range(n)]
    lcd = 1
    for i in range(n):
        gcd = math.gcd(lcd, a[i])
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

