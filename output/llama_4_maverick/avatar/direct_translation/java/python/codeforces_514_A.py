
import math
x = int(input())
lst = []
while x > 0:
    r = x % 10
    if 9 - r < r:
        if x // 10 == 0 and 9 - r == 0:
            lst.append(r)
        else:
            lst.append(9 - r)
    else:
        lst.append(r)
    x = x // 10
pow = 0
newNumber = 0
for i in range(len(lst)):
    newNumber = newNumber + lst[i] * math.pow(10, pow)
    pow += 1
print(int(newNumber))

