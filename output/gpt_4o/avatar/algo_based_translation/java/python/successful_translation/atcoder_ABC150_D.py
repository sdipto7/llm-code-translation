
import sys
from math import gcd

def main():
    input = sys.stdin.read
    data = input().split()
    
    n = int(data[0])
    m = int(data[1])
    
    a = [int(data[i + 2]) // 2 for i in range(n)]
    
    lcd = 1
    for i in range(n):
        gcd_value = gcd(lcd, a[i])
        lcd = lcd * a[i] // gcd_value
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

