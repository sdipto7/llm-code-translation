
import math
import sys

n = int(input().split()[0])
m = int(input().split()[1])
a = list(map(lambda x: int(x) // 2, input().split()))

gcd = 1
lcd = 1
for i in range(n):
    gcd = math.gcd(lcd, a[i])
    lcd = lcd * a[i] // gcd
    if lcd > m:
        print(0)
        sys.exit()

for i in range(n):
    if (lcd // a[i]) % 2 == 0:
        print(0)
        sys.exit()

print((m // lcd + 1) // 2)

