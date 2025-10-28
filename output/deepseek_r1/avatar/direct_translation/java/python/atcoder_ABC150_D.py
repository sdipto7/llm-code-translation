
import math

n, m = map(int, input().split())
a = [int(x) // 2 for x in input().split()]

lcm = 1
for num in a:
    g = math.gcd(lcm, num)
    lcm = (lcm * num) // g
    if lcm > m:
        print(0)
        exit()

for num in a:
    if (lcm // num) % 2 == 0:
        print(0)
        exit()

count = m // lcm
print((count + 1) // 2)

