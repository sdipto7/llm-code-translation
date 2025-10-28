import math

n = int(input())
a = [0] * 3
for _ in range(n):
    a[0] = int(input())
    a[1] = int(input())
    a[2] = int(input())
    a.sort()
    if math.pow(a[2], 2) == math.pow(a[0], 2) + math.pow(a[1], 2):
        print("YES")
    else:
        print("NO")
