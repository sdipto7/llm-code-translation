
import math

a = int(input())
b = int(input())
flag = False
for i in range(1, 100001):
    if math.floor(1.0 * i * 0.08) == a and b == math.floor(0.1 * i):
        print(i)
        flag = True
        break
if not flag:
    print(-1)

