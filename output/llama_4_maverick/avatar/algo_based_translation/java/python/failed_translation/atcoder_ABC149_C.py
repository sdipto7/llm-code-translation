import math

x = int(input())
if x != 2 and x % 2 == 0:
    x += 1
while True:
    sqrt_num = math.sqrt(x)
    i = 3
    for i in range(3, int(sqrt_num) + 1, 2):
        if x % i == 0:
            break
    if i > sqrt_num:
        break
    x += 2
print(x)
