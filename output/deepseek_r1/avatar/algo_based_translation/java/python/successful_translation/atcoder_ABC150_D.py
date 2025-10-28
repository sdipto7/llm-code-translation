
import sys
import math

data = list(map(int, sys.stdin.read().split()))
n, m = data[0], data[1]
a = [x // 2 for x in data[2:2+n]]

lcd = 1
for num in a:
    gcd_val = math.gcd(lcd, num)
    lcd = (lcd * num) // gcd_val
    if lcd > m:
        print(0)
        sys.exit()

for num in a:
    if (lcd // num) % 2 == 0:
        print(0)
        sys.exit()

print((m // lcd + 1) // 2)

