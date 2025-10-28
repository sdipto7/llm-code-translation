import math

q = int(input())
for _ in range(q):
    n = int(input())
    x = int(math.log(n, 2))
    x += 1
    s = - (2 ** x) + 2 + (n * (n + 1) // 2) - (2 ** x)
    print(s)
