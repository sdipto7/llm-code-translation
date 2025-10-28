
import math

x = int(input())
if x != 2 and x % 2 == 0:
    x += 1
while True:
    sqrt_num = math.sqrt(x)
    i = 3
    while i <= sqrt_num:
        if x % i == 0:
            break
        i += 2
    if i > sqrt_num:
        break
    x += 2
print(x)

