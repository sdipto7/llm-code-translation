
import sys
import math

def getGCD(a, b):
    if b == 0:
        return a
    else:
        return getGCD(b, a % b)

def main():
    data = sys.stdin.read().split()
    n = int(data[0])
    m = int(data[1])
    a = [0] * n
    index = 2
    for i in range(n):
        a[i] = int(data[index]) // 2
        index += 1
    
    lcd = 1
    for i in range(n):
        gcd_val = getGCD(lcd, a[i])
        lcd = lcd * a[i] // gcd_val
        if lcd > m:
            print(0)
            return
    
    for i in range(n):
        if (lcd // a[i]) % 2 == 0:
            print(0)
            return
    
    result = (m // lcd + 1) // 2
    print(result)

if __name__ == "__main__":
    main()

